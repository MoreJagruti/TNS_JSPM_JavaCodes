package com.tnsif.RunTimePolymorphism;

public class Square extends Shape{
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Drawing a square with a side "+side);
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing a square with side "+side);
	}
}
