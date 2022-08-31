package com.revature.realEstate;

/**
 * 
 * 
 * Builder Design pattern based on HttpClient in java.net.http
 * 
 * In HttpClient:
 * 
 * - newBuilder() is called statically, returns instance of itself (even though
 * technically it's an abstract class)
 * 
 * - then the instance calls any number of setters (if they can be called that)
 * to build itself
 * 
 * - setters chained together because because every one of them, after making
 * some change to its state, returns itself
 * 
 * - .build() breaks the chain
 * 
 * 
 * 
 * Ex.: HttpClient httpC = HttpClient .newBuilder() ->returns HttpClient
 * .cookieHandler(... val) ->returns HttpClient .followRedirects(... val)
 * ->returns HttpClient
 * 
 * .build();
 * 
 * All methods except build() return a type HttpClient
 * 
 * 
 */

public abstract class Property {

	// no fields,
	// only these getter declarations

	public abstract HomeType homeType();

	public abstract int stories();

	public abstract int bedrooms();

	public abstract boolean pool();

	/*
	 * this method is when you don't want to actually build the house yourself, and
	 * would prefer it came out-of-the-box
	 */

	public static Property defaultHouse() {

		return newBuilder().build(); // no setters in between

	}

	/*
	 * interface member called Builder its implementation will do most of the work
	 * of "building" the house
	 */

	public static interface Builder {

		/*
		 * all these methods can be called indefinitely -- until build() returns a Property with
		 * final values
		 * 
		 */

		Builder homeType(HomeType type);

		GeneralContractor hasPool(boolean b);

		Builder stories(int stories);

		Builder bedrooms(int bedrooms);

		Property build();
	}

	public static Builder newBuilder() {

		return new GeneralContractor();

	}

}

class GeneralContractor implements Property.Builder {

	HomeType homeType;
	int stories;
	int bedrooms;
	public boolean pool;

	// choose how many stories
	@Override
	public GeneralContractor stories(int stories) {
		this.stories = stories;
		return this;

	}

	// choose number of bedrooms
	@Override
	public GeneralContractor bedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
		return this;
	}

	@Override
	public GeneralContractor homeType(HomeType homeType) {
		this.homeType = homeType;
		return this;
	}

	@Override
	public Property build() {

		return new Home(this);
	}

	@Override
	public String toString() {
		return "Residence infoL: homeType=" + homeType + ", stories=" + stories + ", bedrooms=" + bedrooms + ", value="
				+ pool + "square feet";
	}

	@Override
	public GeneralContractor hasPool(boolean pool) {

		this.pool = pool;
		return this;
	}

}

class Home extends Property {

	private final HomeType homeType;
	private final int stories;
	private final int bedrooms;
	private final boolean pool;

	public Home(GeneralContractor builderImplementation) {

		/*
		 * since fields are final a default value will be assigned if none is passed
		 * 
		 */

		this.homeType = (builderImplementation.homeType == null) ? HomeType.SINGLE_FAMILY_HOME
				: builderImplementation.homeType;

		this.stories = (builderImplementation.stories == 0) ? 2 : builderImplementation.stories;

		this.bedrooms = (builderImplementation.bedrooms == 0) ? 4 : builderImplementation.bedrooms;

		this.pool = builderImplementation.pool;
	}

	/*
	 * 
	 * this creates the client by returning an object of its implementation with
	 * httpclient target typoe
	 * 
	 */

	public Property create(Home res) {
		return this;
	}

	//
	@Override
	public HomeType homeType() {
		return homeType;
	}

	@Override
	public int stories() {
		return stories;
	}

	@Override
	public int bedrooms() {

		return bedrooms;
	}

	@Override
	public boolean pool() {

		return this.pool;
	}

	@Override
	public String toString() {
		return "Home [homeType=" + homeType + ", stories=" + stories + ", bedrooms=" + bedrooms + ", pool=" + pool
				+ "]";
	}

}

enum HomeType {
	SINGLE_FAMILY_HOME, CONDO, MULTI_FAMILY_HOME, CO_OP
}

class DemoBuilder {

	public static void main(String[] args) {

		Property.newBuilder().bedrooms(5).bedrooms(2).

				stories(2).

				homeType(HomeType.CONDO).

				homeType(HomeType.SINGLE_FAMILY_HOME)

				.build();

	}
}
