/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dto;

/**
 *
 * @author ravindusaranga
 */
public class FacultyDetailsDto {
    private String FacultyID;
    private String Name;
    private String Department;
    private String Contact;

    public FacultyDetailsDto(String FacultyID, String Name, String Department, String Contact) {
        this.FacultyID = FacultyID;
        this.Name = Name;
        this.Department = Department;
        this.Contact = Contact;
    }

    public String getFacultyID() {
        return FacultyID;
    }

    public void setFacultyID(String FacultyID) {
        this.FacultyID = FacultyID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "FacultyDetailsDto{" + "FacultyID=" + FacultyID + ", Name=" + Name + ", Department=" + Department + ", Contact=" + Contact + '}';
    }
    
}
