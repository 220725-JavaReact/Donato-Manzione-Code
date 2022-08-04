package com.revature.pirateRev.models;

import com.revature.pirateRev.collections.ArrayList;

public class Order {

	private ArrayList<LineItem> lineItems;
	private String storeFrontLocation;
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
		return storeFrontLocation;
	}

}
