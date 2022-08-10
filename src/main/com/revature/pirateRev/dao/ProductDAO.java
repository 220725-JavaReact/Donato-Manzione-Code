package com.revature.pirateRev.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.pirateRev.collections.ArrayList;
import com.revature.pirateRev.models.Product;
import com.revature.pirateRev.util.ConnectionFactory;

public class ProductDAO implements DAO<Product> {

	@Override
	public void create(Product obj) {

	}

	
	public Product readById(int id) {

		Product product = null;
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from products where product_id =" + id + ";";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			product = new Product();
			product.setStore(rs.getString("store_id"));
			product.setPrice(rs.getDouble("price"));
			product.setName(rs.getString("product_name"));
			product.setCategory(rs.getString("category"));
			product.setProductId(id);

		} catch (SQLException e) {

			System.out.println(e);
		}
		return product;
	}
	@Override
	public Product readByName(String name) {

		Product product = null;
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from products where product_name = '" + name + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			product = new Product();
			product.setStore(rs.getString("store_id"));
			product.setPrice(rs.getDouble("price"));
			product.setName(rs.getString("product_name"));
			product.setCategory(rs.getString("category"));

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return product;
	}

	@Override
	public void update(Product obj) {

	}

	@Override
	public void delete(Product product) {

	}

	@Override
	public Object[] readAll() {

		ArrayList<Product> products = new ArrayList<Product>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from products";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Product product = null;
			while (rs.next()) {
				product = new Product();
				product.setStore(rs.getString("store_id"));
				product.setPrice(rs.getDouble("price"));
				product.setName(rs.getString("product_name"));
				product.setCategory(rs.getString("category"));
				products.add(product);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return products.getAllElements();
	}

	public Object[] readAllByStoreName(String name) {

		ArrayList<Product> products = new ArrayList<Product>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from products where store_id = '" + name + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Product product = null;
			while (rs.next()) {
				product = new Product();
				product.setStore(rs.getString("store_id"));
				product.setPrice(rs.getDouble("price"));
				product.setName(rs.getString("product_name"));
				product.setCategory(rs.getString("category"));
				products.add(product);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return products.getAllElements();
	}

}
