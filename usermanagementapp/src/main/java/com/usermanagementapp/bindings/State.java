package com.usermanagementapp.bindings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STATE_MASTER")
public class State {
	@Id
	private Integer STATE_ID;
	private String STATE_NAME;

}
