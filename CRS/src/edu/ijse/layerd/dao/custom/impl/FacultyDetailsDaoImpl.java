/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;

import edu.ijse.layerd.dao.CurdUtil;
import edu.ijse.layerd.dao.custom.FacultyDetailsDao;
import edu.ijse.layerd.entity.FacultyDetailsEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ravindusaranga
 */
public class FacultyDetailsDaoImpl implements FacultyDetailsDao{

    @Override
    public boolean save(FacultyDetailsEntity t) throws Exception {
        return CurdUtil.executeUpdate("INSERT INTO Faculty_Details VALUES (?,?,?,?)",
                 t.getFacultyID(),t.getName(),t.getDepartment(),t.getContact());
    }

    @Override
    public boolean update(FacultyDetailsEntity t) throws Exception {
        return CurdUtil.executeUpdate("UPDATE Faculty_Details SET  Name=?, Department=?,Contact=? WHERE FacultyID=?",
                 t.getName(),t.getDepartment(),t.getContact(),t.getFacultyID()); 
    }


    @Override
    public boolean delete(String FacultyID) throws Exception {
         return CurdUtil.executeUpdate("DELETE from Faculty_Details WHERE FacultyID=?", FacultyID);
    }

    @Override
    public FacultyDetailsEntity search(String FacltyID) throws Exception {
         ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Faculty_Details WHERE FacultyID=?", FacltyID);
        if(rst.next()){
            return new FacultyDetailsEntity(rst.getString("FacultyID"),
                    rst.getString("Name"),
                    rst.getString("Department"), 
                    rst.getString("Contact"));
        }
        return null;
    }
    

    @Override
    public ArrayList<FacultyDetailsEntity> getAll() throws Exception {
        ArrayList<FacultyDetailsEntity> facultyDetailsEntities = new ArrayList<>();
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Faculty_Details");
        while(rst.next()){
            facultyDetailsEntities.add(new FacultyDetailsEntity(rst.getString("FacultyID"),
                    rst.getString("Name"),
                    rst.getString("Department"), 
                    rst.getString("Contact")));
        }
        return facultyDetailsEntities;
    }
}
