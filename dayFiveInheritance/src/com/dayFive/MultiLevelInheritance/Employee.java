package com.dayFive.MultiLevelInheritance;
//This is a child class of base class Person.
public class Employee  extends Person{

	private String deptName;
	private long baseSalary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String name,long contactNo,String deptName, long baseSalary) {
		super(name ,  contactNo);
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}
	
	@Override
	public String toString() {
		return "\nEmployee:\n\tdeptName=" + deptName + "\n\tbaseSalary=" + baseSalary +super.toString();
	}
		
}
