package com.tnsif.functionalinterface;

//This interface has only one abstract method 
//It can have multiple default or static methods

public interface FunctionalInterface {

	public void greet();
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	default void method1() {
		System.out.println("I am default method");
	}
}
