package project2_GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    private double totalamount = 0.0d;
    private int sumOfArray = 0;
    
    //declaring map for menu and price
    private Map<String, Double> orders = new HashMap<>();
    
    //This is to store map data into this array for total calculation later.
    private ArrayList<String> addedItems = new ArrayList<>(); //use this code!
    
    
    //================ RECEIPT FORMATTING ================//
    public String receiptFormat()
    {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDT = DateTimeFormatter.ofPattern("dd-MM-yyyy          HH:mm:ss");
        String fixedformatDT = dateTime.format(formatDT);
        for (int i = 0; i < quantity.length; i++)
        {
            sumOfArray = sumOfArray + quantity[i];
        }
        return "                           inc-READY-ble!\n"
             + "                 = = = = inc-READY-ble AUT = = = =\n"
             + "          <<< Software Made By: Camille Joyce Carreon >>>\n"
             + "                   KIA ORA, OUR DEAREST CUSTOMER \t\n"
             + "        WE OFFER YOU THE BEST QUALITY AND PRICE FOR YOUR MEALS\n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
             + "                           " + fixedformatDT + "                           \n"
             + "                                 SELF-ORDER KIOSK                                 \n"
             + " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"  
             + "   ITEM      PRICE      QUANTITY      \n"
             + cartPanel.getText()
             + "\n\n\n\tTOTAL ITEMS:\t\t" + sumOfArray + "\n"
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
    
    public Menu_and_Cart(Map<String, Double> orders, int [] quantity)
    {
        this.food_tax = 0.13d;
        this.totalamount = totalamount;
    }
    
    public Menu_and_Cart() 
    {
        initComponents();
        
        //declaring values with Map<>
        orders.put("Loaded Nachos", 3.49d);
        orders.put("Beast Burger", 7.99d);
        orders.put("Pizza Slice", 3.99d);
        orders.put("NZ Fries", 2.99d);
        orders.put("Hash Bites", 2.99d);
        orders.put("Fried BO-rings", 2.99d);
        orders.put("Unlimited Soda", 1.99d);
        orders.put("Bottled Water", 1.59d);
        orders.put("Fruit Juices", 2.50d);
        
        New_Button.setEnabled(false);
        void_Panel.setVisible(true);
        disableSelections();
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
            FileWriter receipt = new FileWriter("InvoiceID_" + randomString + ".txt");
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_Panel = new javax.swing.JPanel();
        Logout_Button = new javax.swing.JButton();
        New_Button = new javax.swing.JButton();
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
        voidItem_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        receiptPane = new javax.swing.JScrollPane();
        Invoice = new javax.swing.JTextArea();
        void_Panel = new javax.swing.JPanel();
        nachos_void = new javax.swing.JButton();
        fries_void = new javax.swing.JButton();
        soda_void = new javax.swing.JButton();
        burger_void = new javax.swing.JButton();
        hashbites_void = new javax.swing.JButton();
        water_void = new javax.swing.JButton();
        pizza_void = new javax.swing.JButton();
        onionrings_void = new javax.swing.JButton();
        juice_void = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System - inc-READY-ble!");
        setBackground(new java.awt.Color(255, 245, 224));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        Header_Panel.setBackground(new java.awt.Color(199, 0, 57));
        Header_Panel.setLayout(null);

        Logout_Button.setBackground(new java.awt.Color(255, 245, 224));
        Logout_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logout_Button.setForeground(new java.awt.Color(255, 105, 105));
        Logout_Button.setText("L O G O U T");
        Logout_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 30, 70)));
        Logout_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });
        Header_Panel.add(Logout_Button);
        Logout_Button.setBounds(20, 20, 130, 27);

        New_Button.setBackground(new java.awt.Color(255, 245, 224));
        New_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        New_Button.setForeground(new java.awt.Color(255, 105, 105));
        New_Button.setText("N E W");
        New_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 30, 70)));
        New_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ButtonActionPerformed(evt);
            }
        });
        Header_Panel.add(New_Button);
        New_Button.setBounds(670, 20, 130, 27);

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
        print_invoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        nachos_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(nachos_title);
        nachos_title.setBounds(350, 60, 80, 30);

        nachos_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        nachos_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nachos_price.setLabelFor(nachos_button);
        nachos_price.setText("$3.49");
        nachos_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nachos_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        burger_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(burger_title);
        burger_title.setBounds(540, 60, 80, 30);

        burger_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        burger_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burger_price.setText("$7.99");
        burger_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        pizza_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(pizza_title);
        pizza_title.setBounds(740, 70, 70, 16);

        pizza_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        pizza_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizza_price.setText("$3.99");
        pizza_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pizza_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        fries_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(fries_title);
        fries_title.setBounds(350, 210, 80, 16);

        fries_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        fries_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fries_price.setText("$2.99");
        fries_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fries_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        hashbites_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(hashbites_title);
        hashbites_title.setBounds(550, 210, 70, 16);

        hashbites_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        hashbites_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hashbites_price.setText("$2.99");
        hashbites_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hashbites_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        onionrings_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(onionrings_title);
        onionrings_title.setBounds(730, 200, 80, 32);

        onionrings_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        onionrings_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onionrings_price.setText("$2.99");
        onionrings_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        onionrings_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        soda_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(soda_title);
        soda_title.setBounds(350, 340, 80, 30);

        soda_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        soda_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soda_price.setText("$1.99");
        soda_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        soda_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        water_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(water_title);
        water_title.setBounds(540, 340, 80, 30);

        water_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        water_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        water_price.setText("$1.59");
        water_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        water_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        juice_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body_Panel.add(juice_title);
        juice_title.setBounds(740, 350, 70, 16);

        juice_price.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        juice_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juice_price.setText("$2.50");
        juice_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        juice_price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        voidItem_button.setBackground(new java.awt.Color(199, 0, 57));
        voidItem_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        voidItem_button.setForeground(new java.awt.Color(255, 245, 224));
        voidItem_button.setText("VOID ITEM");
        voidItem_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voidItem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidItem_buttonActionPerformed(evt);
            }
        });
        Body_Panel.add(voidItem_button);
        voidItem_button.setBounds(10, 320, 230, 40);

        jPanel3.setBackground(new java.awt.Color(20, 30, 70));

        receiptPane.setHorizontalScrollBar(null);

        Invoice.setEditable(false);
        Invoice.setColumns(20);
        Invoice.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        Invoice.setRows(8);
        receiptPane.setViewportView(Invoice);

        void_Panel.setBackground(new java.awt.Color(199, 0, 57));
        void_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(20, 30, 70), 3, true));

        nachos_void.setBackground(new java.awt.Color(255, 245, 224));
        nachos_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nachos_void.setText("<html> <center> Loaded Nachos </center> </html>");
        nachos_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nachos_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachos_voidActionPerformed(evt);
            }
        });

        fries_void.setBackground(new java.awt.Color(255, 245, 224));
        fries_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fries_void.setText("NZ Fries");
        fries_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fries_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fries_voidActionPerformed(evt);
            }
        });

        soda_void.setBackground(new java.awt.Color(255, 245, 224));
        soda_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        soda_void.setText("Unlimited Soda");
        soda_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soda_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soda_voidActionPerformed(evt);
            }
        });

        burger_void.setBackground(new java.awt.Color(255, 245, 224));
        burger_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        burger_void.setText("<html> <center> Beast Burger </center> </html>");
        burger_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        burger_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_voidActionPerformed(evt);
            }
        });

        hashbites_void.setBackground(new java.awt.Color(255, 245, 224));
        hashbites_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hashbites_void.setText("Hash Bites");
        hashbites_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hashbites_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashbites_voidActionPerformed(evt);
            }
        });

        water_void.setBackground(new java.awt.Color(255, 245, 224));
        water_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        water_void.setText("Bottled Water");
        water_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        water_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_voidActionPerformed(evt);
            }
        });

        pizza_void.setBackground(new java.awt.Color(255, 245, 224));
        pizza_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pizza_void.setText("Pizza Slice");
        pizza_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pizza_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_voidActionPerformed(evt);
            }
        });

        onionrings_void.setBackground(new java.awt.Color(255, 245, 224));
        onionrings_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        onionrings_void.setText("Fried BO-rings");
        onionrings_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onionrings_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionrings_voidActionPerformed(evt);
            }
        });

        juice_void.setBackground(new java.awt.Color(255, 245, 224));
        juice_void.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juice_void.setText("Fruit Juices");
        juice_void.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        juice_void.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juice_voidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout void_PanelLayout = new javax.swing.GroupLayout(void_Panel);
        void_Panel.setLayout(void_PanelLayout);
        void_PanelLayout.setHorizontalGroup(
            void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(void_PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fries_void, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nachos_void)
                    .addComponent(soda_void, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hashbites_void, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(burger_void)
                    .addComponent(water_void, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onionrings_void, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pizza_void, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(juice_void, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        void_PanelLayout.setVerticalGroup(
            void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(void_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(void_PanelLayout.createSequentialGroup()
                        .addComponent(pizza_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(onionrings_void, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(void_PanelLayout.createSequentialGroup()
                        .addComponent(burger_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(hashbites_void, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(void_PanelLayout.createSequentialGroup()
                        .addComponent(nachos_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(fries_void, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(void_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soda_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(water_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(juice_void, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(void_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptPane)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(void_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Body_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void TotalOrder()
    {
        for(String items : addedItems)
        {
            String[] splitToGetValue0 = items.split("\\$");
            if(splitToGetValue0.length >= 2)
            {
                String price =  splitToGetValue0[1];
                String [] splitToGetValue1 = price.split("\\s+x\\s+");
                if(splitToGetValue1.length >= 2)
                {
                    String value1 = splitToGetValue1[0].trim(); 
                    String value2 = splitToGetValue1[1].trim();
                    
                    double finalPRICE = Double.parseDouble(value1);
                    int finalQUANTITY = Integer.parseInt(value2);
                    
                    totalamount += finalPRICE * finalQUANTITY;
                    double gst = totalamount * food_tax;
                    gst_calculation.setText("GST included: \t" + gst);
                    total_calculation.setText("Total Amount:\t" + totalamount);
                }
            }
        }
    }
    
    private void print_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_invoiceActionPerformed
    if(cartPanel.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Invalid print reason:          No orders added.");
    }
    else
    {
        writeInvoice();
        JOptionPane.showMessageDialog(this, "Printing Invoice...");
        Invoice.setText(receiptFormat());
        cartPanel.setText(null);
        New_Button.setEnabled(true);
        void_Panel.setVisible(false);
    }
    }//GEN-LAST:event_print_invoiceActionPerformed
    
    /*disabling and enabling when voidItem_ActionListener is active.
    This is just so users will not be confused with the many buttons
    especially when there is no indication of what the buttons are for.*/
    private void enableButtonAfterVoiding()
    {
        nachos_button.setEnabled(true);
        burger_button.setEnabled(true);
        pizza_button.setEnabled(true);
        fries_button.setEnabled(true);
        hashbites_button.setEnabled(true);
        onionrings_button.setEnabled(true);
        soda_button.setEnabled(true);
        water_button.setEnabled(true);
        juice_button.setEnabled(true);
    }
    
    private void disableButtonsWhenVoiding()
    {
        nachos_button.setEnabled(false);
        burger_button.setEnabled(false);
        pizza_button.setEnabled(false);
        fries_button.setEnabled(false);
        hashbites_button.setEnabled(false);
        onionrings_button.setEnabled(false);
        soda_button.setEnabled(false);
        water_button.setEnabled(false);
        juice_button.setEnabled(false);
    }
    
    //Same thing in this code but if only voidButton_ActionListener is inactive.
    private void disableSelections()
    {
        nachos_void.setEnabled(false);
        burger_void.setEnabled(false);
        pizza_void.setEnabled(false);
        fries_void.setEnabled(false);
        hashbites_void.setEnabled(false);
        onionrings_void.setEnabled(false);
        soda_void.setEnabled(false);
        water_void.setEnabled(false);
        juice_void.setEnabled(false);
    }
    
    private void enableSelections()
    {
        nachos_void.setEnabled(true);
        burger_void.setEnabled(true);
        pizza_void.setEnabled(true);
        fries_void.setEnabled(true);
        hashbites_void.setEnabled(true);
        onionrings_void.setEnabled(true);
        soda_void.setEnabled(true);
        water_void.setEnabled(true);
        juice_void.setEnabled(true);
    }
    
    private void nachos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachos_buttonActionPerformed
        Set<Map.Entry<String, Double>> mapEntrySet = orders.entrySet();
            double nachosPrice = orders.get("Loaded Nachos");
            quantity[0]++;           
            if(cartPanel.getText() != null)
            {
                cartPanel.append("Loaded Nachos     $" + nachosPrice + "     x   " + quantity[0]);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "This has current text");
                String currentText = cartPanel.getText();
                cartPanel.setText(currentText + "\nLoaded Nachos     $" + nachosPrice + "     x   " + quantity[0]);
            }
    }//GEN-LAST:event_nachos_buttonActionPerformed
    
    private void voidItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidItem_buttonActionPerformed
        if(cartPanel.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(cartPanel, "Invalid void item reason:     Cart is Empty.");
        }
        else
        {
            disableButtonsWhenVoiding();
            enableSelections();
            JOptionPane.showMessageDialog(this, "Click on the name to REMOVE product.");
            Set<Map.Entry<String, Double>> mapEntrySet = orders.entrySet();
            ActionListener void_alButton = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent ae)
                {
                    Object obj = ae.getSource();
                    Object [] options = {"VOID ALL", "VOID AN ITEM", "VOID QUANTITY", "CANCEL"}; //JOPTIONPANE selections to replace YES OR NO
                    int voidOptions = JOptionPane.showOptionDialog(void_Panel, "SELECT ACTION:", "VOID Settings", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                    switch (voidOptions)
                    {
                         //VOID ALL option : where it deletes all quantity values given in the array[]. 
                        //Also removing items from the ArrayList<> as being not picked.
                        case 0:
                            for(int i = 0; i < quantity.length; i++)
                            {
                                //Basically resets all quantities back to 0, applies to all products
                                quantity[i] = 0;
                                cartPanel.setText(null);
                                addedItems.clear();
                                Invoice.setText(null);
                                Invoice.append(addedItems + "\n");
                            }
                            break;
                        case 1: //VOID AN ITEM option : where only 1 item is removed in the invoice and indicating 0 quantity
                            if(obj == nachos_void)
                            {
                                if(quantity[0] > 0)
                                {
                                    double nachosPrice = orders.get("Loaded Nachos");
                                    String container = cartPanel.getText();
                                    quantity[0] = 0;
                                    addedItems.add(container);
                                    cartPanel.setText("Loaded Nachos     $" + nachosPrice + "     x     " + quantity[0]);
                                    for (String item : addedItems)
                                    {
                                        Invoice.append(item + "\n");
                                    }
                                    
                                    if(quantity[0] == 0)
                                    {
                                         cartPanel.getText().replace("Loaded Nachos", null);
                                    }
                                }
                                
                               

                            }
                            break;
                        case 2: //VOID QUANTITY option : just subtracting quantity value
                            JOptionPane.showMessageDialog(void_Panel, "VOID QUANTITY?");
                            break;
                        case 3: //CANCEL option : Continues to the order without voiding any products.
                            JOptionPane.showMessageDialog(void_Panel, "Continuing order...");
                            break;
                    }
                    
                    
                    if(obj == nachos_void)
                    {
                        int voidOptions2 = JOptionPane.showOptionDialog(cartPanel, "VOID PURCHASE?", "WARNING", JOptionPane.INFORMATION_MESSAGE, 0, null, options, null);
                        switch (voidOptions2) {
                            case JOptionPane.CANCEL_OPTION: // Object [] options = "CANCEL"
                                JOptionPane.showMessageDialog(cartPanel, "Continuing order...");
                                break;
                            case JOptionPane.YES_OPTION: // Object [] options = "ALL"
                                quantity[0] = 0;
                                cartPanel.setText("");
                                break;
                            case JOptionPane.NO_OPTION: // Object [] options = "ONLY ONE"
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
                    if(obj == burger_void)
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
                    if(obj == pizza_void)
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
                    if(obj == fries_void)
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
                    if(obj == hashbites_void)
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
                    if(obj == onionrings_void)
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
                    if(obj == soda_void)
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
                    if(obj == water_void)
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
                    if(obj == juice_void)
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
            enableButtonAfterVoiding();
            disableSelections();
            }
        };
        nachos_void.addActionListener(void_alButton);
        burger_void.addActionListener(void_alButton);
        pizza_void.addActionListener(void_alButton);
        fries_void.addActionListener(void_alButton);
        hashbites_void.addActionListener(void_alButton);
        onionrings_void.addActionListener(void_alButton);
        soda_void.addActionListener(void_alButton);
        water_void.addActionListener(void_alButton);
        juice_void.addActionListener(void_alButton);
        }
    }//GEN-LAST:event_voidItem_buttonActionPerformed

    private void burger_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_buttonActionPerformed
        Set<Map.Entry<String, Double>> mapEntrySet = orders.entrySet();
            double burgerPrice = orders.get("Beast Burger");
            quantity[1]++;           
            cartPanel.append("Beast Burger     $" + burgerPrice + "     x     " + quantity[1]);
            
    }//GEN-LAST:event_burger_buttonActionPerformed

    private void pizza_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_buttonActionPerformed
    quantity[2]++;
    String currentText = cartPanel.getText() + "\n";
    String pizza_string = "Pizza Slice\t$" + food_tax + " x ";
    cartPanel.getText();
    cartPanel.setText(currentText + pizza_string + quantity[2]);

    }//GEN-LAST:event_pizza_buttonActionPerformed

    private void New_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ButtonActionPerformed
        Invoice.setText(null);
        void_Panel.setVisible(true);
    }//GEN-LAST:event_New_ButtonActionPerformed

    private void nachos_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachos_voidActionPerformed

    }//GEN-LAST:event_nachos_voidActionPerformed

    private void fries_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fries_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fries_voidActionPerformed

    private void soda_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soda_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soda_voidActionPerformed

    private void burger_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burger_voidActionPerformed

    private void hashbites_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashbites_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hashbites_voidActionPerformed

    private void water_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_water_voidActionPerformed

    private void pizza_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pizza_voidActionPerformed

    private void onionrings_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionrings_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onionrings_voidActionPerformed

    private void juice_voidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juice_voidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juice_voidActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
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
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    
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
    private javax.swing.JButton Logout_Button;
    private javax.swing.JButton New_Button;
    private javax.swing.JButton burger_button;
    private javax.swing.JLabel burger_price;
    private javax.swing.JLabel burger_title;
    private javax.swing.JButton burger_void;
    private javax.swing.JTextArea cartPanel;
    private javax.swing.JLabel cart_label;
    private javax.swing.JLabel cart_title;
    private javax.swing.JButton fries_button;
    private javax.swing.JLabel fries_price;
    private javax.swing.JLabel fries_title;
    private javax.swing.JButton fries_void;
    private javax.swing.JLabel gst_calculation;
    private javax.swing.JButton hashbites_button;
    private javax.swing.JLabel hashbites_price;
    private javax.swing.JLabel hashbites_title;
    private javax.swing.JButton hashbites_void;
    private javax.swing.JLabel inc_READY_ble;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton juice_button;
    private javax.swing.JLabel juice_price;
    private javax.swing.JLabel juice_title;
    private javax.swing.JButton juice_void;
    private javax.swing.JButton nachos_button;
    private javax.swing.JLabel nachos_price;
    private javax.swing.JLabel nachos_title;
    private javax.swing.JButton nachos_void;
    private javax.swing.JButton onionrings_button;
    private javax.swing.JLabel onionrings_price;
    private javax.swing.JLabel onionrings_title;
    private javax.swing.JButton onionrings_void;
    private javax.swing.JButton pizza_button;
    private javax.swing.JLabel pizza_price;
    private javax.swing.JLabel pizza_title;
    private javax.swing.JButton pizza_void;
    private javax.swing.JButton print_invoice;
    private javax.swing.JScrollPane receiptPane;
    private javax.swing.JButton soda_button;
    private javax.swing.JLabel soda_price;
    private javax.swing.JLabel soda_title;
    private javax.swing.JButton soda_void;
    private javax.swing.JLabel total_calculation;
    private javax.swing.JButton voidItem_button;
    private javax.swing.JPanel void_Panel;
    private javax.swing.JButton water_button;
    private javax.swing.JLabel water_price;
    private javax.swing.JLabel water_title;
    private javax.swing.JButton water_void;
    // End of variables declaration//GEN-END:variables
}
