package com.revature.pirateRev.models;

import com.revature.pirateRev.collections.ArrayList;

public class Order {

	private int orderID;
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

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

}
