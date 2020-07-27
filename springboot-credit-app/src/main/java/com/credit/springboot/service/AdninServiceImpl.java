package com.credit.springboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.credit.sprinboot.web.dto.AdminRegistrationDTO;
import com.credit.springboot.model.Admin;
import com.credit.springboot.model.Role;
import com.credit.springboot.repository.AdminRepository;

@Service
public class AdninServiceImpl implements AdminService {
	
	private AdminRepository adminRepository; 
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	public AdninServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}


	@Override
	public Admin save(AdminRegistrationDTO registrationDto) {
		
		Admin admin =new Admin(registrationDto.getFirstName(),
				               registrationDto.getLastName(),
				               registrationDto.getEmail(),
				               registrationDto.getPassword(),
				               Arrays.asList(new Role("ROLE_ADMİN")));
				
		
		return adminRepository.save(admin);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Admin admin= adminRepository.findByEmail(username);
		
		if(admin==null) {
			throw new UsernameNotFoundException("boş");
		}
		return new org.springframework.security.core.userdetails.User(admin.getEmail(), admin.getPassword(), null);		
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	

}
