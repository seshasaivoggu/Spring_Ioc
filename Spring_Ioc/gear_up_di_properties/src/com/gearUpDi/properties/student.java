package com.gearUpDi.properties;

import org.springframework.beans.factory.annotation.Value;

public class student {
	
//	there are two ways to inject values into below dependencies
//	1. apply @Value annotation directly to the dependencies
//	2. apply to their corresponding setter methods.
	
	
//	@Value("${student.name}")
	private String name;
//	@Value("${student.interestedCourse}")
	private String interestedCourse;	
//	@Value("${student.hobby}")
	private String hobby;
	
//	@Value("${student.name}")
//	public void setName(String name) {
//		this.name = name;
//		System.out.println("inside");
//	}
//	
//	@Value("${student.interestedCourse}")
//	public void setInterestedCourse(String interestedCourse) {
//		this.interestedCourse = interestedCourse;
//		System.out.println("inside");
//	}
//	
//	@Value("${student.hobby}")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//		System.out.println("inside");
//	}
		
//if we need to make sure that one or more dependencies need to be injected compulsory then we need to use constructor.	
	public student(String name, String interestedCourse, String hobby) {
		this.name = name;
		this.interestedCourse = interestedCourse;
		this.hobby = hobby;
	}

	public void studentInfo() {
		System.out.println("name: "+name+"\ncourse: "+interestedCourse+"\nhobby: "+hobby);
	}

}
