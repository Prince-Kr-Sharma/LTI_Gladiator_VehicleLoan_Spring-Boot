package com.lti.myproj.service;

import java.util.List;

import com.lti.myproj.model.EmploymentDetails;

public interface EmploymentDetailsService 
{
		public List<EmploymentDetails> getEmploymentDetails();
		public boolean addEmploymentDetails(EmploymentDetails employmentDetails);
		
	
}
