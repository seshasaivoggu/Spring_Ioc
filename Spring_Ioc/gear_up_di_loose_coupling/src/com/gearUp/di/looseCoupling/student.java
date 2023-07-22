package com.gearUp.di.looseCoupling;

public class student {
	
	private int id;
	private cheat cheatingHelper;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCheatingHelper(cheat cheatingHelper) {
		this.cheatingHelper = cheatingHelper;
	}
	
	public void cheatingSubject() {
		System.out.println(id);
		cheatingHelper.cheating();
	}

}
