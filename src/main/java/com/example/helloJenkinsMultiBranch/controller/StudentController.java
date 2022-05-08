package com.example.helloJenkinsMultiBranch.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloJenkinsMultiBranch.model.Student;
import com.example.helloJenkinsMultiBranch.service.StudentService;

@RestController
public class StudentController {
	
	@Inject
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
