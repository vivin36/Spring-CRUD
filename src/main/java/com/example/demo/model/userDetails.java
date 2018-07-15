package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userDetails {
	
	@Id
	int userId;
	String name;
	long phoneNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "userDetails [userId=" + userId + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	
	

}
