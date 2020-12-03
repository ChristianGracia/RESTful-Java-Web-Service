package com.cg.restful_ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -5010548935101115901L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private String userId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String encryptedPassword;
	private String emailVerificationToken;;
	private String emailVerificationStatus;
	
	
	
	
	
	

}
