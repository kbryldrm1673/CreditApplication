package com.credit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credit.springboot.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
