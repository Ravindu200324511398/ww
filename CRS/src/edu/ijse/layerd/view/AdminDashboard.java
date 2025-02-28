/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.layerd.view;
import edu.ijse.layerd.db.DBConnection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import edu.ijse.layerd.view.StudentDetailsView;

/**
 *
 * @author ravindusaranga
 */
public class AdminDashboard extends javax.swing.JFrame {
//private AdminService adminService;
    //private String adminID;
    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
    }
public AdminDashboard(String adminID) {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnStudentDetails = new javax.swing.JButton();
        btnFacultyDetails = new javax.swing.JButton();
        btnCourseDetails = new javax.swing.JButton();
        btnreports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AdminDashBoard");

        jLabel2.setFont(new java.awt.Font("Herculanum", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Welcome         To        AdminDashBoard");

        jButton1.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnStudentDetails.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        btnStudentDetails.setForeground(new java.awt.Color(102, 102, 102));
        btnStudentDetails.setText("Student Details");
        btnStudentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentDetailsActionPerformed(evt);
            }
        });

        btnFacultyDetails.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        btnFacultyDetails.setForeground(new java.awt.Color(102, 102, 102));
        btnFacultyDetails.setText("Faculty Details");
        btnFacultyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyDetailsActionPerformed(evt);
            }
        });

        btnCourseDetails.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        btnCourseDetails.setForeground(new java.awt.Color(102, 102, 102));
        btnCourseDetails.setText("Course Details");
        btnCourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseDetailsActionPerformed(evt);
            }
        });

        btnreports.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        btnreports.setForeground(new java.awt.Color(102, 102, 102));
        btnreports.setText("Reports");
        btnreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 375, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(layout.createSequentialGroup()
                .addGap(641, 641, 641)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnFacultyDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(btnCourseDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStudentDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnFacultyDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStudentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnreports, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Logging out...");
        dispose();
        new UserView().setVisible(true); // Redirect to login

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnStudentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentDetailsActionPerformed
        JOptionPane.showMessageDialog(this, "Student Details...");
        dispose();
        new StudentDetailsView().setVisible(true);
    }//GEN-LAST:event_btnStudentDetailsActionPerformed

    private void btnFacultyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyDetailsActionPerformed
        JOptionPane.showMessageDialog(this, "Faculty Details...");
        dispose();
        new FacultyDetailsView().setVisible(true);
    }//GEN-LAST:event_btnFacultyDetailsActionPerformed

    private void btnCourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseDetailsActionPerformed
        JOptionPane.showMessageDialog(this, "Course Details...");
        dispose();
        new CourseDetailsView().setVisible(true);
    }//GEN-LAST:event_btnCourseDetailsActionPerformed

    private void btnreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportsActionPerformed
        JOptionPane.showMessageDialog(this, "Reports Details...");
        dispose();
        new Report().setVisible(true);
    }//GEN-LAST:event_btnreportsActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseDetails;
    private javax.swing.JButton btnFacultyDetails;
    private javax.swing.JButton btnStudentDetails;
    private javax.swing.JButton btnreports;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
