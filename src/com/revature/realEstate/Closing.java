package com.revature.realEstate;

public class Closing {

	public static void main(String[] args) {

		// option 1 - out-of-the-box
		Property myResidence = Property.defaultHouse();
		show(myResidence);

		// option 2 - custom but build in one go
		Property myOtherResidence = Property.newBuilder().bedrooms(3).bedrooms(2).hasPool(true).build();
		show(myOtherResidence);

		// option 3 - keep ref to builder obj until residence is complete
		Property.Builder foreman = Property.newBuilder();

		show(foreman.bedrooms(2).homeType(HomeType.CONDO).hasPool(true).build());

	}

	private static void show(Property myResidence) {
		System.out.println(myResidence);

	}

}
