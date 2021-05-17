package com.sapient.entity;

import java.time.LocalDate;

import javax.persistence.Transient;

public class Profile {
	private String userId;
	private String email;
	@Transient
	private String password;
	private String name;
	private LocalDate dob;

	public Profile() {

	}

	public Profile(String userId, String email, String password, String name, LocalDate dob) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.dob = dob;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Profile [userId=" + userId + ", email=" + email + ", password=" + password + ", name=" + name + ", dob="
				+ dob + "]";
	}

}
