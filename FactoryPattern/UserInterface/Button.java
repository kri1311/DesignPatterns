package com.practice.example;
public class Button implements Element {
	
	private int buttonID;
	private String buttonName;
	private String buttontype;
	public int getButtonID() {
		return buttonID;
	}
	public void setButtonID(int buttonID) {
		this.buttonID = buttonID;
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	public String getButtontype() {
		return buttontype;
	}
	public void setButtontype(String buttontype) {
		this.buttontype = buttontype;
	}
	
	public String buildElement() {
		return "Constructing the Button";
	}
	

}
