/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;

import java.sql.Connection;
import edu.ijse.layerd.db.DBConnection;
import edu.ijse.layerd.dto.FacultyDetailsDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.FacultyDetailsService;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ravindusaranga
 */
public class FaclttyDetailsController {
    private FacultyDetailsService facultyDetailsService = 
    (FacultyDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.FacultyDetails);


    // ✅ Add Course
    public String add(FacultyDetailsDto faculty) throws Exception {
        return facultyDetailsService.add(faculty);
    }

    // ✅ Get All Courses
    //public ArrayList<FacultyDetailsDto> getAll() throws Exception {
        //return facultyDetailsService.getAll();
    //} 
    // ✅ Search Course by ID
    public FacultyDetailsDto search(String FacultyID) throws Exception {
        return facultyDetailsService.search(FacultyID);
    }

    // ✅ Delete Course
    public String delete(String FacultyID) throws Exception {
        return facultyDetailsService.delete(FacultyID);
    }

    // ✅ Update Course
    public String update(FacultyDetailsDto facultyDto) throws Exception {
        return facultyDetailsService.update(facultyDto);
    }
    public ArrayList<FacultyDetailsDto> getAll() {
    ArrayList<FacultyDetailsDto> facultyList = new ArrayList<>();
    try {
        String query = "SELECT * FROM Faculty_Details"; // Adjust table name if needed
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            FacultyDetailsDto faculty = new FacultyDetailsDto(
                rs.getString("FacultyID"), 
                rs.getString("Name"), 
                rs.getString("Department"), 
                rs.getString("Contact")
            );
            facultyList.add(faculty);
        }
        
        rs.close();
        ps.close();
        conn.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return facultyList;
}

}
