/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dto;

/**
 *
 * @author ravindusaranga
 */
public class CourseDetailsDto {
    private String courseID;           
    private String title;               
    private double creditHours;         
    private String department;          
    private String prerequisites;       
    private int maxEnrollmentCapacity;  

    public CourseDetailsDto(String courseID, String title, double creditHours, String department, String prerequisites, int maxEnrollmentCapacity) {
        this.courseID = courseID;
        this.title = title;
        this.creditHours = creditHours;
        this.department = department;
        this.prerequisites = prerequisites;
        this.maxEnrollmentCapacity = maxEnrollmentCapacity;
    }

    
    public String getCourseID() { return courseID; }
    public void setCourseID(String courseID) { this.courseID = courseID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getCreditHours() { return creditHours; }
    public void setCreditHours(double creditHours) { this.creditHours = creditHours; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPrerequisites() { return prerequisites; }
    public void setPrerequisites(String prerequisites) { this.prerequisites = prerequisites; }

    public int getMaxEnrollmentCapacity() { return maxEnrollmentCapacity; }
    public void setMaxEnrollmentCapacity(int maxEnrollmentCapacity) { this.maxEnrollmentCapacity = maxEnrollmentCapacity; }

    @Override
    public String toString() {
        return "CourseDetailsDto{" + "courseID=" + courseID + ", title=" + title + ", creditHours=" + creditHours + ", department=" + department + ", prerequisites=" + prerequisites + ", maxEnrollmentCapacity=" + maxEnrollmentCapacity + '}';
    }
}
