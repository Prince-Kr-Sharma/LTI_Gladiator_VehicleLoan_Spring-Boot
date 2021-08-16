package com.lti.myproj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myproj.model.PersonalDetails;
import com.lti.myproj.repository.PersonalDetailsRepository;

@Service
@Transactional
public class PersonalDetailsServiceImpl implements PersonalDetailsService
{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	PersonalDetailsRepository personalDetailsRepo;

	@Override
	public List<PersonalDetails> getPersonalDetails() {
		// TODO Auto-generated method stub
		return personalDetailsRepo.findAll();
	}

	@Override
	@Transactional
	public boolean addPersonalDetails(PersonalDetails personalDetails) {
		personalDetailsRepo.save(personalDetails);
//		em.persist(bankdetails);
		return true;
	}

	
	
	
	
	
}



