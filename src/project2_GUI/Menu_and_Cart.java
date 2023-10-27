/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2_GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
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
public class Menu_and_Cart extends javax.swing.JFrame {
    
    //for calculations
    private double food_tax = .13d;
    

    
    int quantity;   //invoice value when button clicked.

    public Menu_and_Cart() 
    {
        initComponents();
    }

    private void clear()
    {
        int warningPopUp = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel your order?");
        if(warningPopUp == JOptionPane.YES_OPTION)
        {
            cartPanel.setText("No orders added.");
        }   
        else if (warningPopUp == JOptionPane.NO_OPTION)
        {
            if(cartPanel.getText() == null || cartPanel.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Unable to cancel as the cart is empty.");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Continuing order...");
            }
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_Panel = new javax.swing.JPanel();
        inc_READY_ble = new javax.swing.JLabel();
        Body_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        total = new javax.swing.JLabel();
        cartPane = new javax.swing.JScrollPane();
        cartPanel = new javax.swing.JLabel();
        Category_foods = new javax.swing.JLabel();
        Category_sides = new javax.swing.JLabel();
        Category_drinks = new javax.swing.JLabel();
        print_invoice = new javax.swing.JButton();
        nachos_title = new javax.swing.JLabel();
        nachos_price = new javax.swing.JLabel();
        nachos_button = new javax.swing.JButton();
        burger_title = new javax.swing.JLabel();
        burger_price = new javax.swing.JLabel();
        burger_button = new javax.swing.JButton();
        pizza_price = new javax.swing.JLabel();
        pizza_title = new javax.swing.JLabel();
        pizza_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        cancelOrder_button = new javax.swing.JButton();
        voidItem_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        Header_Panel.setBackground(new java.awt.Color(199, 0, 57));
        Header_Panel.setLayout(null);

        inc_READY_ble.setFont(new java.awt.Font("Agency FB", 1, 55)); // NOI18N
        inc_READY_ble.setForeground(new java.awt.Color(242, 242, 242));
        inc_READY_ble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inc_READY_ble.setText("inc-READY-ble!");
        Header_Panel.add(inc_READY_ble);
        inc_READY_ble.setBounds(0, 2, 830, 70);

        Body_Panel.setBackground(new java.awt.Color(20, 30, 70));
        Body_Panel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 245, 224));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 105, 105));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to inc-READY-ble!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Click on an item to add to your order.");

        total.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cartPanel.setText("No orders added.");
        cartPanel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cartPane.setViewportView(cartPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartPane, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total)
                .addContainerGap())
        );

        Body_Panel.add(jPanel2);
        jPanel2.setBounds(10, 20, 240, 290);

        Category_foods.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Category_foods.setForeground(new java.awt.Color(255, 105, 105));
        Category_foods.setText("FOODS");
        Body_Panel.add(Category_foods);
        Category_foods.setBounds(260, 10, 70, 25);

        Category_sides.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Category_sides.setForeground(new java.awt.Color(255, 105, 105));
        Category_sides.setText("SIDES");
        Body_Panel.add(Category_sides);
        Category_sides.setBounds(260, 150, 50, 25);

        Category_drinks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Category_drinks.setForeground(new java.awt.Color(255, 105, 105));
        Category_drinks.setText("DRINKS");
        Body_Panel.add(Category_drinks);
        Category_drinks.setBounds(260, 290, 70, 20);

        print_invoice.setBackground(new java.awt.Color(199, 0, 57));
        print_invoice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        print_invoice.setForeground(new java.awt.Color(242, 242, 242));
        print_invoice.setText("PRINT INVOICE");
        print_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_invoiceActionPerformed(evt);
            }
        });
        Body_Panel.add(print_invoice);
        print_invoice.setBounds(10, 370, 230, 40);

        nachos_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nachos_title.setForeground(new java.awt.Color(255, 105, 105));
        nachos_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nachos_title.setLabelFor(nachos_button);
        nachos_title.setText("<html><CENTER>Loaded<br />Nachos</CENTER></html>");
        Body_Panel.add(nachos_title);
        nachos_title.setBounds(350, 60, 80, 30);

        nachos_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        nachos_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nachos_price.setLabelFor(nachos_button);
        nachos_price.setText("$3.49");
        nachos_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(nachos_price);
        nachos_price.setBounds(340, 95, 100, 20);

        nachos_button.setBackground(new java.awt.Color(255, 245, 224));
        nachos_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Loaded Nachos-.png"))); // NOI18N
        nachos_button.setAlignmentY(0.0F);
        nachos_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nachos_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nachos_button.setIconTextGap(10);
        nachos_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachos_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(nachos_button);
        nachos_button.setBounds(260, 40, 180, 89);

        burger_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        burger_title.setForeground(new java.awt.Color(255, 105, 105));
        burger_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burger_title.setLabelFor(burger_button);
        burger_title.setText("<html><CENTER>Beast<br/>Burger</CENTER></html>");
        burger_title.setAlignmentY(0.0F);
        Body_Panel.add(burger_title);
        burger_title.setBounds(540, 60, 80, 30);

        burger_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        burger_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burger_price.setText("$7.99");
        Body_Panel.add(burger_price);
        burger_price.setBounds(540, 90, 80, 30);

        burger_button.setBackground(new java.awt.Color(255, 245, 224));
        burger_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/burger-.png"))); // NOI18N
        burger_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        burger_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burger_button.setIconTextGap(10);
        burger_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(burger_button);
        burger_button.setBounds(450, 40, 180, 90);

        pizza_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        pizza_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizza_price.setText("$3.99");
        pizza_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(pizza_price);
        pizza_price.setBounds(730, 90, 90, 15);

        pizza_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pizza_title.setForeground(new java.awt.Color(255, 105, 105));
        pizza_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizza_title.setText("Pizza Slice");
        pizza_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(pizza_title);
        pizza_title.setBounds(740, 70, 70, 16);

        pizza_button.setBackground(new java.awt.Color(255, 245, 224));
        pizza_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/mixed pizza-.png"))); // NOI18N
        pizza_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pizza_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pizza_button.setIconTextGap(10);
        Body_Panel.add(pizza_button);
        pizza_button.setBounds(640, 40, 180, 90);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 105, 105));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NZ Fries");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel8);
        jLabel8.setBounds(350, 210, 80, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("$2.99");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel9);
        jLabel9.setBounds(340, 230, 100, 15);

        jButton5.setBackground(new java.awt.Color(255, 245, 224));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Fries-.jpg"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setIconTextGap(10);
        Body_Panel.add(jButton5);
        jButton5.setBounds(260, 180, 180, 90);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 105, 105));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Hash Bites");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel25);
        jLabel25.setBounds(550, 210, 70, 16);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("$2.99");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel26);
        jLabel26.setBounds(530, 230, 100, 15);

        jButton6.setBackground(new java.awt.Color(255, 245, 224));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Hash bites-.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setIconTextGap(10);
        Body_Panel.add(jButton6);
        jButton6.setBounds(450, 180, 180, 90);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 105, 105));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("<HTML><CENTER>Fried<BR />BO-rings</CENTER></HTML>");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel27);
        jLabel27.setBounds(730, 200, 80, 32);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("$2.99");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel28);
        jLabel28.setBounds(720, 235, 100, 20);

        jButton7.setBackground(new java.awt.Color(255, 245, 224));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Fried Onion-.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setIconTextGap(10);
        Body_Panel.add(jButton7);
        jButton7.setBounds(640, 180, 180, 90);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 105, 105));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<HTML><CENTER>Unlimited<BR />Soda</CENTER></HTML>");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel11);
        jLabel11.setBounds(350, 340, 80, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("$1.99");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel12);
        jLabel12.setBounds(350, 375, 80, 20);

        jButton8.setBackground(new java.awt.Color(255, 245, 224));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/soda-.jpg"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setIconTextGap(10);
        Body_Panel.add(jButton8);
        jButton8.setBounds(260, 320, 180, 90);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 105, 105));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("<HTML><CENTER>Bottled<BR /> Water</CENTER></HTML> ");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel30);
        jLabel30.setBounds(540, 340, 80, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("$1.59");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel31);
        jLabel31.setBounds(540, 375, 80, 20);

        jButton9.setBackground(new java.awt.Color(255, 245, 224));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Bottled water-.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.setIconTextGap(10);
        Body_Panel.add(jButton9);
        jButton9.setBounds(450, 320, 180, 90);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 105, 105));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Fruit Juices");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(jLabel32);
        jLabel32.setBounds(740, 350, 70, 16);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("$2.50");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(jLabel33);
        jLabel33.setBounds(730, 370, 80, 15);

        jButton10.setBackground(new java.awt.Color(255, 245, 224));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/fruit juices-.png"))); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setIconTextGap(10);
        jButton10.setName(""); // NOI18N
        Body_Panel.add(jButton10);
        jButton10.setBounds(640, 320, 180, 90);

        cancelOrder_button.setBackground(new java.awt.Color(199, 0, 57));
        cancelOrder_button.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cancelOrder_button.setForeground(new java.awt.Color(255, 245, 224));
        cancelOrder_button.setText("CANCEL");
        cancelOrder_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrder_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(cancelOrder_button);
        cancelOrder_button.setBounds(130, 320, 110, 40);

        voidItem_button.setBackground(new java.awt.Color(199, 0, 57));
        voidItem_button.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        voidItem_button.setForeground(new java.awt.Color(255, 245, 224));
        voidItem_button.setText("VOID ITEM");
        voidItem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidItem_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(voidItem_button);
        voidItem_button.setBounds(10, 320, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addComponent(Body_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Body_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void print_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print_invoiceActionPerformed

    private void nachos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachos_buttonActionPerformed
    
    quantity++;
    //String currentText = cartPanel.getText();
    String nacho_details = "\nLoaded Nachos \t $" + food_tax + "\t x";
    cartPanel.setText(nacho_details + quantity);
    }//GEN-LAST:event_nachos_buttonActionPerformed

    private void cancelOrder_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrder_buttonActionPerformed
    clear();

    }//GEN-LAST:event_cancelOrder_buttonActionPerformed

    private void voidItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidItem_buttonActionPerformed
    
    }//GEN-LAST:event_voidItem_buttonActionPerformed

    private void burger_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_buttonActionPerformed
    quantity++;
    String currentText = cartPanel.getText();
    cartPanel.setText("\nBeast Burger $" + food_tax + "\tx" + quantity);        // TODO add your handling code here:
    }//GEN-LAST:event_burger_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_and_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_and_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_and_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_and_Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_and_Cart().setVisible(true);
                new Menu_and_Cart().setBackground(Color.red);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body_Panel;
    private javax.swing.JLabel Category_drinks;
    private javax.swing.JLabel Category_foods;
    private javax.swing.JLabel Category_sides;
    private javax.swing.JPanel Header_Panel;
    private javax.swing.JButton burger_button;
    private javax.swing.JLabel burger_price;
    private javax.swing.JLabel burger_title;
    private javax.swing.JButton cancelOrder_button;
    private javax.swing.JScrollPane cartPane;
    private javax.swing.JLabel cartPanel;
    private javax.swing.JLabel inc_READY_ble;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nachos_button;
    private javax.swing.JLabel nachos_price;
    private javax.swing.JLabel nachos_title;
    private javax.swing.JButton pizza_button;
    private javax.swing.JLabel pizza_price;
    private javax.swing.JLabel pizza_title;
    private javax.swing.JButton print_invoice;
    private javax.swing.JLabel total;
    private javax.swing.JButton voidItem_button;
    // End of variables declaration//GEN-END:variables
}
