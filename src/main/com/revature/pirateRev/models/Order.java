package main.com.revature.pirateRev.models;

import main.com.revature.pirateRev.collections.ArrayList;

public class Order {

	private ArrayList<LineItem> lineItems;
	private String storeLocation;
	private double totalPrice;

	public ArrayList<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(ArrayList<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStoreFrontLocation() {
		return storeLocation;
	}

}
