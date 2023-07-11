package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;

@Service
public interface studentService {

	Student addStudent(Student student);

	Student updateStudent(Student student) throws Exception;

	Student getStudentById(int id) throws Exception;

	String deleteStudent(int id) throws Exception;

	List<Student> getAllStudent();

}
