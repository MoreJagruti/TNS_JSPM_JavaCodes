package com.tnsif.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		System.out.println("-------------------Program: Exception Handling ----------------");
		try {
		int div = 100/0;
		System.out.println("Div = "+div);
		}
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			System.out.println("Number divide by zero.");
		}
		System.out.println("Exception Handling in Java");

}}