package main.com.revature.pirateRev.booty;
import main.com.revature.pirateRev.collections.ArrayList;
import main.com.revature.pirateRev.models.Pirate;
import main.com.revature.pirateRev.models.StoreFront;

public class TempStorage {

	public static ArrayList<Pirate> pirates = new ArrayList<Pirate>();
	public static ArrayList<StoreFront> storeFronts = new ArrayList<StoreFront>() {{

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
