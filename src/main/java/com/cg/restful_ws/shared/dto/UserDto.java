package com.cg.restful_ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private static final long serialVersionUID = -5010548935101115901L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String encryptedPassword;
	private String emailVerifcationToken;
	private Boolean emailVerifcationStatus = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	public String getEmailVerifcationToken() {
		return emailVerifcationToken;
	}

	public void setEmailVerifcationToken(String emailVerifcationToken) {
		this.emailVerifcationToken = emailVerifcationToken;
	}

	public Boolean getEmailVerifcationStatus() {
		return emailVerifcationStatus;
	}

	public void setEmailVerifcationStatus(Boolean emailVerifcationStatus) {
		this.emailVerifcationStatus = emailVerifcationStatus;
	}

}
