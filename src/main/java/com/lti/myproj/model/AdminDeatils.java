package com.lti.myproj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AdminDetails")
public class AdminDeatils {
	
	@Id
	@Column(name = "adminEmail")
	private String adminEmail;
	
	@Column(name = "adminPass")
	private String adminPass;

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	public AdminDeatils(String adminEmail, String adminPass) {
		super();
		this.adminEmail = adminEmail;
		this.adminPass = adminPass;
	}

	public AdminDeatils() {
	
	}

	@Override
	public String toString() {
		return "AdminDeatils [adminEmail=" + adminEmail + ", adminPass=" + adminPass + "]";
	}
	
	
	
	

}
