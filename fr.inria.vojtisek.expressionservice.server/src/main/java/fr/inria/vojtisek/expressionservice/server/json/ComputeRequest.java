package fr.inria.vojtisek.expressionservice.server.json;

public class ComputeRequest {
	private String token;
	private String expression;
	

	public ComputeRequest(String token, String expression) {
		super();
		this.token = token;
		this.expression = expression;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
}
