package com.credit.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.credit.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
