package com.credit.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credit.springboot.model.Contact;
import com.credit.springboot.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void saveCustomerContactInfo(Contact contact) {
		this.contactRepository.save(contact);
		
	}
	
	
	
	
	

}
