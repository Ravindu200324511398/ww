package edu.ijse.layerd.entity;


public class StudentProgress {
    private String courseId;
    private String grade;
    private String semester;

    public StudentProgress(String courseId, String grade, String semester) {
        this.courseId = courseId;
        this.grade = grade;
        this.semester = semester;
    }

    public String getCourseId() { return courseId; }
    public String getGrade() { return grade; }
    public String getSemester() { return semester; }
}