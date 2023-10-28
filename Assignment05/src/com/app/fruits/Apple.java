package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(String clr,double wght,String n)
	{
		super(clr,wght,n);
	}
	public void jam()
	{
	System.out.println("Name of fruit is "+super.getName()+" jam is created......");
	}
	public String toString()
	{
		return "All Details of fruit: "+super.toString();
	}
	public String taste() {
		return "Sweet n sour";
	}
}
