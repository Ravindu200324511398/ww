/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;
import edu.ijse.layerd.dao.custom.StudentDetailsDao;
import edu.ijse.layerd.entity.StudentDetailsEntity;
import java.util.ArrayList;
import edu.ijse.layerd.dao.CurdUtil;
import java.sql.ResultSet;

/**
 *
 * @author ravindusaranga
 */
public class StudentDetailsDaoImpl implements StudentDetailsDao{
    @Override
    public boolean save(StudentDetailsEntity t) throws Exception {       
         return CurdUtil.executeUpdate("INSERT INTO Student_Details VALUES (?,?,?,?,?,?)",
                 t.getStudetID(),t.getName(),t.getDateOfBirth(),t.getProgramOfStudy(),t.getYear(),t.getContact());
    }

    @Override
    public boolean update(StudentDetailsEntity t) throws Exception {
         return CurdUtil.executeUpdate("UPDATE Student_Details SET Name = ?, DateOfBirth=?, ProgramOfStudy=?, Year=?,Contact=? WHERE StudentID=?",
                 t.getName(),t.getDateOfBirth(),t.getProgramOfStudy(),t.getYear(),t.getContact(),t.getStudetID());
               
    }

    @Override
    public boolean delete(String StudentID) throws Exception {
          return CurdUtil.executeUpdate("DELETE from Student_Details WHERE StudentID=?", StudentID);
    }

    @Override
    public StudentDetailsEntity search(String StudentID) throws Exception {
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Student_Details WHERE StudentID=?", StudentID);
        if(rst.next()){
            return new StudentDetailsEntity(rst.getString("studentID"),
                    rst.getString("Name"),
                    rst.getString("DateOfBirth"), 
                    rst.getString("ProgramOfStudy"),
                    rst.getInt("Year"),
                    rst.getString("Contact"));
        }
        return null;
    }
    

    @Override
    public ArrayList<StudentDetailsEntity> getAll() throws Exception {
        ArrayList<StudentDetailsEntity> studentDetailsEntities = new ArrayList<>();
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Student_Details");
        while(rst.next()){
            studentDetailsEntities.add(new StudentDetailsEntity(rst.getString("StudentID"),
                    rst.getString("Name"),
                    rst.getString("DateOfBirth"), 
                    rst.getString("ProgramOfStudy"),
                    rst.getInt("Year"),
                    rst.getString("Contact")));
        }
        return studentDetailsEntities;
    }
    
}
