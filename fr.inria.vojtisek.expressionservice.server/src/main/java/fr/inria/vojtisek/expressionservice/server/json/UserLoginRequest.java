package fr.inria.vojtisek.expressionservice.server.json;

public class UserLoginRequest {
	private String login = "";
	private String pass = "";

	public UserLoginRequest(String login, String pass) {
		super();
		this.setLogin(login);
		this.setPass(pass);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;		
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
