package com.tnsif.interfaceinjava;

//Interface can be public or default both
//Interface does not have any concrete method.
public interface IntefaceInJava {
	
	//interface variables
	//Must be initialized at the time of declaration
	int id = 101;
	
	//Abstract Method in Java
	public void show();
	
	//default method in java 
	//default method can not be implemented or accessed in class
	//we can over ride default interface in Child Interface
	default void defaultMethod1() {
		System.out.println("This is default method.");
	}
}
