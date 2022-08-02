package com.revature.pirateRev.models;

import java.util.List;

public class Pirate {
	private String name;
	private String address;
	private String email;
	private List<Order> orders;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Pirate - \n\t" + name + "\n\t" + address + "\n\t" + email;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public void setEmail(String email) {
		this.email = email;
	}

}
