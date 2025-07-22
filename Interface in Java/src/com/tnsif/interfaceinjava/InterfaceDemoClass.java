package com.tnsif.interfaceinjava;

public class InterfaceDemoClass implements IntefaceInJava{

	@Override
	public void show() {
		System.out.println(id);
	}
	
	public static void main(String[] args) {

		InterfaceDemoClass obj = new InterfaceDemoClass();
		obj.show();	}
	

}
