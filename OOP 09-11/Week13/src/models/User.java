package models;

public abstract class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
