package com.lti.myproj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myproj.model.IdentityDetails;
import com.lti.myproj.repository.IdentityDetailsRepository;

@Service
@Transactional
public class IdentityDetailsServiceImpl implements IdentityDetailsService
{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	IdentityDetailsRepository identityRepo;

	@Override
	public List<IdentityDetails> getIdentityDetails() {
		// TODO Auto-generated method stub
		return identityRepo.findAll();
	}

	@Override
	@Transactional
	public boolean addIdentityDetails(IdentityDetails identitydetails) {
		identityRepo.save(identitydetails);
//		em.persist(bankdetails);
		return true;
	}

	
	
	
	
	
}



