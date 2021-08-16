package com.lti.myproj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myproj.model.BankDetails;
import com.lti.myproj.repository.BankDetailsRepository;

@Service
@Transactional
public class BankDetailsServiceImpl implements BankDetailsService
{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	BankDetailsRepository bankRepo;

	@Override
	public List<BankDetails> getBankDetails() {
		// TODO Auto-generated method stub
		return bankRepo.findAll();
	}

	@Override
	@Transactional
	public boolean addBankDetails(BankDetails bankdetails) {
		bankRepo.save(bankdetails);
//		em.persist(bankdetails);
		return true;
	}

	
	
	
	
	
}



