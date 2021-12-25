package com.app.org;

public class Emp {
	// AutoIncrement not works like this it single copy per model ---> required static 
	public static  int emps = 31000;
	public int empId;
	 // random for series generation
	private String deptId;
	private double basicSalary;
	
	public Emp(String dept, double basics) {
		this.empId = this.emps++;   // When any of SubClass calls it one shared copy already creted that incremented only
		this.deptId = dept;
		this.basicSalary = basics;
	}
	
	public int getEmpid() {
		return this.emps;
	}
	
	public String toString() {
		return "EmpId: "+(this.empId)+" ,DeptId: "+this.deptId+" ,Basic Salary: "+this.basicSalary;
	}
	
}