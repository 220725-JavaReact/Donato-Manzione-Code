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
	public Pirate readByName(String name) throws NoSuchElementException {
		for (Object p : readAll()) {
			Pirate pir = (Pirate)p;
			if (pir.getName().equals(name)) {
				return pir;
			}
		}
		throw new NoSuchElementException("There is no pirate called " + name);
	}

	@Override
	public Object[] readAll() {
		Object[] pirates =  TempStorage.pirates.getAllElements();
//		Arrays.printArray(pirates);
		return TempStorage.pirates.getAllElements();
	}

	@Override
	public void update(Pirate obj) {
		

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

}
