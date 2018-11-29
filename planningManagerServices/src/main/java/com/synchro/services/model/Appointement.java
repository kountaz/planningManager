package com.synchro.services.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "appointement")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Appointement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private long id;
	
	@Column(name = "customerId")
	@JsonProperty("customerId")
	private long customerId;
	
	@Column(name = "professionalId")
	@JsonProperty("professionalId")
	private long professionalId;
	
	@Column(name = "startDate")
	@JsonProperty("startDate")
	private Date startDate;
	
	@Column(name = "endDate")
	@JsonProperty("endDate")
	private Date endDate;

	public Appointement() {
		super();
	}

	public Appointement(long id, long customerId, long professionalId) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.professionalId = professionalId;
		this.startDate = new Date();
		this.endDate = new Date();
	}
}
