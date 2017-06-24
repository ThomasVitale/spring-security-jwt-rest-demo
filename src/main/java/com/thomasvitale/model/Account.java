package com.thomasvitale.model;

public class Account {

	private String id;
	private String username;
	private String password;
	private boolean enabled;

	public Account() {
	}

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
		this.enabled = true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
