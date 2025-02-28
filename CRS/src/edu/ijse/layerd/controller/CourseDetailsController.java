
package edu.ijse.layerd.controller;

import edu.ijse.layerd.dto.CourseDetailsDto;
import java.util.ArrayList;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.CourseDetailsService;

/**
 *
 * @author ravindusaranga
 */
public class CourseDetailsController {
    private CourseDetailsService courseDetailsService = 
    (CourseDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CourseDetails);


    // ✅ Add Course
    public String addCourse(CourseDetailsDto course) throws Exception {
        return courseDetailsService.addCourse(course);
    }

    // ✅ Get All Courses
    public ArrayList<CourseDetailsDto> getAllCourses() throws Exception {
        return courseDetailsService.getAllCourses();
    } 

    // ✅ Search Course by ID
    public CourseDetailsDto searchCourse(String CourseID) throws Exception {
        return courseDetailsService.searchCourse(CourseID);
    }

    // ✅ Delete Course
    public String deleteCourse(String CourseID) throws Exception {
        return courseDetailsService.deleteCourse(CourseID);
    }

    // ✅ Update Course
    public String updateCourse(CourseDetailsDto courseDto) throws Exception {
        return courseDetailsService.updateCourse(courseDto);
    }

    public boolean updateCourseCapacity(String CourseID, int newCapacity) {
    try {
        return courseDetailsService.updateCourseCapacity(CourseID, newCapacity);
    } catch (Exception e) {
        System.err.println("Error updating course capacity: " + e.getMessage());
        return false;
    }
    }

    
}
