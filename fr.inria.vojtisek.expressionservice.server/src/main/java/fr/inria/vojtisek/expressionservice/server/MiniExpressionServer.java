package fr.inria.vojtisek.expressionservice.server;

import static spark.Spark.*;

import java.security.Key;
import java.util.HashSet;

import com.google.gson.Gson;

import fr.inria.vojtisek.expressionservice.server.json.ComputeRequest;
import fr.inria.vojtisek.expressionservice.server.json.LoginResponse;
import fr.inria.vojtisek.expressionservice.server.json.ResultResponse;
import fr.inria.vojtisek.expressionservice.server.json.UserLoginRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class MiniExpressionServer {

	static HashSet<String> allowedTokens = new HashSet<>(); 
	
	public static void main(String[] args) {
		port(8080);
		
		get("/hello", (req, res) -> "Hello DiverSE");

		post("/login", (request, response) -> {
		    response.type("application/json");
		    UserLoginRequest user = new Gson().fromJson(request.body(), UserLoginRequest.class);
		    if(user.getLogin() == null || user.getPass() == null){
		    	return new Gson()
			  		      .toJson(new LoginResponse("", "invalid request. A valid request should look like: {" + 
			  		      		"  \"login\":\"yourlogin\"," + 
			  		      		"  \"pass\":\"yourpass\"" + 
			  		      		"}"));
		    }
		    if(user.getLogin().equals("admin") && user.getPass().equals("admin")){
		    	
		    	Key key = MacProvider.generateKey();

		    	String compactJws = Jwts.builder()
		    	  .setSubject("Joe")
		    	  .signWith(SignatureAlgorithm.HS512, key)
		    	  .compact();
		    	allowedTokens.add(compactJws);
		    	
		    	return new Gson()
		  		      .toJson(new LoginResponse(compactJws));
		    } else {
		    	return new Gson()
			  		      .toJson(new LoginResponse("", "invalid login and password"));
		    	
		    }
		 
		    
		});
		post("/compute", (request, response) -> {
		    response.type("application/json");
		 	ComputeRequest compRequest = new Gson().fromJson(request.body(), ComputeRequest.class);
		 
		 	if(compRequest.getToken() == null || compRequest.getExpression() == null) {
		 		return new Gson()
		 			      .toJson(new ResultResponse("invalid request. A valid request should look like: {" + 
				  		      		"  \"token\":\"aValidToken\"," + 
				  		      		"  \"expression\":\"yourexprssion\"" + 
				  		      		"}"));
		 	}
		    if(!allowedTokens.contains(compRequest.getToken())) {
		    	return new Gson()
		 			      .toJson(new ResultResponse("invalid token."));
		    }
		    return new Gson()
		      .toJson(new ResultResponse("42"));
		});
	}

}
