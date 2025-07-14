package com.dayFive.HybridInheritance;

class Person{
	long phno;
	String name;	
	public void personDetails() {
		System.out.println(name + " "+phno);
	}
}

class Employee extends Person{
	int empid;
	String position;
	float salary;
	
	public void employeeDetails() {
		System.out.println(empid+" "+position+" "+salary);
	}
}

class Manager extends Employee{
	String authority;
	
	public void managerAuthority() {
		System.out.println(authority);
	}
}

class Client extends Person{
	
	String bond;
	String projects;
	
	public void clientDetails() {
		System.out.println("Bond : "+bond + "  project : "+ projects);
	}
}

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		
		Manager m=new Manager();
		Client c=new Client();
		
		m.phno=9322871474l;
		m.name="Shiv";
		m.empid=1234;
		m.position="Manager";
		m.salary=50000f;
		m.authority="Take Decision";
		
		m.managerAuthority();
		
		c.phno=9322979999l;
		c.name="Lalita";
		c.bond="For One Year";
		c.projects="inary Brains";
		c.clientDetails();
		
		
	}
}
