package com.app.org;

public class Manager extends Emp {
	int empid=super.getEmpid();
	double performanceBonus;
	
	public Manager(String dept,double basic, double perfomanceBonus) {
		super(dept,basic);
		//super.emps=super.emps;
		this.performanceBonus = perfomanceBonus;
	}
	
	public double getPerformanceBonus() {
		return this.performanceBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ,Performance Bonus: "+this.performanceBonus;
	}
}
