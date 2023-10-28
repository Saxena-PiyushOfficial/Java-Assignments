package com.app.fruits;

public class Orange extends Fruit{
	public Orange(String clr,double wght,String n)
	{
		super(clr,wght,n);
	}
	public void juice()
	{
		
		System.out.println("Name of fruit is "+super.getName()+"Weight of fruit is: "+super.getWeight()+" juice is extracted cr......");
	}
	public String toString()
	{
		return "All Details of fruit: "+super.toString();
	}
	public String taste() {
		return "sour";
	}
	
	

}
