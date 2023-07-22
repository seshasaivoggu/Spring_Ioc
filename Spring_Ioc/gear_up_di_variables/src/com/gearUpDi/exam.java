package com.gearUpDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		student s1=context.getBean("student",student.class);
		s1.studentInfo();
	}

}
