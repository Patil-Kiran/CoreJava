package com.app.org;
	
public class Worker extends Emp{
	int hoursWorked;
	int hourlyRate;
	
	public Worker(String dept,double basic,int hoursWork,int rate) {
		super(dept,basic);
		//this.emps =this.emps;
		this.hourlyRate = rate;
		this.hoursWorked = hoursWork;
	}
	
	
	public String toString() {
		return super.toString()+", HoursWorked: "+" ,"+this.hoursWorked+" ,HourlyRate: "+this.hourlyRate;
	}
	
	public int getHourlyRaate() {
		return this.hourlyRate;
	}
	
	
}

