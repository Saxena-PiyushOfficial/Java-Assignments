package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(String clr,double wght,String n)
	{
		super(clr,wght,n);
	}
	public String taste() {
		return "Sweet";
	}
	public String toString()
	{
		return "All Details of fruit: "+super.toString();
	}
public void pulp()
{
	System.out.println("Name of fruit is "+super.getName()+"Color of fruit is: "+super.getColor()+" Pulp created......");
}
}
