package com.jdbcDemo;
import java.sql.*;
public class JdbcDemo {
	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final String url = "jdbc:mysql://localhost:3306/newjavadb";
        final String username = "root";
        final String password = "kanika@17";

        System.out.println("Establishing a connection to the database...\n");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            /* Fetching some DB metadata */
            System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion()
                    + "\n");

            System.out.println("USING STATEMENT:: ");
            try (Statement statement = connection.createStatement()) {

                System.out.println("Create operation:");
                String insertSql = """
                        INSERT INTO studentdata
                        VALUES (
                            7, 'A', 'Stark')""";
                int rowsInserted = statement.executeUpdate(insertSql);
                System.out.println(rowsInserted + " rows inserted.");
                System.out.println();

                System.out.println("Read//Retrieve operation:");
                String selectAllSql = """
                        SELECT
                            *
                        FROM
                            studentdata
                        """;
                ResultSet result = statement.executeQuery(selectAllSql);
                System.out.println("roll_no\tgrade\tStudent_name");
                while (result.next()) {
                    int rollNo = result.getInt("roll_no");
                    String grade = result.getString("grade");
                    String studentName = result.getString("Student_name");
                    
                    System.out.println(
                            String.format(
                                    "%d\t%s\t%s",
                                    rollNo,
                                    grade,
                                    studentName));
                }
                System.out.println();

                System.out.println("Update operation:");
                String updateSql1 = """
                        UPDATE studentdata
                        SET
                            Student_name = 'Tony'
                        WHERE
                            roll_no = 2""";
                int rowsUpdated = statement.executeUpdate(updateSql1);
                System.out.println(rowsUpdated + "  rows updated.");
                System.out.println();
            }
        }
	}
            

}
