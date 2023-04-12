package com.app.fruits;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Fruit> basket = new ArrayList<Fruit>();
		boolean exit = false;

		while (!exit) {
			System.out.println("1.Add Mango \n2.Add Orange \n3.add Apple\n4.Display all fruits name"
					+ "\n5.Display all info\n6.Make fruit in a basket as stale"
					+ "\n7.Mark all sour fruits stale\n8.Invoke fruit specific func\n9.Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter color and weight, name, taste, fresh (true/false):");
				Fruit f = new Mango(sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextBoolean());
				basket.add(f);
				System.out.println("mango added...");
				break;
			case 2:
				System.out.println("Enter color and weight, name, taste , fresh (true/false): ");
				Fruit f1 = new Orange(sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextBoolean());
				System.out.println("Orange added...");
				basket.add(f1);
				break;
			case 3:
				System.out.println("Enter color and weight, name, taste, fresh (true/false): ");
				Fruit f2 = new Apple(sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextBoolean());

				System.out.println("Apple added...");
				basket.add(f2);
				break;
			case 4:
				for (Fruit eachFruit : basket) {
					System.out.println(eachFruit.getName());
				}
				break;
			case 5:
				for (Fruit eachFruit : basket) {
					System.out.println(eachFruit);
				}
				break;
			case 6:

				System.out.println("Enter fruit index: ");
				int fruitNo = sc.nextInt()-1;
				System.out.println("1. "+fruitNo);

				if(fruitNo==0)
					fruitNo=1;
				System.out.println("2. "+fruitNo);

				if (fruitNo > 0 && fruitNo < basket.size()) {
					basket.get(fruitNo).setFresh(false);
				}
				else {
					System.out.println("Invalid Index...");
				}
				break;
			case 7:
				for (Fruit eachFruit : basket) {
					if (eachFruit.taste().equals("Sour")) {
						eachFruit.setFresh(false);
					}
				}
				break;
			case 8:
				System.out.println("Enter fruit index: ");
				int fruitIndex = sc.nextInt()-1;
				if(fruitIndex==0)
					fruitIndex=1;
				if (fruitIndex > 0 && fruitIndex < basket.size()) {
					if (basket.get(fruitIndex) instanceof Apple) {
						((Apple) basket.get(fruitIndex)).jam();

					} else if (basket.get(fruitIndex) instanceof Mango) {
						((Mango) basket.get(fruitIndex)).pulp();

					} else if (basket.get(fruitIndex) instanceof Orange) {
						((Orange) basket.get(fruitIndex)).juice();

					}
				} else {
					System.out.println("Index invalid...");
				}
				break;
			case 9:
				exit = true;
				break;

			}

		}
	}

}
