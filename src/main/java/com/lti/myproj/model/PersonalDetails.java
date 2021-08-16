package com.lti.myproj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "personal_details")
public class PersonalDetails {

	public PersonalDetails() {
		super();
	}

	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BANKID")
//	@SequenceGenerator(name = "BANKID" , sequenceName = "BANK_ID_SEQ" , allocationSize = 1)
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "GENDER")
	private String gender;

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;

	public PersonalDetails(int customerId, String firstName, int age, String gender, String email, String mobile,
			String city, String state) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
