package com.dayThree;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		int id = sc.nextInt();
		System.out.println("ID" + id);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("name : " + name);
	}
}
