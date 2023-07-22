package com.DiForObjects;

public class student {
	int id;
	mathCheat mc;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setMc(mathCheat mc) {
		this.mc = mc;
	}
	
	public void startCheating() {
		mc.cheating();;
	}
	

}
