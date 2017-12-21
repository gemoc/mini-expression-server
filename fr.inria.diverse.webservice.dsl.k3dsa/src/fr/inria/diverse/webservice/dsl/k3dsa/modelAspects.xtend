package fr.inria.diverse.webservice.dsl.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.webservice.dsl.model.App
import fr.inria.diverse.webservice.dsl.model.Param
import fr.inria.diverse.webservice.dsl.model.Service
import fr.inria.diverse.webservice.dsl.model.User
import java.lang.reflect.Modifier
import java.util.Date
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.concurrent.ThreadLocalRandom
import org.eclipse.core.runtime.Platform
import org.eclipse.gemoc.executionframework.engine.annotations.EventEmitter
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler

import static extension fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspect.*
import static extension fr.inria.diverse.webservice.dsl.k3dsa.UserAspect.*

@Aspect(className=User)
class UserAspect {
	public var String token
}

@Aspect(className=Service)
class ServiceAspect {

	private var Object service

	@Step
	public def Object execute(List<Param> parameters) {
		if (_self.acceptedParams.containsAll(parameters.map[name])) {
			val params = _self.acceptedParams.map[p|
				parameters.findFirst[p == name].value
			]
			val methodName = _self.methodName
			if (methodName !== null) {
				if (_self.service === null) {
					val confElt = Platform.extensionRegistry.getConfigurationElementsFor(
						"org.gemoc.diverseminar2017.service").findFirst[getAttribute("name") == _self.name]
					_self.service = confElt.createExecutableExtension("class")
				}
				try {
					val c = _self.service.class
					val m = c.methods.findFirst[name == methodName]
					if (m !== null) {
						if (Modifier.isStatic(m.modifiers)) {
							return m.invoke(null, params.toArray)
						} else {
							return m.invoke(_self.service, params.toArray)
						}
					}
				} catch (Exception e) {
					e.printStackTrace
				}
			}
		}
		return null
	}
}

@Aspect(className=App)
class AppAspect {

	private val Map<User, Long> timestamps = new HashMap
	private val long authTime = 60 * 1000 // milliseconds
	private val List<String> es = #["a", "b", "c"]
	private val int tokenLength = 20

	@Step
	@EventHandler
	def void auth(String login, String password) {
		_self.updateTimestamps
		val usr = _self.users.findFirst[name == login]
		if (usr !== null && usr.password == password) {
			val rand = ThreadLocalRandom.current();
			val sb = new StringBuilder();
			for (var i = 0; i < _self.tokenLength; i++) {
				val randomIndex = rand.nextInt(_self.es.size());
				sb.append(_self.es.get(randomIndex));
			}
			val token = sb.toString();

			usr.token = token
			_self.timestamps.put(usr, (new Date).time)
			authSuccess(_self, token)
		} else {
			authFailure(_self)
		}
	}

	@Step
	@EventHandler
	def void service(String token, String service, List<Param> params) {
		_self.updateTimestamps
		val s = _self.services.findFirst[name == service]
		if (_self.users.map[it.token].contains(token)) {
			if (s !== null) {
				if (s.allowedUsers.map[it.token].contains(token)) {
					val result = s.execute(params)
					if (result !== null) {
						result(_self, result.toString)
					} else {
						result(_self, "service error")
					}
				} else {
					result(_self, "unauthorized user")
				}
			} else {
				result(_self, "unknown service")
			}
		} else {
			result(_self, "unknown token")
		}
	}

	private def void updateTimestamps() {
		val time = (new Date).time
		_self.timestamps.forEach [ usr, t |
			if (time - t > _self.authTime) {
				usr.token = ""
			}
		]
	}

	@Step
	@EventEmitter
	def void authSuccess(String token) {}

	@Step
	@EventEmitter
	def void authFailure() {}

	@Step
	@EventEmitter
	def void result(String result) {}
}
