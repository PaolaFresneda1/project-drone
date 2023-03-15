package com.musalasoft.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.musalasoft.models.Drone;

public interface DroneRepository extends CrudRepository<Drone, String>{
	
	@Modifying
	@Query("insert into drone (serial_number, model, weight, battery, state) values (:serial_number, :model, :weight, :battery, :state)")
	void saveDrone(@Param("serial_number") String serialNumber, @Param("model") String model, @Param("weight") Long weight,
			@Param("battery") String battery, @Param("state") String state);

}
