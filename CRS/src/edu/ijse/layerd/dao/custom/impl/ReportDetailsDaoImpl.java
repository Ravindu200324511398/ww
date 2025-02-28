/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;
import edu.ijse.layerd.dao.custom.ReportDetailsDao;
import edu.ijse.layerd.entity.ReportDetailsEntity;
import java.util.ArrayList;
import edu.ijse.layerd.dao.CurdUtil;
import java.sql.ResultSet;

/**
 *
 * @author ravindusaranga
 */
public class ReportDetailsDaoImpl implements ReportDetailsDao{
    @Override
    public boolean save(ReportDetailsEntity t) throws Exception {       
         return CurdUtil.executeUpdate("INSERT INTO Enrollment VALUES (?,?,?,?)",
                 t.getStudentID(),t.getCourseID(),t.getSemester(),t.getGrade());
    }

    @Override
    public boolean update(ReportDetailsEntity t) throws Exception {
         return CurdUtil.executeUpdate("UPDATE Enrollment SET StudentID = ?, CourseID=?, Semester=?, Grade=?",
                 t.getStudentID(),t.getCourseID(),t.getSemester(),t.getGrade());
               
    }

    @Override
    public boolean delete(String StudentID) throws Exception {
          return CurdUtil.executeUpdate("DELETE from Enrollment WHERE StudentID=?", StudentID);
    }

    @Override
    public ReportDetailsEntity search(String StudentID) throws Exception {
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Enrollment WHERE StudentID=?", StudentID);
        if(rst.next()){
            return new ReportDetailsEntity(rst.getString("StudentID"),
                    rst.getString("CourseID"),
                    rst.getString("Semester"), 
                    rst.getString("Grade")
                    );
        }
        return null;
    }
    

    @Override
    public ArrayList<ReportDetailsEntity> getAll() throws Exception {
        ArrayList<ReportDetailsEntity> reportDetailsEntities = new ArrayList<>();
        ResultSet rst = CurdUtil.extecuteQuery("SELECT * from Enrollment");
        while(rst.next()){
            reportDetailsEntities.add(new ReportDetailsEntity(rst.getString("StudentID"),
                    rst.getString("CourseID"),
                    rst.getString("Semester"), 
                    rst.getString("Grade")
            ));
        }
        return reportDetailsEntities;
    }
    
}
