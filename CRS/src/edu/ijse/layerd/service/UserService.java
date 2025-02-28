/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service;

import edu.ijse.layerd.dao.UserDao;
import edu.ijse.layerd.dto.UserDto;
import java.sql.Connection;
/**
 *
 * @author ravindusaranga
 */
public class UserService {
     private UserDao userDao;

    public UserService(Connection connection) {
        this.userDao = new UserDao(connection);
    }

    public UserDto authenticate(String username, String password) {
        return userDao.authenticateUser(username, password);
    }
}
