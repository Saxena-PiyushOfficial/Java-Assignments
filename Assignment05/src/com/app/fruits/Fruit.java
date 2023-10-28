package com.app.fruits;

public class Fruit {
//color : String , weight : double , name:String, fresh : boolean
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	Fruit(String color,double weight,String name){
		this.color=color;
		this.weight=weight;
		this.name=name;
	   this.fresh=true;
	
	}
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public String taste() {
		return "No specific Taste";
	}
	public String toString()
	{
		return "Name of fruit: "+name+" Color of fruit: "+color+" Weight of fruit: "+weight+"Taste type"+taste();
	}
}
