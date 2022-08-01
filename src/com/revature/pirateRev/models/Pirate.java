package com.revature.pirateRev.models;

import java.util.List;

public class Pirate {
	private String name;
	private String address;
	private String email;
	private List<Booty> orders;
	
	public String getName() {	
		return name;
	}

	@Override
	public String toString() {
		return "Pirate [name=" + name + ", address=" + address + ", email=" + email + ", orders=" + orders + "]";
	}
	
	
}
