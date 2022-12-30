package com.usermanagementapp.bindings;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER_DETAILS")
public class UserRegistration {
	@Id
	private Integer USER_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private String DOB;
	private String GENDER;
	private Map<Integer,String> COUNTRY;
	private Map<Integer,String> STATE;
	private Map<Integer,String> CITY;
	private String PASSWORD;
	private String ACCOUNT_STATUS;
	
	
	

}
