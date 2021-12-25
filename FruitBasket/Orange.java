package com.app.fruits;

public class Orange extends Fruits {
	
	public Orange(String color,String name,double weight){
		super(color,name,weight);
	}
	public String getTaste() {
		return "Sour";
	}
	public void juice() {
		System.out.println(super.getName()+" "+super.getWeight()+": extracting juice !! ");
	}
	public String toString() {
		return super.toString() ; 
	}
	
}

