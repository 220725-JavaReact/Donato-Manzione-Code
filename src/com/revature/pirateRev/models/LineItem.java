package com.revature.pirateRev.models;

public class LineItem {
	private Product product;
	private int quantity;
	public String getName() {
		return product.getName();
	}
}
