package com.musalasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musalasoft.dto.DroneDTO;
import com.musalasoft.repository.DroneRepository;

@Service
public class DroneService implements IDroneService{

	public DroneRepository droneRepository;
	
	@Autowired
	public DroneService(DroneRepository droneRepository) {
		this.droneRepository = droneRepository;
	}
	
	@Override
	public void createDrone(DroneDTO request) {
		droneRepository.saveDrone(request.getSerialNumber(), request.getModel(), 
				request.getWeight(), request.getBattery(), request.getState());
	}

}
