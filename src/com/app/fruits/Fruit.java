package com.app.fruits;

public class Fruit {
	private String color,name;
	private double weight;
	
	public Fruit(String color,double weight,String name)
	{
		this.color=color;
		this.weight=weight;
		this.name=name;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "name of fruit is: "+name+" and color is: "+color+" with weight: "+weight;
	}
	
	public String taste()
	{
		return "no specific taste";
	}
}
