package com.ejemplo.crud.model;

public class Usuario {
	
	private int id;
	
	private String username;
	private String password;
	private String fullname;
	private String email;
	
	
	public Usuario(String username, String password, String fullname, String email) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
	}


	
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
