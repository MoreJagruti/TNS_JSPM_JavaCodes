package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalyBlock {

	public static void main(String[] args) {
		
		 
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter number");
			int number = scanner.nextInt();
			System.out.println(2*number%2 == 0?"is even":"is odd");
		} catch (InputMismatchException e) {
		System.out.println(e.getMessage());	
		}
		finally {
		scanner.close();
		System.out.println("Connection closed");
		}
		
	}

}
