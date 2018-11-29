package com.synchro.services.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.synchro.services.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);
	Customer save(Customer customers);
	List<Customer> findAll();

}