package com.accessModifier;

public class Base {

	//declaring variables
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//methods
	void methodDefault()
{
		System.out.println("Default method");
		System.out.println("Variable " + varDefault);
}
	
public void methodPublic()
{
	System.out.println("Public method");
	System.out.println("Public variable"+varPublic);
}

private void methodPrivate() {
	System.out.println("Private method");
	System.out.println("Private variable : "+varPrivate);
}

protected void methodProtected() {
	System.out.println("Protected method");
	System.out.println("Protected variaable : "+varProtected);
}
}
