package com.Keywords;

public class Employee {
	int empid;
	String name;
	static String companyName ="TNS";
	
	
    
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}



	public void empData() {
		System.out.println("EmpId : "+empid+"\tEmpName : "+name+"\tCompanyName : "+companyName);
	}
	

}
