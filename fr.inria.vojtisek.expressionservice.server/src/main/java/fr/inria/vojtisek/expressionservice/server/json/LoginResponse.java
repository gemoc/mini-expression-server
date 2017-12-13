package fr.inria.vojtisek.expressionservice.server.json;

public class LoginResponse {

	private String token;
	private String fault;

	public LoginResponse(String token) {
		this.setToken(token);
	}	
	public LoginResponse(String token, String fault) {
		this.setToken(token);
		this.setFault(fault);
	}

	// getters and setters
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getFault() {
		return fault;
	}
	public void setFault(String fault) {
		this.fault = fault;
	}


}
