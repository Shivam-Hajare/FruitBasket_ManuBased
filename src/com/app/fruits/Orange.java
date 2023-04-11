package com.app.fruits;

public class Orange extends Fruit {
private String taste;
	
	public Orange(String color,double weight,String name,String taste)
	{
		super(color,weight,name);
		this.taste=taste;
	}
	@Override
	public String toString()
	{
		return "name of fruit is: "+getName()+" and color is: "+getColor()+" with weight: "
				+getWeight()+" and taste is: "+taste;
	}
	public String test()
	{
		return "Sour";
	}
	public void juice()
	{
		System.out.println(super.getName()+" ...extracing juice");
	}
}
