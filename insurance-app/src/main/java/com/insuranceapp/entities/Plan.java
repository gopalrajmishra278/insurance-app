package com.insuranceapp.entities;

import java.sql.Date;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PLAN_DETAILS")
public class Plan {
	
	private Integer planId;
	
	private String planName;
	
	private String planStatus;
	
	private Date planStartDate;
	
	private Date planEndDate;
	
	
}
