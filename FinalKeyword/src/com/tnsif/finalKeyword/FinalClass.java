package com.tnsif.finalKeyword;

public class FinalClass {
	int age = 18;
	String bloodGroup = "O Positive";
	void show() {
		System.out.println("Age : "+age+"\tBlood Group : "+bloodGroup);
	}
	
//	final {
//		Syntax error, insert "Identifier" to complete CompactConstructorHeader
//	}
}

// class sample extends FinalClass{
//	 The type sample cannot subclass the final class FinalClass
//}

class Demo{
public static void main(String[] args) {
	FinalClass f = new FinalClass();
	f.age = 20 ;
	f.show();
}
}