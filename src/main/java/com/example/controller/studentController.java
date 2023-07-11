package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.studentService;

@RestController
@RequestMapping("/student")
public class studentController {
	
	@Autowired
	private studentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) throws Exception {
		return studentService.updateStudent(student);
	}
	
	@GetMapping("/get/{id}")
	public Student getbStudent(@PathVariable int id) throws Exception {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@DeleteMapping("/delete/{id}")
	public Student deleStudent(@PathVariable int id ) throws Exception {
		return studentService.getStudentById(id);
	}
	

}
