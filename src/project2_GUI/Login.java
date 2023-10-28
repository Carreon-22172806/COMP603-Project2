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
 * CAMILLE JOYCE CARREON
 * STUDENT ID 22172806
 * PROGRAM DESIGN AND CONSTRUCTION 
 * COMP603 -  SOFTWARE CONSTRUCTION
 * PROJECT 2 ASSIGNMENT
 * 
 */
public class Login extends javax.swing.JFrame {
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
        jSeparator1 = new javax.swing.JSeparator();
        PasswordField = new javax.swing.JPasswordField();
        ID = new javax.swing.JTextField();
        FooterPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SignupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(199, 0, 57));
        HeaderPanel.setLayout(null);

        inc_READY_ble.setFont(new java.awt.Font("Agency FB", 1, 55)); // NOI18N
        inc_READY_ble.setForeground(new java.awt.Color(242, 242, 242));
        inc_READY_ble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inc_READY_ble.setText("inc-READY-ble!");
        HeaderPanel.add(inc_READY_ble);
        inc_READY_ble.setBounds(0, 2, 830, 70);

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
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        Password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_label.setText("Password");

        EmployeeID_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmployeeID_label.setText("Employee ID");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        PasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PasswordField.setMinimumSize(new java.awt.Dimension(35, 20));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubBodyPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeID_label, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SubBodyPanelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubBodyPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(SubBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubBodyPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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
                .addGap(25, 25, 25)
                .addComponent(LoginButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BodyPanel.add(SubBodyPanel);
        SubBodyPanel.setBounds(120, 40, 590, 230);

        FooterPanel1.setBackground(new java.awt.Color(255, 245, 224));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 105, 105));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Not a member yet?");

        SignupButton.setBackground(new java.awt.Color(20, 30, 70));
        SignupButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(242, 242, 242));
        SignupButton.setText("Account Sign Up");
        SignupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterPanel1Layout = new javax.swing.GroupLayout(FooterPanel1);
        FooterPanel1.setLayout(FooterPanel1Layout);
        FooterPanel1Layout.setHorizontalGroup(
            FooterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(SignupButton)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        FooterPanel1Layout.setVerticalGroup(
            FooterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(FooterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        BodyPanel.add(FooterPanel1);
        FooterPanel1.setBounds(120, 300, 590, 50);

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
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("inc-READY-ble! Ordering System - LOGIN\n");

        pack();
        setLocationRelativeTo(null);
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
            //If else statement to redirect to another Jframe and to inform user for invalid access due to wrong information
            if(rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "Successfully logged in.");
                Menu_and_Cart mac = new Menu_and_Cart();
                mac.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(mac, "Welcome to the ORDERING SYSTEM!");
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Failed to log in due to an invalid username or password. Please try again.\n "
                                                    + "NOTE: Username contains an 'E' in the beginning followed by 4-numbers.");
            }
        }
        catch (SQLException e) 
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed
    
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
    SignUp newaccount = new SignUp();
    newaccount.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_SignupButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                new Login().setBackground(Color.red);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel EmployeeID_label;
    private javax.swing.JPanel FooterPanel1;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTextField ID;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginHeader;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Password_label;
    private javax.swing.JButton SignupButton;
    private javax.swing.JPanel SubBodyPanel;
    private javax.swing.JLabel inc_READY_ble;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
