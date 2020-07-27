package com.credit.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.credit.sprinboot.web.dto.AdminRegistrationDTO;
import com.credit.springboot.model.Admin;

public interface AdminService extends UserDetailsService {
	
	Admin save(AdminRegistrationDTO registrationDto);

}
