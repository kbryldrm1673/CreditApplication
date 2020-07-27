package com.credit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credit.springboot.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findByEmail(String email);
	
	

}
