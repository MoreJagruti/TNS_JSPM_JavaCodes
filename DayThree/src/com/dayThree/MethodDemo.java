package com.dayThree;

public class MethodDemo {
	
//	user defined method : Non parameterized method
	public void addition() {
		int x = 20 , y = 10; //local variable
		int add = x+ y ;
		System.out.println("Addition of x and y  =  " + add);
	}
	
//Parameterized Method
public void multiply(int a , int b) {
	int mult = a * b ;
	System.out.println("Multiplication of a and b is = " + mult);
}



	public static void main(String[] args) {
		
//		object creation
		MethodDemo obj1 = new MethodDemo();
		obj1.addition();
		obj1.multiply(10 , 500);
}
}
