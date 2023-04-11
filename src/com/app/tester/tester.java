package com.app.tester;

import com.app.fruits.*;
public class tester {
	public static void main(String[] args) {
		Apple apple = new Apple("red", 10, "apple","good");
		System.out.println(apple);
		apple.taste();
		apple.jam();
		
		Orange orange = new Orange("red", 10, "orange","good");
		System.out.println(orange);
		orange.taste();
		orange.juice();
		
		Mango mango = new Mango("red", 10, "orange","good");
		System.out.println(mango);
		mango.taste();
		mango.pulp();
	}
}
