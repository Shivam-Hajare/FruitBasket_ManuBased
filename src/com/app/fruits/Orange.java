package com.app.fruits;

public class Orange extends Fruit {
private String taste="Sour";
	
	public Orange(String color,double weight,String name,String taste,boolean fresh)
	{
		super(color,weight,name, fresh);
		this.taste=taste;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString()
	{
		return "name of fruit is: "+getName()+" and color is: "+getColor()+" with weight: "
				+getWeight()+" and fresh is: "+getFresh();
	}
	public String test()
	{
		return taste;
	}
	public void juice()
	{
		System.out.println(super.getName()+" "+super.getWeight()+" ...extracing juice");
	}
}
