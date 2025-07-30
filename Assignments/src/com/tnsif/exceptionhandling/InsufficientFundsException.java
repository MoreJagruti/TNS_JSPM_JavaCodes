package com.tnsif.exceptionhandling;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		 super(message);
	}
}
