package com.revature.pirateRev.dao;

import com.revature.pirateRev.models.LineItem;

public interface DAO<T> {
	public void create(T obj);

	public T readByName(String name);

	public void update(T obj);

	public Object[] readAll();

	void delete(T obj);

}
