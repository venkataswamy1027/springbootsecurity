package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Customer;
import com.rest.repository.CustomerRepository;

@RestController
public class LoginController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/user")
	public Customer getUserDetailsAfterLogin(Authentication authentication) {
		List<Customer> customers = customerRepository.findByEmail(authentication.getName());
		if (customers.size() > 0) {
			return customers.get(0);
		} else {
			return null;
		}
	}
}
