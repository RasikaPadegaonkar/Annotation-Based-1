package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Project {
	
	@Autowired
	@Qualifier("student1")
	private Student student;
	public Project() {
		System.out.println("Inside Project constructor");
	}
	
	
	public void printAge() {
		System.out.println("Age : " +student.getAge());
		
	}
	
	public void printName() {
		System.out.println("Name : " + student.getName());
		
	}
	
	

}
