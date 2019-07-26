
package com.practice.example;


public class Label implements Element {
	
	private int labelID;
	private String labelName;
	public int getLabelID() {
		return labelID;
	}
	public void setLabelID(int labelID) {
		this.labelID = labelID;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	
	public void buildElement() {
		System.out.println("Constructing the Label");
	}

}
