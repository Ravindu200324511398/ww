/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;
import edu.ijse.layerd.dto.ReportDetailsDto;
//import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;
import edu.ijse.layerd.service.SuperService;

/**
 *
 * @author ravindusaranga
 */
public interface ReportDetailsService extends SuperService{
    public String add(ReportDetailsDto report) throws Exception;
    public ArrayList<ReportDetailsDto> getAll() throws Exception;
    public ReportDetailsDto search(String StudentID) throws Exception;
    public String delete(String StudentID) throws Exception;
    public String update(ReportDetailsDto reportDto) throws Exception;
}
