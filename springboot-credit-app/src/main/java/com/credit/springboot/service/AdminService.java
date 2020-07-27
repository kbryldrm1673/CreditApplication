package com.credit.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.credit.springboot.model.Admin;
import com.credit.springboot.web.dto.AdminRegistrationDTO;

public interface AdminService extends UserDetailsService {
	
	Admin save(AdminRegistrationDTO registrationDto);

}
