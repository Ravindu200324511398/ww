/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.FacultyDetailsDao;
import edu.ijse.layerd.dto.FacultyDetailsDto;
import edu.ijse.layerd.dto.StudentDetailsDto;
import edu.ijse.layerd.entity.FacultyDetailsEntity;
import edu.ijse.layerd.entity.StudentDetailsEntity;
import edu.ijse.layerd.service.custom.FacultyDetailsService;
import java.util.ArrayList;

/**
 *
 * @author ravindusaranga
 */
public class FacultyDetailsServiceImpl implements FacultyDetailsService{
private FacultyDetailsDao facultyDetailsDao = (FacultyDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.FacultyDetails);

    @Override
    public String add(FacultyDetailsDto faculty) throws Exception {
    FacultyDetailsEntity facultyDetailsEntity = new FacultyDetailsEntity(faculty.getFacultyID(),faculty.getName(),faculty.getDepartment(),faculty.getContact());
         boolean isSaved = facultyDetailsDao.save(facultyDetailsEntity);
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public ArrayList<FacultyDetailsDto> getAll() throws Exception {
        ArrayList<FacultyDetailsEntity> facultyDetailsEntities = facultyDetailsDao.getAll();
        ArrayList<FacultyDetailsDto> facultyDetailsDtos = new  ArrayList<>();
        
        for (FacultyDetailsEntity facultyDetailsEntity : facultyDetailsEntities) {
            FacultyDetailsDto dto = new FacultyDetailsDto(facultyDetailsEntity.getFacultyID(),facultyDetailsEntity.getName(),facultyDetailsEntity.getDepartment(),facultyDetailsEntity.getContact());
        }
        return facultyDetailsDtos;
    }

    @Override
    public FacultyDetailsDto search(String FacultyID) throws Exception {
        FacultyDetailsEntity facultyDetailsEntity = facultyDetailsDao.search(FacultyID);
        if(facultyDetailsEntity != null){
        return new FacultyDetailsDto(facultyDetailsEntity.getFacultyID(),facultyDetailsEntity.getName(),facultyDetailsEntity.getDepartment(),facultyDetailsEntity.getContact());
        }
        return null;
    }

    @Override
    public String delete(String FacultyID) throws Exception {
         boolean isDeleted = facultyDetailsDao.delete(FacultyID);
            return isDeleted ? "Success" : "Fail";
    }

    @Override
    public String update(FacultyDetailsDto faculty) throws Exception {
       FacultyDetailsEntity facultyDetailsEntity = new FacultyDetailsEntity(faculty.getFacultyID(),faculty.getName(),faculty.getDepartment(),faculty.getContact());
       boolean isSaved = facultyDetailsDao.update(facultyDetailsEntity);
       return isSaved ? "Success" : "Fail";
    }
    
}
