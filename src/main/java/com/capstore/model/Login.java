package com.capstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	@GeneratedValue
	private int serialNo;
	
	@Column(unique=true)
	private String emailId;
	private String password;
	private UserTypes userTypes;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserTypes getUserTypes() {
		return userTypes;
	}
	public void setUserTypes(UserTypes userTypes) {
		this.userTypes = userTypes;
	}
	@Override
	public String toString() {
		return "Login [serialNo=" + serialNo + ", emailId=" + emailId + ", password=" + password + ", userTypes="
				+ userTypes + "]";
	}
	public Login(int serialNo, String emailId, String password, UserTypes userTypes) {
		super();
		this.serialNo = serialNo;
		this.emailId = emailId;
		this.password = password;
		this.userTypes = userTypes;
	}
	public Login() {
		super();
	}
}