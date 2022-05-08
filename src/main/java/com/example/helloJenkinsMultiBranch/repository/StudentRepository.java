package com.example.helloJenkinsMultiBranch.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.helloJenkinsMultiBranch.model.Address;
import com.example.helloJenkinsMultiBranch.model.Student;

@Repository
public class StudentRepository {
	private List<Student> studentDb = new ArrayList<>();
	
	public StudentRepository() {
		Address address = new Address("Bengaluru", "Karnataka", "India", "560097");
		Student student1 = new Student(100, "Prashant Singh", "KV", address);
		Student student2 = new Student(101, "Panda", "KV", address);
		studentDb.add(student1);
		studentDb.add(student2);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDb;
	}
	
}
