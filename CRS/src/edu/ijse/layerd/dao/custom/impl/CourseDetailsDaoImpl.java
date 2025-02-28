/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;

import edu.ijse.layerd.dao.custom.CourseDetailsDao;
import edu.ijse.layerd.entity.CourseDetailsEntity;
import java.util.ArrayList;
import edu.ijse.layerd.dao.CurdUtil;
import java.sql.ResultSet;

/**
 *
 * @author ravindusaranga
 */
public  class CourseDetailsDaoImpl implements CourseDetailsDao{

    @Override
    public boolean save(CourseDetailsEntity t) throws Exception {       
         return CurdUtil.executeUpdate("INSERT INTO Course_Details VALUES (?,?,?,?,?,?)",
                 t.getCourseID(),t.getTitle(),t.getCreditHours(),t.getDepartment(),t.getPrerequisites(),t.getMaxEnrollmentCapacity());
    }

    @Override
    public boolean update(CourseDetailsEntity t) throws Exception {
         return CurdUtil.executeUpdate("UPDATE Course_Details SET Title = ?, CreditHours=?, Department=?, Prerequisites=?,MaxEnrollmentCapacity=? WHERE CourseID=?",
                 t.getTitle(),t.getCreditHours(),t.getDepartment(),t.getPrerequisites(),t.getMaxEnrollmentCapacity(),t.getCourseID());
               
    }

    @Override
    public boolean delete(String CourseID) throws Exception {
          return CurdUtil.executeUpdate("DELETE from Course_Details WHERE CourseID=?", CourseID);
    }


    @Override
    public CourseDetailsEntity search(String CourseID) throws Exception {
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Course_Details WHERE CourseID=?", CourseID);
        if(rst.next()){
            return new CourseDetailsEntity(rst.getString("CourseID"),
                    rst.getString("Title"),
                    rst.getDouble("CreditHours"), 
                    rst.getString("Department"),
                    rst.getString("Prerequisites"),
                    rst.getInt("MaxEnrollmentCapacity"));
        }
        return null;
    }
    

    @Override
    public ArrayList<CourseDetailsEntity> getAll() throws Exception {
        ArrayList<CourseDetailsEntity> courseDetailsEntities = new ArrayList<>();
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Course_Details");
        while(rst.next()){
            courseDetailsEntities.add(new CourseDetailsEntity(rst.getString("CourseID"),
                    rst.getString("Title"),
                    rst.getDouble("CreditHours"), 
                    rst.getString("Department"),
                    rst.getString("prerequisites"),
                    rst.getInt("MaxEnrollmentCapacity")));
        }
        return courseDetailsEntities;
    }

    

    
    
}
