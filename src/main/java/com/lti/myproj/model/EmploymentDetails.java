package com.lti.myproj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "employment_details")
public class EmploymentDetails {

	public EmploymentDetails() {
		super();
	}

	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BANKID")
//	@SequenceGenerator(name = "BANKID" , sequenceName = "BANK_ID_SEQ" , allocationSize = 1)
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "TYPE_OF_EMPLOYMENT")
	private String typeOfEmployment;
	
	@Column(name = "ANNUAL_SALARY")
	private int annualSalary;
	
	@Column(name = "EXISTING_EMI")
	private String existingEmi;

	
	
	public EmploymentDetails(int customerId, String typeOfEmployment, int annualSalary, String existingEmi) {
		super();
		this.customerId = customerId;
		this.typeOfEmployment = typeOfEmployment;
		this.annualSalary = annualSalary;
		this.existingEmi = existingEmi;
		
	}
	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}



	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}



	public int getAnnualSalary() {
		return annualSalary;
	}



	public void setAnnualsalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}



	public String getExistingEmi() {
		return existingEmi;
	}



	public void setExistingEmi(String existingEmi) {
		this.existingEmi = existingEmi;
	}





	


	

	


	


}
