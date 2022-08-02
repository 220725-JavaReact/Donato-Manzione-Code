package com.revature.pirateRev.dao;

import com.revature.pirateRev.exceptions.NoSuchElementException;
import com.revature.pirateRev.models.StoreFront;
import com.revature.pointsapp.booty.TempStorage;

public class StoreFrontDAO implements DAO<StoreFront> {

	@Override
	public void create(StoreFront obj) {
		
		
	}
	

	@Override
	public StoreFront readByName(String name) {
		for(Object storeObj : readAll()) {
			StoreFront store = (StoreFront) storeObj;
			if(store.getName().equals(name)) {
				return (StoreFront) store;
			}
		}
		throw new NoSuchElementException("There is no store called " + name);
	}

	@Override
	public void update(StoreFront obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] readAll() {
		
		return TempStorage.storeFronts.getAllElements();
	}

	

}
