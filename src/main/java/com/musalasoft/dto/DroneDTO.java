package com.musalasoft.dto;

import com.musalasoft.models.Drone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DroneDTO {
	
	private String serialNumber;
	private String model;
	private Long weight;
	private String battery;
	private String state;

}
