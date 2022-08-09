package com.revature.pirateRev.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.pirateRev.models.StoreFront;
import com.revature.pirateRev.util.ConnectionFactory;

public class LineOrderDAO implements DAO<StoreFront> {
	
	
	public static void main(String[] args) {
		try{
			ConnectionFactory cFactory = ConnectionFactory.getInstance();
			Connection conn = cFactory.getConnection();
			String query = "select * from pirates";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
		
		
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	@Override
	public void create(StoreFront obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public StoreFront readByName(String name) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
