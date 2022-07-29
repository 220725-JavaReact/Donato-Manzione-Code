package com.revature.pirateRev.models;

import java.util.*;

public class StoreFront {
	private String name;
	private List<Product> products;
	private List<Order> orders;
	private Map<String, String> addressBook = new HashMap<>() {{
		put("Captain Branch", "");
		put("First Mate Branch", "");
		put("Quartermaster Branch", "");
		put("Sailing Master Branch","");
		put("Gunner Branch","");
		put("Powder Monkey Branch","");
		put("Boatswain Branch","");
		put("Surgeon Branch","");
		put("Cook Branch","");
	
	}}; 
	
	public String getAddress(String storeName) {
		return addressBook.get(storeName);
	}
	
}
