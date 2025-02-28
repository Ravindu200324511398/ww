/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ravindusaranga
 */
/*public class DBConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/CRSPROGRAM";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlQ1W3e5r7";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}*/
/*public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRSPROGRAM", "root", "mysqlQ1W3e5r7");

    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}*/
/*public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRSPROGRAM", "root", "mysqlQ1W3e5r7");
        } catch (Exception e) {
            throw new RuntimeException("Database Connection Error: " + e.getMessage());
        }
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {  // Ensure connection is open
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRSPROGRAM", "root", "mysqlQ1W3e5r7");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error getting DB connection: " + e.getMessage());
        }
        return connection;
    }
}*/
public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    // Private constructor to prevent instantiation
    private DBConnection() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the database connection
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRSPROGRAM", "root", "mysqlQ1W3e5r7");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Database Connection Error: " + e.getMessage(), e);
        }
    }

    // Thread-safe Singleton instance
    public static synchronized DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    // Method to get the database connection
    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // Re-establish the connection if it is closed or null
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRSPROGRAM", "root", "mysqlQ1W3e5r7");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error getting DB connection: " + e.getMessage(), e);
        }
        return connection;
    }

    // Method to close the database connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error closing DB connection: " + e.getMessage(), e);
            }
        }
    }

    // Method to validate the connection
    public boolean isConnectionValid() {
        if (connection != null) {
            try {
                return connection.isValid(5); // Check if the connection is valid within 5 seconds
            } catch (SQLException e) {
                throw new RuntimeException("Error validating DB connection: " + e.getMessage(), e);
            }
        }
        return false;
    }
}
