/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2_GUI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author A2 Student
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Login() {
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
        inc_READY_ble = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        SubBodyPanel = new javax.swing.JPanel();
        LoginHeader = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        Password_label = new javax.swing.JLabel();
        EmployeeID_label = new javax.swing.JLabel();
        forgetpass_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PasswordField = new javax.swing.JPasswordField();
        ID = new javax.swing.JTextField();
        FooterPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SignupButton = new javax.swing.JButton();
        TitleBar = new javax.swing.JMenuBar();
        HOME = new javax.swing.JMenu();
        EXIT = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(199, 0, 57));
        HeaderPanel.setLayout(null);

        inc_READY_ble.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        inc_READY_ble.setForeground(new java.awt.Color(242, 242, 242));
        inc_READY_ble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inc_READY_ble.setText("inc-READY-ble!");
        HeaderPanel.add(inc_READY_ble);
        inc_READY_ble.setBounds(0, 2, 830, 44);

        BodyPanel.setBackground(new java.awt.Color(20, 30, 70));
        BodyPanel.setLayout(null);

        SubBodyPanel.setBackground(new java.awt.Color(255, 245, 224));

        LoginHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginHeader.setForeground(new java.awt.Color(255, 105, 105));
        LoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginHeader.setText("Login");

        LoginButton.setBackground(new java.awt.Color(20, 30, 70));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(242, 242, 242));
        LoginButton.setText("Log in");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        Password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_label.setText("Password");

        EmployeeID_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmployeeID_label.setText("Employee ID");

        forgetpass_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forgetpass_label.setForeground(new java.awt.Color(255, 105, 105));
        forgetpass_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgetpass_label.setText("Forget your password?");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        PasswordField.setMinimumSize(new java.awt.Dimension(35, 20));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubBodyPanelLayout = new javax.swing.GroupLayout(SubBodyPanel);
        SubBodyPanel.setLayout(SubBodyPanelLayout);
        SubBodyPanelLayout.setHorizontalGroup(
            SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SubBodyPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(SubBodyPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeID_label, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(forgetpass_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SubBodyPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubBodyPanelLayout.setVerticalGroup(
            SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubBodyPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LoginHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeID_label))
                .addGap(18, 18, 18)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_label))
                .addGap(22, 22, 22)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgetpass_label)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        BodyPanel.add(SubBodyPanel);
        SubBodyPanel.setBounds(120, 40, 590, 260);

        FooterPanel.setBackground(new java.awt.Color(255, 245, 224));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 105, 105));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Not a member yet?");

        SignupButton.setBackground(new java.awt.Color(20, 30, 70));
        SignupButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(242, 242, 242));
        SignupButton.setText("Account Sign Up");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(FooterPanel);
        FooterPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(SignupButton)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        BodyPanel.add(FooterPanel);
        FooterPanel.setBounds(120, 320, 585, 40);

        HOME.setText("HOME");
        TitleBar.add(HOME);

        EXIT.setText("EXIT");
        TitleBar.add(EXIT);

        setJMenuBar(TitleBar);

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
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try 
        {
            Connection database = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee_Accounts", "proj2", "Edatabase603");
            PreparedStatement script = database.prepareStatement("SELECT * FROM EMPLOYEE_DETAILS "
                                                            + "WHERE EMPLOYEE_ID = ? AND PASSWORD = ?");
            script.setString(1, ID.getText());
            script.setString(2, String.valueOf(PasswordField.getPassword()));
            ResultSet rs = script.executeQuery();
            //if else statement doesnt work as else cannot work through rs.next() -- EXPERIMENT COMMENT
            //instead used while loop
            while(rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "Successfully logged in.");
                Menu_and_Cart mac = new Menu_and_Cart();
                mac.setVisible(true);
            }
            JOptionPane.showMessageDialog(this, "Failed to log in due to an invalid username or password. Please try again.\n "
                                                    + "NOTE: Username contains an 'E' in the beginning followed by 4-numbers.");
            }
        catch (SQLException e) 
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
    SignUp newaccount = new SignUp();
    newaccount.setVisible(true);
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                new Login().setBackground(Color.red);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JMenu EXIT;
    private javax.swing.JLabel EmployeeID_label;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JMenu HOME;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTextField ID;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginHeader;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Password_label;
    private javax.swing.JButton SignupButton;
    private javax.swing.JPanel SubBodyPanel;
    private javax.swing.JMenuBar TitleBar;
    private javax.swing.JLabel forgetpass_label;
    private javax.swing.JLabel inc_READY_ble;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
