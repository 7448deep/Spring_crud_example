package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String fName;
	private String lName;
	private String emailId;
	private long mobileNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String fName, String lName, String emailId, long mobileNo) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
