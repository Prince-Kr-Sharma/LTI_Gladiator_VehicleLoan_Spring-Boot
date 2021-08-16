package com.lti.myproj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.myproj.model.IdentityDetails;

@Repository
public interface IdentityDetailsRepository extends JpaRepository<IdentityDetails, Integer>
{
	
}