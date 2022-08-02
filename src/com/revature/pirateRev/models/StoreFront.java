package com.revature.pirateRev.models;

import java.util.*;

import com.revature.pointsapp.booty.NauticalChart;

public class StoreFront {
	private String name;
	private List<Product> products;
	private List<Order> orders;
	private String address;

	public StoreFront(String name) {
		address = locate(name);
		this.name = name;
	}

	public String locate(String name) {
		return NauticalChart.map.get(name);
	}

	public String getName() {

		return name;
	}

	@Override
	public String toString() {
		return  "\t"+name.toUpperCase() +"\n\tLocation:\n\t\t" + address + "\n\n";
	}

}
