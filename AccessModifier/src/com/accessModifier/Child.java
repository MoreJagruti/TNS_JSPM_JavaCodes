package com.accessModifier;

public class Child extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
	}

}
