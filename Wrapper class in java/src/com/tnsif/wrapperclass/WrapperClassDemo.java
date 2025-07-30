package com.tnsif.wrapperclass;

import java.security.PublicKey;

public class WrapperClassDemo {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);
		
		//Unboxing - object to primitive data type
		int b = i.intValue();
		System.out.println(b);
		
		
		//Auto boxing - converting integer into object
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
		
		String s = "11";
		String s1 = "10";
		int x =Integer.parseInt(s);
		int y = Integer.parseInt(s1);
		int add = x + y;
		System.out.println(add);
	}
}
