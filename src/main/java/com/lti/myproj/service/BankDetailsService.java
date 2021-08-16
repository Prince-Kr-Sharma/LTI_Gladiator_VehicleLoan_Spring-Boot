package com.lti.myproj.service;

import java.util.List;

import com.lti.myproj.model.BankDetails;

public interface BankDetailsService 
{
		public List<BankDetails> getBankDetails();
		public boolean addBankDetails(BankDetails bankdetails);
		
	
}
