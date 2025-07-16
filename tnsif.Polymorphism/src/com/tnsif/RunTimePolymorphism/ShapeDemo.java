package com.tnsif.RunTimePolymorphism;

public class ShapeDemo {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[2];
		//Instantiate objects of Circle and /square class
		shapes[0] = new Circle(5.0);
		shapes[1] = new Square(6.0);
		
		//Polymorphism : overriding through draw and erase class
		for(Shape shape:shapes) {
			shape.drawShape();
			shape.erase();
			System.out.println("--------------------------------------");
		}
	}

}
