package com.aussie.kangaroo.model;

public class User {

	private String name;
	private String mobile;
	private String email;
	private String password;
	public String getUserName() {
		return name;
	}
	public void setUserName(String userName) {
		name = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
