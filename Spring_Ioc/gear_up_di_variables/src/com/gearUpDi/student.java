package com.gearUpDi;

public class student {
	
	private int id;
	private String studentName;

	/* SETTER INJECTION 
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */
	
	
//	  CONSTRUCTOR INJECTION
	  
	/*
	 * public student(int id, String studentName) { this.id = id; this.studentName
	 * =studentName; }
	 * 
	 * public student(String studentName) { this.studentName =studentName; }
	 */
	 
	
	public void studentInfo() {
		System.out.println("student name is "+studentName+" student id is "+id);
	}


	
}
