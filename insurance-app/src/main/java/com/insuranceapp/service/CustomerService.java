package com.insuranceapp.service;

import java.util.List;

import com.insuranceapp.entities.Customer;

public interface CustomerService {
	
	public List<Customer> findByNameandId();
		
	public List<Customer> findById();
	
	
	
	
	

}
