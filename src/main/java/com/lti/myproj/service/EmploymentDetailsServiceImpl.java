package com.lti.myproj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myproj.model.EmploymentDetails;
import com.lti.myproj.repository.EmploymentDetailsRepository;

@Service
@Transactional
public class EmploymentDetailsServiceImpl implements EmploymentDetailsService
{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	EmploymentDetailsRepository employmentDetailsRepo;

	@Override
	public List<EmploymentDetails> getEmploymentDetails() {
		// TODO Auto-generated method stub
		return employmentDetailsRepo.findAll();
	}

	@Override
	@Transactional
	public boolean addEmploymentDetails(EmploymentDetails employmentDetails) {
		employmentDetailsRepo.save(employmentDetails);
//		em.persist(bankdetails);
		return true;
	}

	
	
	
	
	
}



