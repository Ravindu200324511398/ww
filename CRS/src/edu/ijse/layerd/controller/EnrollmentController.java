package edu.ijse.layerd.controller;

import edu.ijse.layerd.db.DBConnection;
//import edu.ijse.layerd.model.Enrollment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//import java.util.List;

public class EnrollmentController {

    public boolean isStudentEnrolled(String studentID, String courseID) {
        try (Connection conn = DBConnection.getInstance().getConnection()) {
            String query = "SELECT COUNT(*) FROM Enrollment WHERE studentID = ? AND courseID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID);
            pstmt.setString(2, courseID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Student is already enrolled
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean enrollStudent(String studentID, String courseID) {
        try (Connection conn = DBConnection.getInstance().getConnection()) {
            String query = "INSERT INTO Enrollment (studentID, courseID) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID);
            pstmt.setString(2, courseID);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean enroll(String studentID, String courseID, String grade) {
    try (Connection conn = DBConnection.getInstance().getConnection()) {
        String query = "SELECT courseID, studentID, grade FROM Enrollment WHERE studentID = ? AND courseID = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, studentID);
        pstmt.setString(2, courseID);
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) { // If enrollment exists
            System.out.println("Course ID: " + rs.getString("courseID") + 
                               ", Student ID: " + rs.getString("studentID") + 
                               ", Grade: " + rs.getString("grade"));
            return true;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}

}
