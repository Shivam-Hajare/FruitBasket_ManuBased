package com.app.fruits;

public class Mango extends Fruit {
	private String taste;

	public Mango(String color, double weight, String name, String taste,boolean fresh) {
		super(color, weight, name, fresh);
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "name of fruit is: " + getName() + " and color is: " + getColor() + " with weight: " + getWeight()
		+" and fresh is: "+getFresh();
	}
	@Override
	public String taste()
	{
		return "Sweet";
	}
	public void pulp()
	{
		System.out.println(super.getName()+" ..creating pulp!");
	}
}
