package cs320.sessions.login;

public class SessionsUser {

	private String first;
	private String last;
	private String email;
	private String password;
	
	public SessionsUser(String first, String last, String email, String password) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
		this.password = password;
		
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
}
