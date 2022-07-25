package com.revature.revcoffee.models;

public class Coffee {

	private String type;
	private String size;
	private String temp;
	private double price;
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getTemp() {
		return temp;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}


	@Override
	public String toString() {
		return "Coffee [type=" + type + ", size=" + size + ", temp=" + temp + ", price=$" + price + "]";
	}


	
	
}
