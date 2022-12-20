package com.insuranceapp.service;

import java.util.List;

import com.insuranceapp.entities.Plan;

public interface PlanService {
	
	public List<Plan> findByNameandId();
	
	public List<Plan> findById();

}
