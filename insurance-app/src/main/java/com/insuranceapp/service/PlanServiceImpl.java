package com.insuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.insuranceapp.entities.Customer;
import com.insuranceapp.entities.Plan;
import com.insuranceapp.repositories.CustomerRepository;

public class PlanServiceImpl implements PlanService {
	
	@Autowired
	CustomerRepository repo;

	@Override
	public List<Plan> findByNameandId() {
		
	   String status= repo.findByNameContainingAndUser(PlanName, plan);
	 
	    return status;
		
	}

	@Override
	public List<Plan> findById() {
		
		return repo.findById(PlanId);
	}
	
	
	

}
