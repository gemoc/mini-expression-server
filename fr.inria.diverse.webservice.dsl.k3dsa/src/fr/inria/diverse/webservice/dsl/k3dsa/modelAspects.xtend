package fr.inria.diverse.webservice.dsl.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.webservice.dsl.model.App
import fr.inria.diverse.webservice.dsl.model.Param
import fr.inria.diverse.webservice.dsl.model.User
import java.util.List
import org.eclipse.gemoc.executionframework.engine.annotations.EventEmitter
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler

import static extension fr.inria.diverse.webservice.dsl.k3dsa.UserAspect.*
import static extension fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspect.*
import java.util.HashMap
import java.util.Map
import java.util.Date
import fr.inria.diverse.webservice.dsl.model.Service
import java.util.concurrent.ThreadLocalRandom
import com.vdurmont.emoji.EmojiManager

@Aspect(className=User)
class UserAspect {
	public var String token
}

@Aspect(className=Service)
class ServiceAspect {
	@Step
	public def Object execute(List<Param> parameters) {
		val fqn = _self.fqn
		if (fqn !== null) {
			val i = fqn.lastIndexOf('.')
			if (i != -1) {
				val classFqn = fqn.substring(0, i)
				val methodName = fqn.substring(i + 1)
				try {
					val c = Class.forName(classFqn)
					val m = c.methods.findFirst[name == methodName]
					if (m !== null) {
						return m.invoke(null, parameters.map[value])
					}
				} catch (Exception e) {}
			}
		}
		return null
	}
}

@Aspect(className=App)
class AppAspect {
	
	private val Map<User, Long> timestamps = new HashMap
	private val long authTime = 60 * 1000 //milliseconds
	private val List<String> es = EmojiManager::getAll.map[unicode].toList
	
	@Step
	@EventHandler
	def void auth(String login, String password) {
		_self.updateTimestamps
		val usr = _self.users.findFirst[name == login]
		if (usr !== null && usr.password == password) {
			val numberOfElements = 200;
            val rand = ThreadLocalRandom.current();
            val sb = new StringBuilder();
            for (var i = 0; i < numberOfElements; i++) {
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
		if (s !== null && s.allowedUsers.map[token].contains(token)) {
			val result = s.execute(params)
			if (result !== null) {
				result(_self, result.toString)
			} else {
				result(_self, "error")
			}
		} else {
			result(_self, "error")
		}
	}
	
	private def void updateTimestamps() {
		val time = (new Date).time
		_self.timestamps.forEach[usr, t|
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
