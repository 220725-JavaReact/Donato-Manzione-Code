package com.revature.pirateRev.dao;

public interface DAO<T> {
	public void create(T obj);

	public T readByName(String name);

	public void update(T obj);

	public void delete(String name);

	public T[] readAll();

}
