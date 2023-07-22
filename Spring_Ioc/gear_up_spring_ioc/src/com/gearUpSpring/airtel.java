package com.gearUpSpring;

public class airtel implements sim{
	
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void calling() {
		System.out.println("calling from airtel");
		
	}

	@Override
	public void data() {
		System.out.println("data from airtel");
		
	}
	

}
