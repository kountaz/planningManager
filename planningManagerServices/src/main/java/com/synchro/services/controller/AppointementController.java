package com.synchro.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synchro.services.model.Appointement;
import com.synchro.services.repositories.AppointementRepository;

@RestController
public class AppointementController {

	@Autowired
	AppointementRepository appointementRepository;
	
	@RequestMapping("/appointement/save")
	public Appointement saveAppointement(@RequestBody Appointement appointement){
		return appointementRepository.save(appointement);
	}
	
	@RequestMapping("/appointement/findAll")
	public List<Appointement> findAllAppointement(){
		return appointementRepository.findAll();
	}
}
