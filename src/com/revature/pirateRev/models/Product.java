package com.revature.pirateRev.models;

public class Product {
	private String name;
	private double price;
	private String description;
	private enum category {
		trinkets, clothingAndAccessories, magicTokensAndPotions, navigation, weaponry, howToGuides, miscellaneous
	}
	public String getName() {
		
		return name;
	}
}
