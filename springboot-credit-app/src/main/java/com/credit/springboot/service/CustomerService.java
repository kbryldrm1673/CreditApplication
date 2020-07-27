package com.credit.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import com.credit.springboot.model.Customer;

public interface CustomerService {

	List<Customer> getAllPersonalInfo();

	void saveCustomerPersonelInfo(Customer customer);

	Page<Customer> findPaginated(int pageNo, int pageSize);

	
}
