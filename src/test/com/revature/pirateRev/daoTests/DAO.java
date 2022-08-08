package com.revature.pirateRev.daoTests;

import com.revature.pirateRev.util.Test;

public interface DAO<T> {

	@Test
	public void testCreate(T obj);

	@Test
	public void testReadByName(String name);

	@Test
	public void testUpdate(T obj);

	@Test
	public void testDelete(String name);

	@Test
	public void testReadAll();

}
