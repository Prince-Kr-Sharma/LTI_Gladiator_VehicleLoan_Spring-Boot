package com.lti.myproj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myproj.model.VehicleDetails;
import com.lti.myproj.repository.VehicleDetailsRepository;

@Service
@Transactional
public class VehicleDetailsServiceImpl implements VehicleDetailsService
{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	VehicleDetailsRepository bankRepo;

	@Override
	public List<VehicleDetails> getVehicleDetails() {
		// TODO Auto-generated method stub
		return bankRepo.findAll();
	}

	@Override
	@Transactional
	public boolean addVehicleDetails(VehicleDetails vehicledetails) {
		bankRepo.save(vehicledetails);
//		em.persist(bankdetails);
		return true;
	}

	
	
	
	
	
}



