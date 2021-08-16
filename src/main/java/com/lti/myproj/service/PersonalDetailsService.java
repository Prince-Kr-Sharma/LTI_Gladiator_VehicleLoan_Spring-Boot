package com.lti.myproj.service;

import java.util.List;

import com.lti.myproj.model.PersonalDetails;

public interface PersonalDetailsService 
{
		public List<PersonalDetails> getPersonalDetails();
		public boolean addPersonalDetails(PersonalDetails personalDetails);
		
	
}
