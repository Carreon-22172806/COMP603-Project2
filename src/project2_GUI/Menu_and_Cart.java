/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2_GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
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
public class Menu_and_Cart extends javax.swing.JFrame {
    
    //for calculations
    private int [] quantity = new int [] {0,0,0,0,0,0,0,0,0};   //invoice value when button clicked.
    private double food_tax = .13d;
    
    //declaring map for menu and price
    private Map<String, Double> orders = new HashMap<>();
    
    //This is to store map data into this array for total calculation later.
    private ArrayList<String> addedItems = new ArrayList<>(); //use this code!
    
    
    //================ RECEIPT FORMATTING ================//
    public String receiptFormat()
    {

        return "                           inc-READY-ble!\n"
             + "                 = = = = inc-READY-ble AUT = = = =\n"
             + "          <<< Software Made By: Camille Joyce Carreon >>>\n"
             + "                   KIA ORA, OUR DEAREST CUSTOMER \t\n"
             + "        WE OFFER YOU THE BEST QUALITY AND PRICE FOR YOUR MEALS\n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "      ITEM\tPRICE\tQUANTITY\n"
           // + addedItems.get()
             + "\n\n\n\tTOTAL ITEMS:\t\t" + addedItems.size() + "\n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "\n               * * * * *  CUSTOMER COPY  * * * * *                 \n\n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "   WE ARE CURRENTLY WORKING ON WITH OUR COMPANY WEBSITE TO PROVIDE \n"
             + "    YOU ONLINE PICKUPS TO OUR FOOD SERVICES SO PLEASE STAY TUNED. \n"
             + "                THANK YOU FOR CHOOSING INC-READY-BLE!            \n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "     WE APPRECIATE YOUR FEEDBACK TO HELP US IMPROVE OUR SERVICES \n"
             + "         FILL IN OUR SURVEY TO BE INCLUDED IN OUR PROMOTION: \n"
             + "                      WIN 1 OF 5 BRAND NEW CAR!             \n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "        <<< PLEASE KEEP THIS INVOICE AS PROOF OF PURCHASE >>>            \n";
    }
    //================ RECEIPT FORMATTING ================//
    
    
    public Menu_and_Cart() 
    {
        initComponents();
        
        //declaring values with HashMap
        orders.put("Loaded Nachos", 3.49d);
        orders.put("Beast Burger", 7.99d);
        orders.put("Pizza Slice", 3.99d);
        orders.put("NZ Fries", 2.99d);
        orders.put("Hash Bites", 2.99d);
        orders.put("Fried BO-rings", 2.99d);
        orders.put("Unlimited Soda", 1.99d);
        orders.put("Bottled Water", 1.59d);
        orders.put("Fruit Juices", 2.50d);
        
        
    }
    
    private String writeInvoice()
    {
        //mixture of lowercase and uppercase alphabet + numeric
        String alphaNumeric = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567809";
        StringBuilder sb = new StringBuilder();

        //creating RANDOM STRING AND INT TO GENERATE UNIQUE FILEWRITER TEXT NAME
        Random randTYPE = new Random();
        
        int indexLength = 10;
        
        for(int i = 0; i < indexLength; i++)
        {
            //generating random index from the alphanumeric content
            int index = randTYPE.nextInt(alphaNumeric.length());
            char randomChar = alphaNumeric.charAt(index);
            
            //adding value to the stringbuilder
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        try 
        {
            FileWriter receipt = new FileWriter(randomString + ".txt");
            BufferedWriter buffReceipt = new BufferedWriter(receipt);
            String header = receiptFormat();
            buffReceipt.write(header);
            buffReceipt.close();
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_and_Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return String.valueOf(randomString);
    }
    
    private void readfile()
    {
        try
        {
            FileReader fr = new FileReader("currentCart.txt");
            BufferedReader buffRead = new BufferedReader(fr);
            StringBuilder invoiceContent = new StringBuilder();
            String invoiceOrder;
            buffRead.read();
            while ((invoiceOrder = buffRead.readLine()) != null)
            {
                //To append each line
                invoiceContent.append(invoiceOrder).append("\n");
            }
            buffRead.close();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(Menu_and_Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_Panel = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        inc_READY_ble = new javax.swing.JLabel();
        Body_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartPanel = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cart_title = new javax.swing.JLabel();
        cart_label = new javax.swing.JLabel();
        gst_calculation = new javax.swing.JLabel();
        total_calculation = new javax.swing.JLabel();
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
        pizza_title = new javax.swing.JLabel();
        pizza_price = new javax.swing.JLabel();
        pizza_button = new javax.swing.JButton();
        fries_title = new javax.swing.JLabel();
        fries_price = new javax.swing.JLabel();
        fries_button = new javax.swing.JButton();
        hashbites_title = new javax.swing.JLabel();
        hashbites_price = new javax.swing.JLabel();
        hashbites_button = new javax.swing.JButton();
        onionrings_title = new javax.swing.JLabel();
        onionrings_price = new javax.swing.JLabel();
        onionrings_button = new javax.swing.JButton();
        soda_title = new javax.swing.JLabel();
        soda_price = new javax.swing.JLabel();
        soda_button = new javax.swing.JButton();
        water_title = new javax.swing.JLabel();
        water_price = new javax.swing.JLabel();
        water_button = new javax.swing.JButton();
        juice_title = new javax.swing.JLabel();
        juice_price = new javax.swing.JLabel();
        juice_button = new javax.swing.JButton();
        addItem_button = new javax.swing.JButton();
        voidItem_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        receiptPane = new javax.swing.JScrollPane();
        Invoice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        Header_Panel.setBackground(new java.awt.Color(199, 0, 57));
        Header_Panel.setLayout(null);

        LogoutButton.setBackground(new java.awt.Color(255, 245, 224));
        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 105, 105));
        LogoutButton.setText("L O G O U T");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        Header_Panel.add(LogoutButton);
        LogoutButton.setBounds(680, 20, 130, 31);

        inc_READY_ble.setFont(new java.awt.Font("Agency FB", 1, 55)); // NOI18N
        inc_READY_ble.setForeground(new java.awt.Color(242, 242, 242));
        inc_READY_ble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inc_READY_ble.setText("inc-READY-ble!");
        Header_Panel.add(inc_READY_ble);
        inc_READY_ble.setBounds(0, 2, 830, 70);

        Body_Panel.setBackground(new java.awt.Color(20, 30, 70));
        Body_Panel.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 245, 224));

        cartPanel.setEditable(false);
        cartPanel.setBackground(new java.awt.Color(255, 245, 224));
        cartPanel.setColumns(20);
        cartPanel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cartPanel.setRows(5);
        jScrollPane1.setViewportView(cartPanel);

        Body_Panel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 220, 170);

        jPanel2.setBackground(new java.awt.Color(255, 245, 224));

        cart_title.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cart_title.setForeground(new java.awt.Color(255, 105, 105));
        cart_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart_title.setText("Welcome to inc-READY-ble!");

        cart_label.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cart_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart_label.setText("- - - Your virtual food cart - - -");

        gst_calculation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gst_calculation.setText("GST included:");

        total_calculation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        total_calculation.setText("Total Amount:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart_title, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(cart_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_calculation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gst_calculation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cart_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cart_label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(gst_calculation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_calculation)
                .addGap(8, 8, 8))
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

        pizza_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pizza_title.setForeground(new java.awt.Color(255, 105, 105));
        pizza_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizza_title.setText("Pizza Slice");
        pizza_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(pizza_title);
        pizza_title.setBounds(740, 70, 70, 16);

        pizza_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        pizza_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizza_price.setText("$3.99");
        pizza_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(pizza_price);
        pizza_price.setBounds(730, 90, 90, 15);

        pizza_button.setBackground(new java.awt.Color(255, 245, 224));
        pizza_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/mixed pizza-.png"))); // NOI18N
        pizza_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pizza_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pizza_button.setIconTextGap(10);
        pizza_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(pizza_button);
        pizza_button.setBounds(640, 40, 180, 90);

        fries_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fries_title.setForeground(new java.awt.Color(255, 105, 105));
        fries_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fries_title.setText("NZ Fries");
        fries_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(fries_title);
        fries_title.setBounds(350, 210, 80, 16);

        fries_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        fries_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fries_price.setText("$2.99");
        fries_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(fries_price);
        fries_price.setBounds(340, 230, 100, 15);

        fries_button.setBackground(new java.awt.Color(255, 245, 224));
        fries_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Fries-.jpg"))); // NOI18N
        fries_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fries_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fries_button.setIconTextGap(10);
        Body_Panel.add(fries_button);
        fries_button.setBounds(260, 180, 180, 90);

        hashbites_title.setBackground(new java.awt.Color(255, 255, 255));
        hashbites_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hashbites_title.setForeground(new java.awt.Color(255, 105, 105));
        hashbites_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hashbites_title.setText("Hash Bites");
        hashbites_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(hashbites_title);
        hashbites_title.setBounds(550, 210, 70, 16);

        hashbites_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        hashbites_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hashbites_price.setText("$2.99");
        hashbites_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(hashbites_price);
        hashbites_price.setBounds(530, 230, 100, 15);

        hashbites_button.setBackground(new java.awt.Color(255, 245, 224));
        hashbites_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Hash bites-.png"))); // NOI18N
        hashbites_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hashbites_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hashbites_button.setIconTextGap(10);
        Body_Panel.add(hashbites_button);
        hashbites_button.setBounds(450, 180, 180, 90);

        onionrings_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        onionrings_title.setForeground(new java.awt.Color(255, 105, 105));
        onionrings_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onionrings_title.setText("<HTML><CENTER>Fried<BR />BO-rings</CENTER></HTML>");
        onionrings_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(onionrings_title);
        onionrings_title.setBounds(730, 200, 80, 32);

        onionrings_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        onionrings_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onionrings_price.setText("$2.99");
        onionrings_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(onionrings_price);
        onionrings_price.setBounds(720, 235, 100, 20);

        onionrings_button.setBackground(new java.awt.Color(255, 245, 224));
        onionrings_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Fried Onion-.png"))); // NOI18N
        onionrings_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onionrings_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        onionrings_button.setIconTextGap(10);
        Body_Panel.add(onionrings_button);
        onionrings_button.setBounds(640, 180, 180, 90);

        soda_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        soda_title.setForeground(new java.awt.Color(255, 105, 105));
        soda_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soda_title.setText("<HTML><CENTER>Unlimited<BR />Soda</CENTER></HTML>");
        soda_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(soda_title);
        soda_title.setBounds(350, 340, 80, 30);

        soda_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        soda_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soda_price.setText("$1.99");
        soda_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(soda_price);
        soda_price.setBounds(350, 375, 80, 20);

        soda_button.setBackground(new java.awt.Color(255, 245, 224));
        soda_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/soda-.jpg"))); // NOI18N
        soda_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soda_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        soda_button.setIconTextGap(10);
        Body_Panel.add(soda_button);
        soda_button.setBounds(260, 320, 180, 90);

        water_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        water_title.setForeground(new java.awt.Color(255, 105, 105));
        water_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        water_title.setText("<HTML><CENTER>Bottled<BR /> Water</CENTER></HTML> ");
        water_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(water_title);
        water_title.setBounds(540, 340, 80, 30);

        water_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        water_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        water_price.setText("$1.59");
        water_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(water_price);
        water_price.setBounds(540, 375, 80, 20);

        water_button.setBackground(new java.awt.Color(255, 245, 224));
        water_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/Bottled water-.png"))); // NOI18N
        water_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        water_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        water_button.setIconTextGap(10);
        Body_Panel.add(water_button);
        water_button.setBounds(450, 320, 180, 90);

        juice_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juice_title.setForeground(new java.awt.Color(255, 105, 105));
        juice_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juice_title.setText("Fruit Juices");
        juice_title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Panel.add(juice_title);
        juice_title.setBounds(740, 350, 70, 16);

        juice_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        juice_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juice_price.setText("$2.50");
        juice_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Body_Panel.add(juice_price);
        juice_price.setBounds(730, 370, 80, 15);

        juice_button.setBackground(new java.awt.Color(255, 245, 224));
        juice_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2_GUI/Images/fruit juices-.png"))); // NOI18N
        juice_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        juice_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        juice_button.setIconTextGap(10);
        juice_button.setName(""); // NOI18N
        Body_Panel.add(juice_button);
        juice_button.setBounds(640, 320, 180, 90);

        addItem_button.setBackground(new java.awt.Color(199, 0, 57));
        addItem_button.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        addItem_button.setForeground(new java.awt.Color(255, 245, 224));
        addItem_button.setText("ADD ITEM");
        addItem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItem_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(addItem_button);
        addItem_button.setBounds(130, 320, 110, 40);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        receiptPane.setHorizontalScrollBar(null);

        Invoice.setEditable(false);
        Invoice.setColumns(20);
        Invoice.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        Invoice.setRows(8);
        receiptPane.setViewportView(Invoice);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptPane, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Body_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addComponent(Header_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Body_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void TotalOrder()
    {
        /*if(addedItems == null || addedItems.isEmpty())
        {
            
        }
        else
        {
            for(String item: addedItems)
            {
                double totalamount += orders.getOrDefault(item, 0.0);
                
            }
            double gst = totalamount * food_tax;
        }
        gst_calculation.setText("GST included:" + gst);
        total_calculation.setText("Total Amount:"\t $" + totalamount);*/
    }
    
    private void print_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_invoiceActionPerformed
    if(cartPanel.getText().contains("No orders added."))
    {
        JOptionPane.showMessageDialog(this, "Invalid print reason:          No orders added.");
    }
    else
    {
        writeInvoice();
        JOptionPane.showMessageDialog(this, "Printing Invoice...");
        Invoice.setText(receiptFormat());
        cartPanel.setText("");
        //new Print_Invoice().setVisible(true);    
    }
    }//GEN-LAST:event_print_invoiceActionPerformed

    private void nachos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachos_buttonActionPerformed
    }//GEN-LAST:event_nachos_buttonActionPerformed
    
    private void settingsActionPerformed(java.awt.event.ActionEvent jaeAE)
    {
        Object obj = jaeAE.getSource();
        Object [] options = {"VOID ITEM", "RESET ORDER", "BACK"}; //JOPTIONPANE selections to replace YES OR NO
        if(obj == nachos_button)
                    {
                        int voidOptions2 = JOptionPane.showOptionDialog(cartPanel, "", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                    }         
    }
    
    private void addItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItem_buttonActionPerformed
      addItem_button();
    }//GEN-LAST:event_addItem_buttonActionPerformed

    private void addItem_button()
    {
            Set<Map.Entry<String, Double>> mapEntrySet = orders.entrySet();
            ActionListener add_alButton = new ActionListener()
            {
               @Override
               public void actionPerformed(ActionEvent actEve)
               {
                  Object obj = actEve.getSource();
                  if (obj == nachos_button)
                  {
                    if (!cartPanel.getText().equals("No orders added."))
                    {
                        cartPanel.getText();
                        quantity[0]++;
                        double nachosPrice = orders.get("Loaded Nachos");
                        cartPanel.setText("Loaded Nachos\t$" + nachosPrice + "\tx " + quantity[0]);

                    }
                    else if(cartPanel.getText().isEmpty() || cartPanel.getText().equals("No orders added."))
                    {
                        quantity[0]++;
                        cartPanel.setText("");
                        double nachosPrice = orders.get("Loaded Nachos");
                        cartPanel.setText("Loaded Nachos\t$" + nachosPrice + "\tx " + quantity[0]);
                    }
                    } 
                }
            };
            nachos_button.addActionListener(add_alButton);
    }
    
    private void voidItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidItem_buttonActionPerformed
        if(cartPanel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(cartPanel, "Invalid void item reason:     Cart is Empty.");
            cartPanel.setText("No orders added.");
        }
        else if (cartPanel.getText().equals("No orders added."))
        {
            JOptionPane.showMessageDialog(cartPanel, "Invalid void item reason:     No orders added.");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Click on the item to REMOVE product.");
            Set<Map.Entry<String, Double>> mapEntrySet = orders.entrySet();
            ActionListener void_alButton = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent ae)
                {
                    Object obj = ae.getSource();
                    Object [] options = {"ALL", "ONE ONLY", "CANCEL"}; //JOPTIONPANE selections to replace YES OR NO

                    if(obj == nachos_button)
                    {
                        int voidOptions2 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                        switch (voidOptions2) {
                            case JOptionPane.CANCEL_OPTION:
                                JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                break;
                            case JOptionPane.YES_OPTION:
                                quantity[0] = 0;
                                cartPanel.setText("");
                                break;
                            case JOptionPane.NO_OPTION:
                                if(quantity[0] > 0)
                                {
                                    quantity[0] --;
                                    double nachosPrice = orders.get("Loaded Nachos");
                                    cartPanel.setText("Loaded Nachos\t$" + nachosPrice + "\tx " + quantity[0]);
                                    if(quantity [0]==0)
                                    {
                                        cartPanel.setText("");
                                    }
                                }
                            default:
                                break;
                        }
                    if(obj == burger_button)
                    {
                        int voidOptions1 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions1) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[1] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[1] > 0)
                                    {
                                        quantity[1] --;
                                        double burgerPrice = orders.get("Beast Burger");
                                        cartPanel.setText("Beast Burger\t$" + burgerPrice + "\tx " + quantity[1]);
                                    }
                                    else
                                    {
                                        quantity[1] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == pizza_button)
                    {
                        int voidOptions3 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions3) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[2] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[2] > 0)
                                    {
                                        quantity[2] --;
                                        double pizzaPrice = orders.get("Pizza Slice");
                                        cartPanel.setText("Pizza Slice\t$" + pizzaPrice + "\tx " + quantity[2]);
                                    }
                                    else
                                    {
                                        quantity[2] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    } 
                    if(obj == fries_button)
                    {
                        int voidOptions4 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions4) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[3] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[3] > 0)
                                    {
                                        quantity[3] --;
                                        double friesPrice = orders.get("NZ Fries");
                                        cartPanel.setText("NZ Fries\t$" + friesPrice + "\tx " + quantity[3]);
                                    }
                                    else
                                    {
                                        quantity[3] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == hashbites_button)
                    {
                        int voidOptions5 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions5) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[4] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[4] > 0)
                                    {
                                        quantity[4] --;
                                        double hashbitesPrice = orders.get("Hash Bites");
                                        cartPanel.setText("Hash Bites\t$" + hashbitesPrice + "\tx " + quantity[4]);
                                    }
                                    else
                                    {
                                        quantity[4] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == onionrings_button)
                    {
                        int voidOptions6 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions6) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[5] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[5] > 0)
                                    {
                                        quantity[5] --;
                                        double onionringsPrice = orders.get("Fried BO-rings");
                                        cartPanel.setText("Fried BO-rings\t$" + onionringsPrice + "\tx " + quantity[5]);
                                    }
                                    else
                                    {
                                        quantity[5] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == soda_button)
                    {
                        int voidOptions7 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions7) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[6] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[6] > 0)
                                    {
                                        quantity[6] --;
                                        double sodaPrice = orders.get("Unlimited Soda");
                                        cartPanel.setText("Unlimited Soda\t$" + sodaPrice + "\tx " + quantity[6]);
                                    }
                                    else
                                    {
                                        quantity[6] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == water_button)
                    {
                        int voidOptions8 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                            switch (voidOptions8) {
                                case JOptionPane.CANCEL_OPTION:
                                    JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                    break;
                                case JOptionPane.YES_OPTION:
                                    quantity[7] = 0;
                                    cartPanel.setText("");
                                    break;
                                case JOptionPane.NO_OPTION:
                                    if(quantity[7] > 0)
                                    {
                                        quantity[7] --;
                                        double waterPrice = orders.get("Bottled Water");
                                        cartPanel.setText("Bottled Water\t$" + waterPrice + "\tx " + quantity[7]);
                                    }
                                    else
                                    {
                                        quantity[7] = 0;
                                        cartPanel.setText("");
                                    }       break;
                                default:
                                    break;
                            }
                    }
                    if(obj == juice_button)
                    {
                        int voidOptions9 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                        if(voidOptions9 == JOptionPane.CANCEL_OPTION)
                        {
                            JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                        }
                        else if(voidOptions2 == JOptionPane.YES_OPTION)
                        {
                            quantity[8] = 0;
                            cartPanel.setText("");
                        }
                        else if (voidOptions2 == JOptionPane.NO_OPTION)
                        {
                            if(quantity[8] > 0)
                            {
                                quantity[8] --;
                                double friesPrice = orders.get("Fruit Juice");
                                cartPanel.setText("Fruit Juice\t$" + friesPrice + "\tx " + quantity[8]);
                            }
                            else
                            {
                                quantity[8] = 0;
                                cartPanel.setText("");
                            }
                        }
                    }
                }
            }
        };
        nachos_button.addActionListener(void_alButton);
        burger_button.addActionListener(void_alButton);
        pizza_button.addActionListener(void_alButton);
        fries_button.addActionListener(void_alButton);
        hashbites_button.addActionListener(void_alButton);
        onionrings_button.addActionListener(void_alButton);
        soda_button.addActionListener(void_alButton);
        water_button.addActionListener(void_alButton);
        juice_button.addActionListener(void_alButton);
        
        
        
        }
    }//GEN-LAST:event_voidItem_buttonActionPerformed

    private void burger_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_buttonActionPerformed
        quantity[1]++;
        String burger_details = "Beast Burger\t$" + food_tax + " x ";
        String currentText = cartPanel.getText() + "\n";
        cartPanel.getText();
        cartPanel.setText(currentText + burger_details + quantity[1]);

    }//GEN-LAST:event_burger_buttonActionPerformed

    private void pizza_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_buttonActionPerformed
    quantity[2]++;
    String currentText = cartPanel.getText() + "\n";
    String pizza_string = "Pizza Slice\t$" + food_tax + " x ";
    cartPanel.getText();
    cartPanel.setText(currentText + pizza_string + quantity[2]);

    }//GEN-LAST:event_pizza_buttonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        Object [] options = {"YES", "NO"};
        int warning = JOptionPane.showOptionDialog(this, "Are you sure to logout?", "WARNING", 0, JOptionPane.QUESTION_MESSAGE, null, options, Invoice);
        if(warning == JOptionPane.YES_OPTION)
        {
            Login backTologin = new Login();
            backTologin.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Continuing order...");
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed
    
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
    private javax.swing.JTextArea Invoice;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton addItem_button;
    private javax.swing.JButton burger_button;
    private javax.swing.JLabel burger_price;
    private javax.swing.JLabel burger_title;
    private javax.swing.JTextArea cartPanel;
    private javax.swing.JLabel cart_label;
    private javax.swing.JLabel cart_title;
    private javax.swing.JButton fries_button;
    private javax.swing.JLabel fries_price;
    private javax.swing.JLabel fries_title;
    private javax.swing.JLabel gst_calculation;
    private javax.swing.JButton hashbites_button;
    private javax.swing.JLabel hashbites_price;
    private javax.swing.JLabel hashbites_title;
    private javax.swing.JLabel inc_READY_ble;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton juice_button;
    private javax.swing.JLabel juice_price;
    private javax.swing.JLabel juice_title;
    private javax.swing.JButton nachos_button;
    private javax.swing.JLabel nachos_price;
    private javax.swing.JLabel nachos_title;
    private javax.swing.JButton onionrings_button;
    private javax.swing.JLabel onionrings_price;
    private javax.swing.JLabel onionrings_title;
    private javax.swing.JButton pizza_button;
    private javax.swing.JLabel pizza_price;
    private javax.swing.JLabel pizza_title;
    private javax.swing.JButton print_invoice;
    private javax.swing.JScrollPane receiptPane;
    private javax.swing.JButton soda_button;
    private javax.swing.JLabel soda_price;
    private javax.swing.JLabel soda_title;
    private javax.swing.JLabel total_calculation;
    private javax.swing.JButton voidItem_button;
    private javax.swing.JButton water_button;
    private javax.swing.JLabel water_price;
    private javax.swing.JLabel water_title;
    // End of variables declaration//GEN-END:variables
}
