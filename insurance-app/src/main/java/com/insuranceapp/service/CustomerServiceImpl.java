package com.insuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.entities.Customer;
import com.insuranceapp.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository repo;

	@Override
	public List<Customer> findByNameandId() {
		
	   String status= repo.findByNameContainingAndUser(customerName, Customer customer);
	 
	    return status;
		
	}

	@Override
	public List<Customer> findById() {
		
		return repo.findById();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
