package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/dbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;

    public Connection getConnection() throws SQLException {
        if (connection != null && !connection.isClosed()){
            return connection;
        }
        return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
