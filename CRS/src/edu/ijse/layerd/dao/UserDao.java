/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao;
import edu.ijse.layerd.dto.UserDto;
import java.sql.*;
import edu.ijse.layerd.db.DBConnection;
import java.sql.Connection;

/**
 *
 * @author ravindusaranga
 */
public class UserDao {
    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public UserDao() {
    }

    public UserDto authenticateUser(String username, String password) {
        String query = "SELECT username, password, role_id FROM users WHERE username = ? AND password = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new UserDto(rs.getString("username"), rs.getString("password"), rs.getInt("role_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean registerUser(UserDto user) throws Exception {
        String sql = "INSERT INTO users (username, password,role_id) VALUES (?, ?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setInt(3, user.getRoleID());
        return pstmt.executeUpdate() > 0;
    }
}
