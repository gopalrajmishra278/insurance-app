package com.usermanagementapp.bindings;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COUNTRY_MASTER")
public class Country {
	@Id
	private int COUNTRY_ID;
	private String COUNTRY_NAME;
	

}
