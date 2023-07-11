package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Review {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private String rating;

	@Column(nullable = false)
	private String description;
	
	@ManyToOne
	private Course course;
}
