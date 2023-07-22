package com.gearUp.di.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class human {
	
	private heart heart;
	
	public human() {}


	public human(heart heart) {
		this.heart = heart;
	}

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart!=null) {
			heart.pumping();
			System.out.println(heart.getName()+" "+heart.getHearts());
		}
		else System.out.println("heart is not pumping, person died");
	}

}
