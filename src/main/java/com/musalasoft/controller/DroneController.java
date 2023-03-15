package com.musalasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musalasoft.dto.DroneDTO;
import com.musalasoft.service.IDroneService;

/**
 * Clase controladora que expone los metodos correspondientes al servicio
 * drone
 * 
 * @author Paola Fresneda 
 */
@RestController
@RequestMapping(value = "/drone")
public class DroneController {
	
	public IDroneService droneService;
	
	@Autowired
	public DroneController (IDroneService droneService) {
		this.droneService = droneService;
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "createDrone", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createDrone(@RequestBody DroneDTO drone) {
		droneService.createDrone(drone);
	}

}
