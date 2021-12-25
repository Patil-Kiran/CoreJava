/*
.

3.4 Override  toString correctly to return state of all fruits (including only : name ,color , weight )

3.5 Add a taste() method : public String taste()



Add specific functionality , in the sub classes


In Apple : public void jam() {Display name of the fruit : making jam!}

3.6 Add all of above classes under the package "com.app.fruits"
*/
package com.app.fruits;

public abstract class Fruits {
	private String color,name; 
	private double weight;  
	private boolean fresh=true;
	public Fruits(String color,String name,double weight){
		this.color =color;
		this.name =name;
		this.weight= weight;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	public boolean getFreshness() {
		return this.fresh ;
	}
	
	public boolean setFreshness(boolean state) {
		this.fresh = state;
		return this.fresh ;
	}
	
	@Override
	public String toString() {
		return "Fruitname : "+this.name+", Fruitcolor : "+this.color+", weight : "+this.weight;
	}
	
	public  abstract String getTaste(); 
}
