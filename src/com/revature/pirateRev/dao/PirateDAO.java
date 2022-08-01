package com.revature.pirateRev.dao;

import com.revature.pirateRev.collections.ArrayList;
import com.revature.pirateRev.exceptions.NoSuchElementException;
import com.revature.pirateRev.models.Pirate;
import com.revature.pirateRev.util.Arrays;
import com.revature.pointsapp.booty.TempStorage;

public class PirateDAO implements DAO<Pirate> {

	@Override
	public void create(Pirate pirate) {
		TempStorage.pirates.add(pirate);
	}

	@Override
	public Pirate readByName(String name) {
		for (Pirate p : readAll()) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		throw new NoSuchElementException("There is no pirate called " + name);
	}

	@Override
	public Pirate[] readAll() {
		Pirate[] pirates = (Pirate[]) TempStorage.pirates.getAllElements();
		Arrays.printArray(pirates);
		return (Pirate[]) TempStorage.pirates.getAllElements();
	}

	@Override
	public void update(Pirate obj) {
		

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

}
