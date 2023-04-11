package com.app.fruits;

public class Mango extends Fruit {
	private String taste;

	public Mango(String color, double weight, String name, String taste) {
		super(color, weight, name);
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "name of fruit is: " + getName() + " and color is: " + getColor() + " with weight: " + getWeight()
				+ "and taste is: " + taste;
	}
	public String test()
	{
		return "Sweet";
	}
	public void pulp()
	{
		System.out.println(super.getName()+" ..creating pulp!");
	}
}
