package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ! Return Connection Object
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/bootcamp_2603";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
