package com.tnsif.Polymorphism;

public class MethodOverloading {

	//palindrome check
	//differnt number of parameter /different data type of parameter
	//change positioning of parameters to implement method overloading	
	public void isPalindrome(int number) {
		int dummyNumber = number , rev = 0;
		while(number != 0) {
			rev = rev*10 + number%10;
			number /= 10;
		}
		if(rev == dummyNumber) {
			System.out.println(dummyNumber + "  is pallindrome");
		}else {
			System.out.println(dummyNumber + "  is not pallindrome");
		}
		
	}
	
	public void isPalindrome(String str) {
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		if(str.equals(rev)) {
			System.out.println(str + "  is pallindrome");
		}else {
			System.out.println(str + "  is not pallindrome");
		}
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.isPalindrome(12221);
		obj.isPalindrome(1222);
		obj.isPalindrome("CAR");
		obj.isPalindrome("RACECAR");

	}

}
