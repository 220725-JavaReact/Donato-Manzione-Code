package com.revature.pointsapp.booty;

import com.revature.pirateRev.collections.ArrayList;
import com.revature.pirateRev.models.StoreFront;

public class TempStorage {

	public static ArrayList pirates = new ArrayList();
	public static ArrayList storeFronts = new ArrayList() {{
			add(new StoreFront("Captain Branch"));
			add(new StoreFront("First Mate Branch"));
			add(new StoreFront("Quartermaster Branch"));
			add(new StoreFront("Sailing Master Branch"));
			add(new StoreFront("Gunner Branch"));
			add(new StoreFront("Powder Monkey Branch"));
			add(new StoreFront("Boatswain Branch"));
			add(new StoreFront("Surgeon Branch"));
			add(new StoreFront("Cook Branch"));
		}};
	
	
}
