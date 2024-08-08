package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/University";
        String username = "root";
        String password = "yourpassword";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM EngineeringStudent WHERE name LIKE 'John%'");

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Column 1: "  + resultSet.getString(1));
                System.out.println("Column 2: " + resultSet.getString(2));
            }

            // Close the connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
