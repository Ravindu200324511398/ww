/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;
import edu.ijse.layerd.dto.ReportDetailsDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.ReportDetailsService;
import java.util.ArrayList;

/**
/**
 *
 * @author ravindusaranga
 */
public class ReportDetailsController {
    private ReportDetailsService reportDetailsService = 
    (ReportDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ReportDetails);


    // ✅ Add Course
    public String add(ReportDetailsDto report) throws Exception {
        return reportDetailsService.add(report);
    }

    // ✅ Get All Courses
    public ArrayList<ReportDetailsDto> getAll() throws Exception {
        return reportDetailsService.getAll();
    } 

    // ✅ Search Course by ID
    public ReportDetailsDto search(String StudentID) throws Exception {
        return reportDetailsService.search(StudentID);
    }

    // ✅ Delete Course
    public String delete(String StudentID) throws Exception {
        return reportDetailsService.delete(StudentID);
    }

    // ✅ Update Course
    public String update(ReportDetailsDto reportDto) throws Exception {
        return reportDetailsService.update(reportDto);
    }
}
