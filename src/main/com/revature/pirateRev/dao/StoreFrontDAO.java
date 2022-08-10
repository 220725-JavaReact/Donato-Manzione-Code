package com.revature.pirateRev.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.pirateRev.collections.ArrayList;
import com.revature.pirateRev.exceptions.NoSuchElementException;
import com.revature.pirateRev.models.StoreFront;
import com.revature.pirateRev.util.ConnectionFactory;

public class StoreFrontDAO implements DAO<StoreFront> {

	@Override
	public void create(StoreFront obj) {

	}

	@Override
	public StoreFront readByName(String name) {
		for (Object storeObj : readAll()) {
			System.out.println(storeObj);
			StoreFront store = (StoreFront) storeObj;
			if (store.getName().equalsIgnoreCase(name)) {
				return store;
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
		ArrayList<StoreFront> stores = new ArrayList<StoreFront>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from store_front";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			StoreFront store = null;
			while (rs.next()) {
				store = new StoreFront();
				store.setAddress(rs.getString("address"));
				store.setName(rs.getString("store_name"));
				stores.add(store);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stores.getAllElements();
	}

}
