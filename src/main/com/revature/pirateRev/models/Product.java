package main.com.revature.pirateRev.models;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

}
