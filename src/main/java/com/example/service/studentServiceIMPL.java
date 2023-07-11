package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.studentRepository;

@Service
public class studentServiceIMPL implements studentService {
	
	@Autowired
	private studentRepository repo;

	@Override
	public Student addStudent(Student student) {
		Student s = repo.save(student);
		return s;
	}

	@Override
	public Student updateStudent(Student student) throws Exception {
		Student s = repo.findById(student.getId())
				.orElseThrow(() -> new Exception("Student not found with id :" + student.getId()));
		s.setFirstName(student.getFirstName());
		s.setLastName(student.getLastName());
		s.setMobileNo(student.getMobileNo());
		s.setEmail(student.getEmail());
		return repo.save(s);
	}

	@Override
	public Student getStudentById(int id) throws Exception {
		return repo.findById(id)
				.orElseThrow(() -> new Exception("Student not found with id :" + id));
	}

	@Override
	public String deleteStudent(int id) throws Exception {
		Student s = repo.findById(id)
				.orElseThrow(() -> new Exception("Student not found with id :" + id));
		repo.delete(s);
		return "Student Information deleted....";
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}


}
