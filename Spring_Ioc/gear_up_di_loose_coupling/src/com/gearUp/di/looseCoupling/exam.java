package com.gearUp.di.looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		student s1=context.getBean("student1",student.class);
		student s2=context.getBean("student2",student.class);
		s1.cheatingSubject();
		s2.cheatingSubject();

	}

}
