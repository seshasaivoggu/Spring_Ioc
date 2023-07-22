package com.DiForObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		student s1=context.getBean("student1",student.class);
		s1.startCheating();
		student s2=context.getBean("student2",student.class);
		s2.startCheating();
	}

}
