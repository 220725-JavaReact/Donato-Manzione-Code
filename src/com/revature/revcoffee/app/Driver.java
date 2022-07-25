package com.revature.revcoffee.app;

import java.util.Scanner;

import com.revature.revcoffee.models.Coffee;
import com.revature.revcoffee.models.Tea;

public class Driver {

	public static void main(String[] args) {
		String userInput = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Welcome to Vanquish Coffee Shop!\nWhat would you like to order?");

			System.out.println("[1] Coffee");
			System.out.println("[2] Tea");
			System.out.println("[x] Exit");

			userInput = sc.nextLine();
			switch (userInput) {
			case "1":
				Coffee coffee = new Coffee();

				System.out.println("What type?");
				System.out.println("[a] Macchiato - $2.00");
				System.out.println("[b] Latte - $3.00");
				System.out.println("[c] Espresso - $1.00");
				String type = sc.nextLine();

				switch (type) {
				case "a":
					coffee.setType("Macchiato");
					coffee.setPrice(2);
					break;
				case "b":
					coffee.setType("Latte");
					coffee.setPrice(3);
					break;
				case "c":
					coffee.setType("Espresso");
					coffee.setPrice(1);
					break;
				default:
					coffee.setType("Macchiato");
					coffee.setPrice(2);
					break;
				}
				
				System.out.println("How hot?");
				coffee.setTemp(sc.nextLine());
				System.out.println("What size?");
				coffee.setSize(sc.nextLine());

				System.out.println(coffee);
				break;
			case "2":
				Tea tea = new Tea();
				System.out.println("What type of tea?");
				System.out.println("[a] Black - $2.00");
				System.out.println("[b] Lemon - $1.00");
				System.out.println("[c] Green - $1.50");
				type = sc.nextLine();

				switch (type) {
				case "a":
					tea.setType("Black");
					tea.setPrice(2);
					break;
				case "b":
					tea.setType("Lemon");
					tea.setPrice(1);
					break;
				case "c":
					tea.setType("Green");
					tea.setPrice(1.5);
					break;
				default:
					tea.setType("Green");
					tea.setPrice(1.5);
					break;
				}
				
				System.out.println("How hot?");
				tea.setTemp(sc.nextLine());
				System.out.println("What size?");
				tea.setSize(sc.nextLine());

				System.out.println(tea);
				break;
			case "x":
				break;
			default:
				System.out.println("Wrong input. Please try again.");
				break;
			}

		} while (!userInput.equals("x"));
	}
}
