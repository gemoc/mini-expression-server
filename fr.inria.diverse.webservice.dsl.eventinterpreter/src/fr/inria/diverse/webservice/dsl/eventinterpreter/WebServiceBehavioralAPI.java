package fr.inria.diverse.webservice.dsl.eventinterpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.executionframework.event.manager.IBehavioralAPI;
import org.eclipse.gemoc.executionframework.event.model.event.Event;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventFactory;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventPackage;
import fr.inria.diverse.webservice.dsl.k3dsa.AppAspect;
import fr.inria.diverse.webservice.dsl.model.App;
import fr.inria.diverse.webservice.dsl.model.ModelPackage;
import fr.inria.diverse.webservice.dsl.model.Param;

public class WebServiceBehavioralAPI implements IBehavioralAPI {

	private final Set<EClass> eventClasses = new HashSet<>();
	private final Set<EClass> interruptibleEventClasses = new HashSet<>();
	
	public WebServiceBehavioralAPI() {
		eventClasses.add(WebserviceeventPackage.eINSTANCE.getAppServiceEvent());
		eventClasses.add(WebserviceeventPackage.eINSTANCE.getAppAuthEvent());
	}
	
	@Override
	public boolean canSendEvent(Event _event) {
		if (_event instanceof AppServiceEvent) {
			return true;
		} else
		if (_event instanceof AppAuthEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		return eventClasses;
	}
	
	@Override
	public Set<EClass> getStartEventClasses() {
		return Collections.emptySet();
	}
	
	@Override
	public boolean isInterruptible(EClass eventClass) {
		return interruptibleEventClasses.contains(eventClass);
	}
	
	@Override
	public void dispatchEvent(Event _event) {
		if (_event instanceof AppServiceEvent) {
			handleAppServiceEvent((AppServiceEvent) _event);
		} else
		if (_event instanceof AppAuthEvent) {
			handleAppAuthEvent((AppAuthEvent) _event);
		}
	}
	
	private void handleAppServiceEvent(AppServiceEvent _event) {
		final App app = _event.getApp();
		final String token = _event.getToken();
		final String service = _event.getService();
		final List<Param> params = _event.getParams();
		AppAspect.service(app, token, service, params);
	}
	
	private void handleAppAuthEvent(AppAuthEvent _event) {
		final App app = _event.getApp();
		final String login = _event.getLogin();
		final String password = _event.getPassword();
		AppAspect.auth(app, login, password);
	}
	
	@Override
	public Event getOutputEvent(EOperation operation, EObject caller, List<Object> parameters) {
		if (operation.getName().equals("authSuccess") && caller instanceof App) {
			return getAppAuthSuccessEvent((App) caller, (String) parameters.get(0));
		} else
		if (operation.getName().equals("authFailure") && caller instanceof App) {
			return getAppAuthFailureEvent((App) caller);
		} else
		if (operation.getName().equals("result") && caller instanceof App) {
			return getAppResultEvent((App) caller, (String) parameters.get(0));
		}
		return null;
	}
	
	private Event getAppAuthSuccessEvent(App caller, String token) {
		final AppAuthSuccessEvent _event = WebserviceeventFactory.eINSTANCE.createAppAuthSuccessEvent();
		_event.setApp(caller);
		_event.setToken(token);
		return _event;
	}
	
	private Event getAppAuthFailureEvent(App caller) {
		final AppAuthFailureEvent _event = WebserviceeventFactory.eINSTANCE.createAppAuthFailureEvent();
		_event.setApp(caller);
		return _event;
	}
	
	private Event getAppResultEvent(App caller, String result) {
		final AppResultEvent _event = WebserviceeventFactory.eINSTANCE.createAppResultEvent();
		_event.setApp(caller);
		_event.setResult(result);
		return _event;
	}
	
	@Override
	public boolean canHandle(EPackage pkg) {
		return pkg == ModelPackage.eINSTANCE;
	}
	
}
