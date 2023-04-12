package com.app.fruits;

public class Fruit {
	private String color,name;
	private double weight;
	private boolean fresh;
	
	public Fruit(String color,double weight,String name,boolean fresh)
	{
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.fresh=fresh;
	}
	

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
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
	public boolean getFresh() {
		return fresh;
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
