package com.dayFive.MultiLevelInheritance;
//This is a child class of Employee class,which is derived from base class Person
public class LevelOneEmployee  extends Employee{

	private int workHours;
	private int paidLeaves;
	
	public LevelOneEmployee() {
		super();
	}
	
	public LevelOneEmployee(String name,long contactNo,String deptName,long baseSalary,int workHours, int paidLeaves) {
		super(name , contactNo ,deptName,baseSalary);
		this.workHours = workHours;
		this.paidLeaves = paidLeaves;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee:\n\tworkHours=" + workHours + "\n\tpaidLeaves=" + paidLeaves + super.toString();
	}

}
