package com.example.helloJenkinsMultiBranch.model;

public class Student {
	private long id;
	private String name;
	private String schoolName;
	private Address address;
	
	
	public Student(long id, String name, String schoolName, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
