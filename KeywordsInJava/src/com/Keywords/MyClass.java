package com.Keywords;

public class MyClass {
	private int section;
	private static int srNo=101;
	
	MyClass(){
		srNo++;
		section++;
	}
	
	//Tjis block is executed without the object creation
	static{
		System.out.println("Static Block\n\n");
	}
	
	
	void data() {
		System.out.println("Non Static Method :");
		System.out.println(srNo);
		System.out.println(section + "\n\n");
	}
	
	static void display() {
		System.out.println("Static Method:");
		System.out.println(srNo);
//		System.out.println(section);  Invalid
	}
	
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.data();
		display();
//		MyClass.display();
	}
}
