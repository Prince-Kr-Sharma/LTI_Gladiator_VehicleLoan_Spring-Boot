package com.lti.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myproj.model.AdminDeatils;

@Repository
public interface AdminRepository extends JpaRepository<AdminDeatils, Integer> {

}
