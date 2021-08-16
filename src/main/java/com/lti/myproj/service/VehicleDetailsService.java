package com.lti.myproj.service;

import java.util.List;

import com.lti.myproj.model.VehicleDetails;

public interface VehicleDetailsService 
{
		public List<VehicleDetails> getVehicleDetails();
		public boolean addVehicleDetails(VehicleDetails vehicleDetails);
		
	
}
