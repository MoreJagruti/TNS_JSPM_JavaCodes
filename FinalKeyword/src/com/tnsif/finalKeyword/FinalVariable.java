package com.tnsif.finalKeyword;

public class FinalVariable {
	
	final char div = 'B';//Class division 
	void show() {
//		div = 'A';The final field FinalVariable.div cannot be assigned
		System.out.println("Division : "+div);
	}

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.show();
	}

}
