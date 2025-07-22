package com.tnsif.functionalinterface;

public class FunctionalInterfaceDemo implements FunctionalInterface{
	
	@Override
	public void greet() {
		System.out.println("Welcome to the Functional /interface demo class.");
	}

	public static void main(String[] args) {
		FunctionalInterfaceDemo obj =new FunctionalInterfaceDemo(); 
		//The method sayHello() is undefined for the type FunctionalInterfaceDemo
		//obj.sayHello();
		obj.greet();	
	}

}
