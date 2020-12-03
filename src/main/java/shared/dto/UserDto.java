package shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	
	private static long serialVersionUID = 1L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String encryptedPassword;
	private Boolean emailVerifcationStatus;
	
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
	public Boolean getEmailVerifcationStatus() {
		return emailVerifcationStatus;
	}
	public void setEmailVerifcationStatus(Boolean emailVerifcationStatus) {
		this.emailVerifcationStatus = emailVerifcationStatus;
	}

}