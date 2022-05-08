package com.example.helloJenkinsMultiBranch.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.helloJenkinsMultiBranch.model.Student;
import com.example.helloJenkinsMultiBranch.repository.StudentRepository;

@Service
public class StudentService {
	@Inject
	private StudentRepository studentRepo;
	
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.getStudents();
	}

}
