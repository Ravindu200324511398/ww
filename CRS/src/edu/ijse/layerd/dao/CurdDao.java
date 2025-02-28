/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.dao;
import java.util.ArrayList;

/**
 *
 * @author ravindusaranga
 */
public interface CurdDao<T, ID> extends SuperDao {
    boolean save(T t) throws Exception;
    boolean update(T t) throws Exception;
    boolean delete(ID iD) throws Exception;
    T search(ID iD) throws Exception;
    ArrayList<T> getAll() throws Exception;
}
