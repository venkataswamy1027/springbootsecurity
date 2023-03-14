package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
