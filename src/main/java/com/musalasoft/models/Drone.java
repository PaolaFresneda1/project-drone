package com.musalasoft.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("drone")
public class Drone {

	@Id
	@Column("serial_number")
	private String serialNumber;
	
	@Column("model")
	private String model;
	
	@Column("weight")
	private Long weight;
	
	@Column("battery")
	private String battery;
	
	@Column("state")
	private String state;
}
