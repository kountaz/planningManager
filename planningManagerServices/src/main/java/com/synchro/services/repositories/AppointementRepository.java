package com.synchro.services.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.synchro.services.model.Appointement;

public interface AppointementRepository extends CrudRepository<Appointement, Long>{
	
	Appointement save(Appointement appointement);
	
	List<Appointement> findAll();
	
}
