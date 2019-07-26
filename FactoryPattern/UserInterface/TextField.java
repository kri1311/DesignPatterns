package com.practice.example;

public class TextField implements Element {
	
	private int textFieldID;
	private String textFieldName;
	private int textFieldLength;
	public int getTextFieldID() {
		return textFieldID;
	}
	public void setTextFieldID(int textFieldID) {
		this.textFieldID = textFieldID;
	}
	public String getTextFieldName() {
		return textFieldName;
	}
	public void setTextFieldName(String textFieldName) {
		this.textFieldName = textFieldName;
	}
	public int getTextFieldLength() {
		return textFieldLength;
	}
	public void setTextFieldLength(int textFieldLength) {
		this.textFieldLength = textFieldLength;
	}
	
	public String buildElement() {
		return "Constructing the TextField";
	}
	
	

}
