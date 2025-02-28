/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.StudentDetailsDao;
import edu.ijse.layerd.dto.StudentDetailsDto;
import edu.ijse.layerd.entity.StudentDetailsEntity;
import edu.ijse.layerd.service.custom.StudentDetailsService;
import java.util.ArrayList;

/**
 *
 * @author ravindusaranga
 */
public class StudentDetailsServiceImpl implements StudentDetailsService{
    private StudentDetailsDao studentDetailsDao = (StudentDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.StudentDetails);

    
    @Override
    public String addStudent(StudentDetailsDto student) throws Exception {
        StudentDetailsEntity studentDetailsEntity = new StudentDetailsEntity(student.getStudetID(),student.getName(),student.getDateOfBirth(),student.getProgramOfStudy(),student.getYear(),student.getContact());
         boolean isSaved = studentDetailsDao.save(studentDetailsEntity);
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public ArrayList<StudentDetailsDto> getAllStudents() throws Exception {
        ArrayList<StudentDetailsEntity> studentDetailsEntities = studentDetailsDao.getAll();
        ArrayList<StudentDetailsDto> studentDetailsDtos = new  ArrayList<>();
        
        for (StudentDetailsEntity studentDetailsEntity : studentDetailsEntities) {
            StudentDetailsDto dto = new StudentDetailsDto(studentDetailsEntity.getStudetID(),studentDetailsEntity.getName(),studentDetailsEntity.getDateOfBirth(),studentDetailsEntity.getProgramOfStudy(),studentDetailsEntity.getYear(),studentDetailsEntity.getContact());
            studentDetailsDtos.add(dto);
        }
        return studentDetailsDtos;
    }

    @Override
    public StudentDetailsDto searchStudent(String StudentID) throws Exception {
        StudentDetailsEntity studentDetailsEntity = studentDetailsDao.search(StudentID);
        if(studentDetailsEntity != null){
        return new StudentDetailsDto(studentDetailsEntity.getStudetID(),studentDetailsEntity.getName(),studentDetailsEntity.getDateOfBirth(),studentDetailsEntity.getProgramOfStudy(),studentDetailsEntity.getYear(),studentDetailsEntity.getContact());
        }
        return null;
    }

    @Override
    public String deleteStudent(String StudentID) throws Exception {
        boolean isDeleted = studentDetailsDao.delete(StudentID);
            return isDeleted ? "Success" : "Fail";
    }

    @Override
    public String updateStudent(StudentDetailsDto student) throws Exception {
        StudentDetailsEntity studentDetailsEntity = new StudentDetailsEntity(student.getStudetID(),student.getName(),student.getDateOfBirth(),student.getProgramOfStudy(),student.getYear(),student.getContact());
       boolean isSaved = studentDetailsDao.update(studentDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }
}
