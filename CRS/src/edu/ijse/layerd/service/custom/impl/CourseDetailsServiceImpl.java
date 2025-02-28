/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dto.CourseDetailsDto;
import edu.ijse.layerd.service.custom.CourseDetailsService;
import java.util.ArrayList;
import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.CourseDetailsDao;
import edu.ijse.layerd.entity.CourseDetailsEntity;

/**
 *
 * @author ravindusaranga
 */
public class CourseDetailsServiceImpl implements CourseDetailsService {
    private CourseDetailsDao courseDetailsDao = (CourseDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CourseDetails);
    @Override
    public String addCourse(CourseDetailsDto course) throws Exception {
       CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity(course.getCourseID(),course.getTitle(),course.getCreditHours(),course.getDepartment(),course.getPrerequisites(),course.getMaxEnrollmentCapacity());
       boolean isSaved = courseDetailsDao.save(courseDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }

    @Override
    public ArrayList<CourseDetailsDto> getAllCourses() throws Exception {
       ArrayList<CourseDetailsEntity> courseDetailsEntities = courseDetailsDao.getAll();
        ArrayList<CourseDetailsDto> courseDetailsDtos = new  ArrayList<>();
        
        for (CourseDetailsEntity courseDetailsEntity : courseDetailsEntities) {
            CourseDetailsDto dto = new CourseDetailsDto(courseDetailsEntity.getCourseID(),courseDetailsEntity.getTitle(),courseDetailsEntity.getCreditHours(),courseDetailsEntity.getDepartment(),courseDetailsEntity.getPrerequisites(),courseDetailsEntity.getMaxEnrollmentCapacity());
            courseDetailsDtos.add(dto);
        }
        return courseDetailsDtos;
    }
    
    
    public CourseDetailsDto searchCourse(String CourseID) throws Exception {
        CourseDetailsEntity courseDetailsEntity = courseDetailsDao.search(CourseID);
        if(courseDetailsEntity != null){
            return new CourseDetailsDto(courseDetailsEntity.getCourseID(),courseDetailsEntity.getTitle(),courseDetailsEntity.getCreditHours(),courseDetailsEntity.getDepartment(),courseDetailsEntity.getPrerequisites(),courseDetailsEntity.getMaxEnrollmentCapacity());
        }
        return null;
    }

    public String deleteCourse(String CourseID) throws Exception {
        boolean isDeleted = courseDetailsDao.delete(CourseID);
            return isDeleted ? "Success" : "Fail";
    }

    @Override
    public String updateCourse(CourseDetailsDto course) throws Exception {
       CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity(course.getCourseID(),course.getTitle(),course.getCreditHours(),course.getDepartment(),course.getPrerequisites(),course.getMaxEnrollmentCapacity());
       boolean isSaved = courseDetailsDao.update(courseDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }

    @Override
    public boolean updateCourseCapacity(String CourseID, int newCapacity) {
    try {
        // Fetch the course details
        CourseDetailsEntity courseDetailsEntity = courseDetailsDao.search(CourseID);
        
        if (courseDetailsEntity != null) {
            // Update the capacity
            courseDetailsEntity.setMaxEnrollmentCapacity(newCapacity);
            
            // Save the updated entity
            return courseDetailsDao.update(courseDetailsEntity);
        }
    } catch (Exception e) {
        System.err.println("Error updating course capacity: " + e.getMessage());
    }
    return false;
    }
}
