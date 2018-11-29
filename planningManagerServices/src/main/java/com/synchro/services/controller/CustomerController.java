package com.synchro.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.synchro.services.model.Customer;
import com.synchro.services.repositories.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping("/customer/save")
	public Customer saveCustomer(@RequestBody Customer customer){
		return repository.save(customer);
	}
	
	@RequestMapping("/customer/findByLastName")
	public List<Customer> saveCustomer(@RequestParam String lastName){
		return repository.findByLastName(lastName);
	}
	
	@RequestMapping("/customer/findAll")
	public List<Customer> findAllCustomer(){
		return repository.findAll();
	}
}
