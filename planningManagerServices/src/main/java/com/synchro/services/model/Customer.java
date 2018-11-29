package com.synchro.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "customer")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer implements Serializable {

	private static final long serialVersionUID = 4085075813962214650L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private long id;
	
	@Column(name = "firstname")
	@JsonProperty("firstName")
	private String firstName;
 
	@Column(name = "lastname")
	@JsonProperty("lastName")
	private String lastName;
	
	public Customer(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}
