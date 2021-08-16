package com.lti.myproj.service;

import java.util.List;

import com.lti.myproj.model.IdentityDetails;

public interface IdentityDetailsService 
{
		public List<IdentityDetails> getIdentityDetails();
		public boolean addIdentityDetails(IdentityDetails identityDetails);
		
	
}
