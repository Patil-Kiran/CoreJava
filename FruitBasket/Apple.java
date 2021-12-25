package com.app.fruits;

public class Apple extends Fruits {
	public Apple(String color,String name,double weight){
		super(color,name,weight);
	}
	

	public String getTaste() {
		return "Sweet n Sour";
	}
	
	public void jam() {
		System.out.println(super.getName()+": Making Jam");
	}
	
	public String toString() {
		return super.toString() ; 
	}
	
}

