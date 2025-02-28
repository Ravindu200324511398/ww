/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.entity;

/**
 *
 * @author ravindusaranga
 */
public class StudentDetailsEntity {
    private String StudetID;
    private String Name;
    private String DateOfBirth;
    private String ProgramOfStudy;
    private Integer Year;
    private String Contact;

    public StudentDetailsEntity(String StudetID, String Name, String DateOfBirth, String ProgramOfStudy, Integer Year, String Contact) {
        this.StudetID = StudetID;
        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
        this.ProgramOfStudy = ProgramOfStudy;
        this.Year = Year;
        this.Contact = Contact;
    }

    public String getStudetID() {
        return StudetID;
    }

    public void setStudetID(String StudetID) {
        this.StudetID = StudetID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getProgramOfStudy() {
        return ProgramOfStudy;
    }

    public void setProgramOfStudy(String ProgramOfStudy) {
        this.ProgramOfStudy = ProgramOfStudy;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer Year) {
        this.Year = Year;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "StudentDetailsDto{" + "StudetID=" + StudetID + ", Name=" + Name + ", DateOfBirth=" + DateOfBirth + ", ProgramOfStudy=" + ProgramOfStudy + ", Year=" + Year + ", Contact=" + Contact + '}';
    }

}
