package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	@Column
	@Size(max=10,min=5,message = "Criteria not met")
	private String firstName;
	
	@Column
	@Size(max=10,min=5,message = "Criteria not met")
	private String lastName;
	
	@OneToOne
	private Passport passport;
	
	@Max(value = 10)
	private long mobileNo;
	
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String Email;
	
	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE", 
		joinColumns = @JoinColumn(name="STUDENT_ID"), 
		inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
	private List<Course> courses = new ArrayList<>();



}
