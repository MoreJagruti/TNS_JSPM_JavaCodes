package com.dailyAssignments;

import java.util.Scanner;


public class Customer {
	
//	Private data members
	private int ID;
	private String name;
	private int age;
	
	//default constructor
	public Customer() {
		System.out.println("Default Values \nID : "+ID+"\nName : "+name+"\nAge : "+age);
	}
	
//	parameterised constructor
	public Customer(int ID, String name ,int age) {
		setAttribute(age, ID ,name);
	}
	
//	Setting values
	public void setAttribute(int age ,int ID , String name) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}
	
//	String representation of object
	public String toString() {
		return "\nID : "+ID+"\nname : "+name+"\nAge : "+age;
	}
	
	public static void main(String[] args) {

		int ID ,age;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id,name and age one by one: ");
		ID = sc.nextInt();
		name = sc.next();
		age = sc.nextInt();
		
		Customer obj1 = new Customer();
		Customer obj2 = new Customer(ID , name , age);
		
		System.out.println(obj2);
	}

}
