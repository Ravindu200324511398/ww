/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dto;

/**
 *
 * @author ravindusaranga
 */
public class ReportDetailsDto {
    private String StudentID;
    private String CourseID;
    private String Semester;
    private String Grade;
    

    public ReportDetailsDto(String StudentID,String CourseID, String Semester, String Grade) {
        this.StudentID = StudentID;
        this.CourseID = CourseID;
        this.Semester = Semester;
        this.Grade = Grade;
        
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "ReportDetailsDto{" + "StudentID=" + StudentID + ", CourseID=" + CourseID + ", Semester=" + Semester + ", Grade=" + Grade + '}';
    }

    
    
}
