package com.app.fruits;

public class Mango extends Fruits {

	public Mango(String color,String name,double weight){
		super(color,name,weight);
	}
	
	public String getTaste() {
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println(super.getName()+" "+": Creating Pulp");
	}
	
	public String toString() {
		return super.toString() ; 
	}
		
}

