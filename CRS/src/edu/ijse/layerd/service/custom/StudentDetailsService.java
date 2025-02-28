/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;
import edu.ijse.layerd.dto.StudentDetailsDto;
//import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;
import edu.ijse.layerd.service.SuperService;

/**
 *
 * @author ravindusaranga
 */
public interface StudentDetailsService extends SuperService{
    public String addStudent(StudentDetailsDto student) throws Exception;
    public ArrayList<StudentDetailsDto> getAllStudents() throws Exception;
    public StudentDetailsDto searchStudent(String StudentID) throws Exception;
    public String deleteStudent(String StudentID) throws Exception;
    public String updateStudent(StudentDetailsDto studentDto) throws Exception;
}
