package org.gemoc.diverseseminar2017.genericserver;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.executionframework.event.manager.IEventEmitter;
import org.eclipse.gemoc.executionframework.event.manager.IEventManager;
import org.eclipse.gemoc.executionframework.event.manager.IEventManagerListener;
import org.eclipse.gemoc.executionframework.event.model.event.Event;

import com.google.gson.Gson;

import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthFailureEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppAuthSuccessEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppResultEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.AppServiceEvent;
import fr.inria.diverse.webservice.dsl.event.webserviceevent.WebserviceeventFactory;
import fr.inria.diverse.webservice.dsl.model.App;
import fr.inria.diverse.webservice.dsl.model.ModelFactory;
import fr.inria.diverse.webservice.dsl.model.Param;

public class GenericServer implements IEventManagerListener, IEventEmitter {

	TransferQueue<Event> receivedEvents = new LinkedTransferQueue<Event>();

	IEventManager eventManager;
	App app;

	@Override
	public void setEventManager(IEventManager eventManager, Resource executedModel) {
		this.eventManager = eventManager;
		this.app = (App) executedModel.getContents().get(0);
		eventManager.addListener(this);
		Thread t = new Thread(() -> start());
		t.start();
	}

	@Override
	public void eventReceived(Event event) {
		try {
			receivedEvents.put(event);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() {
		port(8080);

		post("/*", (request, response) -> {

			// Get path
			String path = request.pathInfo().substring(1);

			// Parse Json into a Map
			@SuppressWarnings("unchecked")
			Map<String, String> jsonJavaRootObject = new Gson().fromJson(request.body(), Map.class);

			// If any, get the given token and remove it from the map
			String token = jsonJavaRootObject.get("token");
			jsonJavaRootObject.remove("token");

			// Prepare result
			Map<String, String> result = new HashMap<String, String>();

			// Case not login (thus service call)
			if (!path.equals("login")) {

				// Create service call event
				AppServiceEvent appServiceEvent = WebserviceeventFactory.eINSTANCE.createAppServiceEvent();
				appServiceEvent.setApp(app);
				appServiceEvent.setService(path);
				appServiceEvent.setToken(token);
				for (String paramName : jsonJavaRootObject.keySet()) {
					Param param = ModelFactory.eINSTANCE.createParam();
					String paramValue = jsonJavaRootObject.get(paramName);
					param.setName(paramName);
					param.setName(paramValue);
					appServiceEvent.getParams().add(param);
				}

				// Send event
				eventManager.queueEvent(appServiceEvent);

				// Receive answer
				Event receivedEvent = receivedEvents.take();

				if (receivedEvent instanceof AppResultEvent) {
					AppResultEvent receivedEvent_cast = (AppResultEvent) receivedEvent;
					String serviceResult = receivedEvent_cast.getResult();
					String valueForJson = null;
					try {
						Number numberResult = NumberFormat.getInstance().parse(serviceResult);
						valueForJson = numberResult.toString();
					} catch (ParseException e) {
						if (result.equals("true")) {
							valueForJson = "true";
						} else if (result.equals("false")) {
							valueForJson = "false";
						} else {
							valueForJson = "\"" + result + "\"";
						}
					}
					result.put("result", valueForJson);
				}

			}
			// Case authentification
			else {

				// Read json
				String userName = jsonJavaRootObject.get("login");
				String password = jsonJavaRootObject.get("pass");

				// Create and queue auth event
				AppAuthEvent appAuthEvent = WebserviceeventFactory.eINSTANCE.createAppAuthEvent();
				appAuthEvent.setApp(app);
				appAuthEvent.setLogin(userName);
				appAuthEvent.setPassword(password);
				eventManager.queueEvent(appAuthEvent);

				// Wait until response, send response json to user
				Event receivedEvent = receivedEvents.take();
				if (receivedEvent instanceof AppAuthSuccessEvent) {
					AppAuthSuccessEvent receivedEvent_cast = (AppAuthSuccessEvent) receivedEvent;
					String generatedToken = receivedEvent_cast.getToken();
					result.put("token", generatedToken);
				} else if (receivedEvent instanceof AppAuthFailureEvent) {
					result.put("fault", "invalid login and password");
				}
				return new Gson().toJson(result);
			}
			return new Gson().toJson(result);

		});

		get("/hello", (req, res) -> "Hello DiverSE");
	}

}
