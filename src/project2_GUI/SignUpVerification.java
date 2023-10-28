/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2_GUI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * CAMILLE JOYCE CARREON
 * STUDENT ID 22172806
 * PROGRAM DESIGN AND CONSTRUCTION 
 * COMP603 -  SOFTWARE CONSTRUCTION
 * PROJECT 2 ASSIGNMENT
 * 
 */
public class SignUpVerification extends javax.swing.JFrame {
    //including this value from SignUP() class to be used in the database query
    private String employeeID;
    
    public SignUpVerification(String employeeID) {
        this.employeeID = employeeID;
        initComponents();
    }

    public SignUpVerification() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        SubBodyPanel = new javax.swing.JPanel();
        SignupHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        first_textfield = new javax.swing.JTextField();
        second_textfield = new javax.swing.JTextField();
        third_textfield = new javax.swing.JTextField();
        fourth_textfield = new javax.swing.JTextField();
        ProceedButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(199, 0, 57));
        HeaderPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("inc-READY-ble!");
        HeaderPanel.add(jLabel1);
        jLabel1.setBounds(0, 2, 830, 70);

        BodyPanel.setBackground(new java.awt.Color(20, 30, 70));
        BodyPanel.setLayout(null);

        SubBodyPanel.setBackground(new java.awt.Color(255, 245, 224));

        SignupHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignupHeader.setForeground(new java.awt.Color(255, 105, 105));
        SignupHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignupHeader.setText("SignUp Verification");

        jSeparator1.setForeground(new java.awt.Color(255, 105, 105));

        first_textfield.setText("\n");
        first_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        second_textfield.setText("\n");
        second_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        third_textfield.setText("\n");
        third_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        fourth_textfield.setText("\n");
        fourth_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fourth_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourth_textfieldActionPerformed(evt);
            }
        });

        ProceedButton.setBackground(new java.awt.Color(20, 30, 70));
        ProceedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProceedButton.setForeground(new java.awt.Color(242, 242, 242));
        ProceedButton.setText("Proceed");
        ProceedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please fill in the following questions to verify your new account.");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Who is the greatest person you know?");
        jLabel3.setInheritsPopupMenu(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Which city were you born in?");
        jLabel4.setInheritsPopupMenu(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("What is your favourite dish?");
        jLabel5.setInheritsPopupMenu(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("How many siblings do you have?");
        jLabel6.setInheritsPopupMenu(false);

        javax.swing.GroupLayout SubBodyPanelLayout = new javax.swing.GroupLayout(SubBodyPanel);
        SubBodyPanel.setLayout(SubBodyPanelLayout);
        SubBodyPanelLayout.setHorizontalGroup(
            SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignupHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                        .addComponent(ProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                        .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(second_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(first_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fourth_textfield)
                                    .addComponent(third_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
                        .addGap(38, 38, 38))))
        );
        SubBodyPanelLayout.setVerticalGroup(
            SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubBodyPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SignupHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(second_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(third_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourth_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(ProceedButton)
                .addGap(24, 24, 24))
        );

        BodyPanel.add(SubBodyPanel);
        SubBodyPanel.setBounds(120, 30, 590, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("inc-READY-ble! Ordering System - ACCOUNT VERIFICATION");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedButtonActionPerformed
        try 
        {
            String first_answer = first_textfield.getText().trim();
            String second_answer = second_textfield.getText().trim();
            String third_answer = third_textfield.getText().trim();
            String fourth_answer = fourth_textfield.getText().trim();
            if(first_answer.isEmpty() || second_answer.isEmpty() || third_answer.isEmpty() || fourth_answer.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please don't leave the text fields empty. Try again.");  
            }
            else
            {
                Connection database = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee_Accounts", "proj2", "Edatabase603");
                Statement script = database.createStatement();
                script.executeUpdate("UPDATE EMPLOYEE_DETAILS SET FIRST_ANSWER = '"+first_answer+"', "
                        + "SECOND_ANSWER = '"+second_answer+"', "
                        + "THIRD_ANSWER = '"+third_answer+"', "
                        + "FOURTH_ANSWER = '"+fourth_answer+"' WHERE EMPLOYEE_ID = '" + employeeID + "'");
                
                JOptionPane.showMessageDialog(this, "Successfully verified!");
                    //redirecting to another Jframe (LogIn)
                Login log = new Login();
                log.setVisible(true); 
                this.dispose();
            }    
        } 
        catch (SQLException e) 
        {
            Logger.getLogger(SignUpVerification.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    }//GEN-LAST:event_ProceedButtonActionPerformed

    private void fourth_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourth_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourth_textfieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpVerification().setVisible(true);
                new SignUpVerification().setBackground(Color.red);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton ProceedButton;
    private javax.swing.JLabel SignupHeader;
    private javax.swing.JPanel SubBodyPanel;
    private javax.swing.JTextField first_textfield;
    private javax.swing.JTextField fourth_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField second_textfield;
    private javax.swing.JTextField third_textfield;
    // End of variables declaration//GEN-END:variables
}
