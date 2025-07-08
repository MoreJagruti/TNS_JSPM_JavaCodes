package com.dayFive.MultiLevelInheritance;
//This is a base class
public class Person {
	
	private String name;
	private long contactNo;
	
	//Default constructor
	public Person() {
		super();
	}

	//Parameterized constructor
	public Person(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}

	//toString Method
	@Override
	public String toString() {
		return "\nPerson:\n\tname=" + name + "\n\tcontactNo=" + contactNo;
	}
	
	
}
