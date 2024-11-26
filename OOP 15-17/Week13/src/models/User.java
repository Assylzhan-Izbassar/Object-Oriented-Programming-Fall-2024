package models;

import java.io.Serializable;

public abstract class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userId = 0;
	private String username;
	private String password;
	
	{
		this.userId++;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.setPassword(password);
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return this.username;
	}
	
}
