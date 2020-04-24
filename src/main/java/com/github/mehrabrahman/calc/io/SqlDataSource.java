package com.github.mehrabrahman.calc.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataSource {
    private static SqlDataSource instance;
    private String url;
    private String user;
    private String password;

    private SqlDataSource() {
        url = System.getProperty("database.url", "jdbc:postgresql://localhost:5432/opsdb");
        user = System.getProperty("database.username", "opsdb");
        password = System.getProperty("database.password", "opsdb");
    }

    public static SqlDataSource getInstance() {
        if (instance == null) {
            instance = new SqlDataSource();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}