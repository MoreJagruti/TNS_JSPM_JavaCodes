package com.tnsif.abstraction;

//abstract class 
abstract  class Shape{
    public double area;
    //Abstract Method
    abstract public void calArea();
    
    //Concrete Method
    public void show(){
       System.out.println("Area of shape is : "+area); 
    }
}

//Sub-class of Shape class
class Circle extends Shape{
    private float radius;
    
    Circle(float radius){
        this.radius = radius;
    }
    @Override
    public void calArea(){
        System.out.println("-------------AREA OF CIRCLE-------------------");
        area = 3.24 * (this.radius) * (this.radius);
    }
}

class Square extends Shape{
    private float side;
    Square(float side){
        this.side = side;
    }
    @Override
    public void calArea(){
        System.out.println("-----------------AREA OF SQUARE---------------");
        area = this.side * this.side;
    }
}
class Main {
public static void main(String[] args){
    
	//Array of objects
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(7);
    shapes[1] = new Square(50);
    
    for(Shape shape : shapes){
        shape.calArea();
        shape.show();
    }
    } 
}
