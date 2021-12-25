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



/*

All of above classes must be in package--com.app.org

5.1 Emp state--- id(int), name, deptId(string) , basic(double)
emp id must be system generated using auto increment.

Behaviour ---1.  get emp details -- use toString.


5.2 Mgr state  ---id,name,basic,deptId , perfmonceBonus
Behaviour ----
1. get mgr details :  override toString. 
2. get performance bonus. 


5.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

Can you organize these classes in inheritance  hierarchy.

5.4 Write TestOrganization1 in "tester" package.
1. Hire 1 manager n 1 worker. Accept details from user.
Display complete details.
*/