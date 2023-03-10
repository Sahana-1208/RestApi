package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo repository;
	
	public boolean addStudent(Student student) {
		repository.save(student);
		return true;
	}
	
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	public Optional<Student> getStudentById(int id){
		return repository.findById(id);
	}
	
	public Student updateStudent(Student student) {
		repository.save(student);
		return student;
	}
	
	public boolean deleteStudentById(int id) {
		repository.deleteById(id);
		return true;
	}
	
}
