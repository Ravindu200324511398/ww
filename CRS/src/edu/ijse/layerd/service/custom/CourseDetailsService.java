/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;
import edu.ijse.layerd.dto.CourseDetailsDto;
import java.util.ArrayList;
import edu.ijse.layerd.service.SuperService;
/**
 *
 * @author ravindusaranga
 */
public interface CourseDetailsService extends SuperService{
    public String addCourse(CourseDetailsDto course) throws Exception;
    public ArrayList<CourseDetailsDto> getAllCourses() throws Exception;
    public CourseDetailsDto searchCourse(String CourseID) throws Exception;
    public String deleteCourse(String CourseID) throws Exception;
    public String updateCourse(CourseDetailsDto courseDto) throws Exception;
    public boolean updateCourseCapacity(String CourseID, int newCapacity);
}
