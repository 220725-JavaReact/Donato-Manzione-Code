package com.revature.pirateRev.ui;


import java.util.Scanner;

import com.revature.pirateRev.dao.PirateDAO;
import com.revature.pirateRev.dao.StoreFrontDAO;
import com.revature.pirateRev.exceptions.NoSuchElementException;
import com.revature.pirateRev.models.Pirate;
import com.revature.pirateRev.models.StoreFront;
import com.revature.pirateRev.util.Arrays;
import com.revature.pointsapp.booty.TempStorage;

public class Menu {
	private static PirateDAO pirateDAO = new PirateDAO();
	private static Scanner sc = new Scanner(System.in);
	private static String pirateInput;
	private static StoreFrontDAO storeFrontDAO;

	public static void open() {
		System.out.println("Welcome to the Pirate Supply Stores!\n");
		do {

			System.out.println("What would you like to do?\n");
			System.out.println("(1) Log In");
			System.out.println("(2) Register");
			System.out.println("(x) Exit\n");
			pirateInput = sc.nextLine();
			switch (pirateInput.trim().toLowerCase()) {
			case "1":
			case "one":
				logIn();
				break;
			case "2":
			case "register":
				register();
				break;
			case "x":
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Wrong Input!");
				break;

			}

		} while (!pirateInput.equals("x"));

		sc.close();
	}

	private static void register() {
		Pirate newPirate = new Pirate();
		System.out.println("\nWhat is your name?");
		newPirate.setName(sc.nextLine());
		System.out.println("What is your address?");
		newPirate.setAddress(sc.nextLine());
		System.out.println("What is your email?");
		newPirate.setEmail(sc.nextLine());
		pirateDAO.create(newPirate);
		System.out.println("\nThis is your info:\n" + newPirate + "\n");

		logIn();

	}

	private static void logIn() {

		Object[] pirates = pirateDAO.readAll();
		if (pirates[0] == null) {
			System.out.println("\nNo pirates registered!");
			return;
		}

		System.out.println("\nYou pass this point at your peril");

		System.out.println("\nWhich pirate are you then?\n");

		Arrays.printArray(pirates, Arrays.PrintType.JUST_NAME, Arrays.PrintObject.PIRATE);

		System.out.println("\nEnter name: \n");

		pirateInput = sc.nextLine();
		Pirate pirate;
		try {
			pirate = pirateDAO.readByName(pirateInput);
		} catch (NoSuchElementException e) {
			return;
		}

		System.out.println("\nHere is your information: \n" + pirate + "\n");

		System.out.println("\nPlease select one of our stores: ");

		TempStorage.storeFronts.print();

		System.out.println("\n\nPlease choose which store you want to check out");

		System.out.println("\n\nType in the number:");

		pirateInput = sc.nextLine();

		switch (pirateInput.trim().toLowerCase()) {
		case "1":
		case "one":
			StoreFront store = storeFrontDAO.readByName("captain");
			if(store.getProducts().isEmpty()) {
				System.out.println("\n\nThis store was pillaged\n\nCome back another time I suppose");
			}
			store.getProducts().print();
			
			break;
		case "first mate":
		case "firstmate":
		case "first":
			break;
		case "quartermaster":
			break;
		case "sailing master":
		case "sailingmaster":
		case "sailing":
			break;
		case "gunner":
			break;
		case "powder monkey":
		case "powder":
		case "monkey":
		case "powdermonkey":
			break;
		case "boatswain":
			break;
		case "surgeon":
			break;
		case "cook":
			break;
		default:
			System.out.println("\n\nNo such branch! Are you sure you typed it in correctly?");
			break;

		}

	}
}
