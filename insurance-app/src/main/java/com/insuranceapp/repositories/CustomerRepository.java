package com.insuranceapp.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceapp.entities.Customer;

public interface CustomerRepository extends JpaRepository{
	
	public List<Customer> findByNameContainingAndUser(String name, Customer customer);
	
	
	
	
	
	

}
