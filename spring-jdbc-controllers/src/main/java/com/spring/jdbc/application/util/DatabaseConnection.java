package com.spring.jdbc.application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private Connection connection = null;

	public DatabaseConnection(String url, String username, String password) throws SQLException{
		super();
		this.connection = DriverManager.getConnection(url, username, password);
	}
	
	public void printConnectionDetails() throws SQLException {
		System.out.println("Connected to database server:"
				+this.connection.getMetaData().getDatabaseProductName()
				+ "version: "
				+this.connection.getMetaData().getDatabaseProductVersion());
	}
	
	public Connection getConnection() {
		return connection;
		
	}
}
