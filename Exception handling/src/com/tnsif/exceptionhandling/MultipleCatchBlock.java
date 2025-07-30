package com.tnsif.exceptionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		Scanner scanner = new Scanner(System.in);
		int numberOne, numberTwo, numberThree;
		try {
			
			while(true) {
				System.out.println("Enter first number");
				numberOne = scanner.nextInt();
				
				System.out.println("Enter second number");
				numberTwo = scanner.nextInt();
				
				numberThree = numberOne/numberTwo;
				System.err.println("Division = "+numberThree);
			}
		}catch (ArithmeticException e) {
			 System.err.println(e.getMessage());
//			e.printStackTrace();
		}catch (InputMismatchException a) {
			 System.err.println(a.getMessage());
		}
		System.err.println("-------------------------------END OF PROGRSM----------------------------------------");
	}

}
