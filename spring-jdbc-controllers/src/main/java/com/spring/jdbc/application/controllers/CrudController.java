package com.spring.jdbc.application.controllers;

import java.sql.*;


import com.spring.jdbc.application.util.DatabaseConnection;

public class CrudController {
	private final Connection connection;

	public CrudController(DatabaseConnection connection) {		
		super();
		this.connection = connection.getConnection();
	}

	
	public void read() throws SQLException {
		//Read operation using prepared statement
		String selectFormat = """
				SELECT *
				FROM
				studentdata
				WHERE
                    roll_no = ?""";
		 PreparedStatement preparedStatement = connection.prepareStatement(selectFormat);
		
			preparedStatement.setInt(1, 3);
			ResultSet rs= preparedStatement.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No rows found");
			}else {
				int columnCount= rs.getMetaData().getColumnCount();
				System.out.println("column and types::");
				for (int i=0; i<columnCount; i++) {
					System.out.println(rs.getMetaData().getColumnName(i+1) +":"
							+rs.getMetaData().getColumnTypeName(i+1)+"\t");	
				}
				System.out.println("\nRecords: ");
				while (rs.next()) {
					for (int i=1; i<=columnCount; i++) {
						System.out.println(rs.getObject(i) +"\t");
					}
					System.out.println();
				}
			}
		}
					

	public void create() {
		//create (insert) operation using prepared statement
		String selectFormat = """
				INSERT INTO
				studentdata
				VALUES(?,?,?)""";
			
		try (PreparedStatement preparedStatement = connection.prepareStatement(selectFormat))
		{
			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "A");
			preparedStatement.setString(3, "Supriya");
			boolean rs= preparedStatement.execute();
			
				System.out.println("Records inserted successfully ");
								
			}
		catch (SQLException e) {
			System.out.println("Exception in create method of crud controller "+e);
			e.printStackTrace();
		}
				
	}

	public void update() {
		//update (update/replace) operation using prepared statement
		String selectFormat = """
				UPDATE studentdata
                        SET
                            Student_name = 'Tony'
                        WHERE
                            roll_no=6 """;
			
		try (PreparedStatement preparedStatement = connection.prepareStatement(selectFormat))
		{
			boolean rs= preparedStatement.execute();
			
				System.out.println("Records updated successfully ");
								
			}
		catch (SQLException e) {
			System.out.println("Exception in update method of crud controller "+e);
			e.printStackTrace();
		}
				
	}
	
	public void delete() {
		//update (update/replace) operation using prepared statement
		String selectFormat = """
				DELETE FROM studentdata
                        WHERE
                            Student_name = 'Tony'
                         """;
			
		try (PreparedStatement preparedStatement = connection.prepareStatement(selectFormat))
		{
			boolean rs= preparedStatement.execute();
			
				System.out.println("Records DELETED successfully ");
								
			}
		catch (SQLException e) {
			System.out.println("Exception in delete method of crud controller "+e);
			e.printStackTrace();
		}
				
	}
	
	
}
