package com.bridgelabz;

// Java program to illustrate
// Connecting to the Database
import java.sql.*;
import java.sql.Driver;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String args[]) {
        String dbURL = "jdbc:mysql://localhost:3306/employee_details?useSSL=false";
        String username = "root";
        String password = "Resh@308";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (conn != null) {
            System.out.println("Connected");
        }
    }
}