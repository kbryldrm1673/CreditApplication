package com.credit.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.credit.springboot.service.AdminService;
import com.credit.springboot.web.dto.AdminRegistrationDTO;

@Controller
@RequestMapping("/registration")
public class AdminRegistrationController {
	
	@Autowired
	private AdminService adminService;

	public AdminRegistrationController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@ModelAttribute("admin")
	public AdminRegistrationDTO adminRegistrationDTO() {
		return new AdminRegistrationDTO();
		
	}

	@GetMapping
	public String showRegistrationForm(){		
		return "registration";
	}
	
	@PostMapping
	public String registerAdmin(@ModelAttribute("admin") AdminRegistrationDTO registrationDto) {
		adminService.save(registrationDto);
		
		return "redirect:/registration?success";
		
	}
	
	
}
