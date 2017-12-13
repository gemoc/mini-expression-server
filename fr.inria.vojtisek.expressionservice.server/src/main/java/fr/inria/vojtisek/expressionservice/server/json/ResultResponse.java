package fr.inria.vojtisek.expressionservice.server.json;

public class ResultResponse {

	private String result;

	public ResultResponse(String result) {
		this.setResult(result);
	}

	// getters and setters
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
