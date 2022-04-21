package com.bridgelabz;

import java.sql.*;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String args[]) {
        Class.forName("com.mysql.jdbc.Driver");
        String dbURL = "jdbc:mysql://localhost:3306/employee_details";
        String username = "root";
        String password = "Resh@308";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            //create a query
            String q ="create table employee ( firstname varchar(200) not null, lastnamename varchar(200) not null , " +
                    "empid int not null" + "doj date not null )";
          Statement stmt=conn.createStatement();
          stmt.executeUpdate(q);
          conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (conn != null) {
            System.out.println("Connected");
            System.out.println("table created in database");

        }
    }
}