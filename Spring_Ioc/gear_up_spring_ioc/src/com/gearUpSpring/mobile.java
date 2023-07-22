package com.gearUpSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
/*		this below code helps to run airtel,vodaphone calsses without changing this file 
		sim Sim=context.getBean("sim", sim.class);
		Sim.calling();*/
		
		airtel a1=context.getBean("sim",airtel.class);
		a1.calling();
		System.out.println(a1.getPhoneNumber());


	}

}
