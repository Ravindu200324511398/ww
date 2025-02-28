/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;
import edu.ijse.layerd.dto.StudentDetailsDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.StudentDetailsService;
import java.util.ArrayList;

/**
/**
 *
 * @author ravindusaranga
 */
public class StudentDetailsController {
    private StudentDetailsService studentDetailsService = 
    (StudentDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.StudentDetails);


    // ✅ Add Course
    public String addStudent(StudentDetailsDto student) throws Exception {
        return studentDetailsService.addStudent(student);
    }

    // ✅ Get All Courses
    public ArrayList<StudentDetailsDto> getAllStudents() throws Exception {
        return studentDetailsService.getAllStudents();
    } 

    // ✅ Search Course by ID
    public StudentDetailsDto searchStudent(String StudentID) throws Exception {
        return studentDetailsService.searchStudent(StudentID);
    }

    // ✅ Delete Course
    public String deleteStudent(String StudentID) throws Exception {
        return studentDetailsService.deleteStudent(StudentID);
    }

    // ✅ Update Course
    public String updateStudent(StudentDetailsDto studentDto) throws Exception {
        return studentDetailsService.updateStudent(studentDto);
    }
}
