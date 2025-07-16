package com.tnsif.RunTimePolymorphism;

public class Circle extends Shape{
	
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Drawing a circle with a radius " + radius);
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing a circle with radius " + radius);
	}




}
