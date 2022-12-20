package com.insuranceapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_DETAILS")
public class Customer {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer customerId;
	 private String customerName;
	 private String customerEmail;
	 private Long customerMobNum;
	 private String gender;
	 private Long ssn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
