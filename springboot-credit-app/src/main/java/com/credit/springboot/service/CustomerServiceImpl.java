package com.credit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.credit.springboot.model.Customer;
import com.credit.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public List<Customer> getAllPersonalInfo() {
		
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomerPersonelInfo(Customer customer) {
		this.customerRepository.save(customer);	
	}

	@Override
	public Page<Customer> findPaginated(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo-1, pageSize); 
		return this.customerRepository.findAll(pageable);
	}

	

	

	

	
	

}
