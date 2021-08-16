package com.lti.myproj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "vehicle_details")
public class VehicleDetails {

	public VehicleDetails() {
		super();
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BANKID")
//	@SequenceGenerator(name = "BANKID" , sequenceName = "BANK_ID_SEQ" , allocationSize = 1)
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "CAR_MAKE")
	private String carMake;
	
	@Column(name = "CAR_MODEL")
	private String carModel;
	
	@Column(name = "EX_SHOWROOM_PRICE")
	private int exShowroomPrice;

	
	
	public VehicleDetails(int customerId, String carMake, String carModel, int exShowroomPrice) {
		super();
		this.customerId = customerId;
		this.carMake = carMake;
		this.carModel = carModel;
		this.exShowroomPrice = exShowroomPrice;
		
	}
	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCarMake() {
		return carMake;
	}



	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}



	public String getCarModel() {
		return carModel;
	}



	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}



	public int getExShowroomPrice() {
		return exShowroomPrice;
	}



	public void setExShowroomPrice(int exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}





	


	

	


	


}
