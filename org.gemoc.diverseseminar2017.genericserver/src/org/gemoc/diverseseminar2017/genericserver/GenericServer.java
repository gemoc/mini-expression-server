package org.gemoc.diverseseminar2017.genericserver;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

import org.eclipse.gemoc.executionframework.event.manager.IEventManagerListener;
import org.eclipse.gemoc.executionframework.event.model.event.Event;

import com.google.gson.Gson;

public class GenericServer implements IEventManagerListener {

	TransferQueue<Event> receivedEvents = new LinkedTransferQueue<Event>();

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

			// Parse Json into a Map
			Map<String, String> jsonJavaRootObject = new Gson().fromJson(request.body(), Map.class);

			// If any, get the given token and remove it from the map
			String token = jsonJavaRootObject.get("token");
			jsonJavaRootObject.remove("token");

			// Case token (thus service call)
			if (token != null) {
				// Get service name
				String serviceName = request.pathInfo().substring(1);

				// Get service params values
				for (String paramName : jsonJavaRootObject.keySet()) {
					String paramValue = jsonJavaRootObject.get(paramName);
					// TODO create Param object
				}

				// TODO send service event on bus

				Event receivedEvent = receivedEvents.take();
				// TODO cast + unwrap event

				Map<String, String> result = new HashMap<String, String>();
				// TODO fill result with event received from the model

				return new Gson().toJson(result);
			}
			// Case authentification
			else {
				String userName = jsonJavaRootObject.get("login");
				String password = jsonJavaRootObject.get("pass");
				
				// TODO send auth event on bus
				
				Event receivedEvent = receivedEvents.take();
				
				Map<String, String> result = new HashMap<String, String>();
				// TODO fill result with event received from the model

				return new Gson().toJson(result);
				
			}


		});

		get("/hello", (req, res) -> "Hello DiverSE");
	}

}
