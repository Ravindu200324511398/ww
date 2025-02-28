/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;

import edu.ijse.layerd.dto.FacultyDetailsDto;
import edu.ijse.layerd.dto.StudentDetailsDto;
import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ravindusaranga
 */
public interface FacultyDetailsService extends SuperService{
    public String add(FacultyDetailsDto faculty) throws Exception;
    public ArrayList<FacultyDetailsDto> getAll() throws Exception;
    public FacultyDetailsDto search(String FacultyID) throws Exception;
    public String delete(String FacultyID) throws Exception;
    public String update(FacultyDetailsDto facultyDto) throws Exception;
}
