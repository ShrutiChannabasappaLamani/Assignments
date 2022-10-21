package com.valtech.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Customer;
import com.valtech.account.service.CustomerService;


@RestController
public class CustomerRestController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("api/cu")
	public Customer createCustomer(Customer cu) {
		return customerService.createCustomer(cu);
	}
	@PutMapping("/api/cu/{id}")
	public Customer updateCustomer(Customer cu) {
		return customerService.updateCustomer(cu);
	}
	@GetMapping("/api/cu/{id}")
	public Customer getCustomer(long id) {
		return customerService.getCustomer(id);
	}
	@GetMapping("/api/cu")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
	
}

