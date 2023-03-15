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
@Table("medicine")
public class Medicine {

	@Id
	@Column("name")
	private String name;
	
	@Column("weight")
	private Long weight;
	
	@Column("code")
	private String code;
	
	@Column("image")
	private String image;
}
