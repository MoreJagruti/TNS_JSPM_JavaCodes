package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class NestedCatchBlock {

	public static int divide(int x ,int y) {
		int z = 0;
		z=x/y;
		System.out.println("Result of division is  = "+z);
		return z;
	}
	public static void main(String[] args) {
		 int x,y,z;
		 Scanner scanner = new Scanner(System.in);
		 x=scanner.nextInt();
		 y=scanner.nextInt();
		 try {
			 x=Integer.parseInt(args[0]);
			 y=Integer.parseInt(args[1]);
			 try{
			 z = divide(x, y);
			 System.out.println();
			 }catch(ArithmeticException a) {
				 System.out.println(a.getMessage());	 
			 }
		 }catch(NumberFormatException e) {
			 System.out.println(e.getMessage());
		 }
		 
	 
	}

}
