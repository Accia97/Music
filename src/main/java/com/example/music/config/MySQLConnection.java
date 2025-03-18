package com.example.music.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Kmarong1997.";
    public static Connection open() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
