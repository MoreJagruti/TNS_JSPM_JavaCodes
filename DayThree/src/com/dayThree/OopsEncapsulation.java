package com.dayThree;

public class OopsEncapsulation {
//	encapsulation -- bundling of private data members and public functions is encapsulation
	
//	Private instance variables
	private int serialNum;
	private String name;
	private int age;
	
//	Public methods
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	// toString method is inherited by all classes in Java 
	//by Object class 
	//Primary purpose is to return string representation of object
	public String toString() {
		return "Student data\nName = "+name+"\nSerialNum = "+serialNum+"\nAge ="+age;
	}
}
