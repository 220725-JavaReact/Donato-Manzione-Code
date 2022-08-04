package com.revature.pirateRev.models;

public class LineItem {
	private Product product;
	private int quantity;
	public String getName() {
		return product.getName();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
