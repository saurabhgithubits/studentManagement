package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false, unique = true)
	private String number;
	
	@OneToOne(mappedBy = "passport")
	private Student student;

}
