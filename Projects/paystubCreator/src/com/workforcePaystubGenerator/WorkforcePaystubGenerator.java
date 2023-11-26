package com.workforcePaystubGenerator;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkforcePaystubGenerator extends javax.swing.JFrame {

    static String date;
    static String stub;
    static NumberFormat fmt = NumberFormat.getCurrencyInstance();
    static DecimalFormat df = new DecimalFormat("##.##");

    public WorkforcePaystubGenerator() {
        initComponents();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkforcePaystubGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WorkforcePaystubGenerator().setVisible(true);
        });
    }

    public static void file(String name, double hP, double hW, double oT, double oTp, double gP, double tD, double nP) throws IOException {
        stub = "Hours Pay: " + fmt.format(hP) + "\nHourly Worked: " + hW
                + "\nOvertime Pay: " + fmt.format(oTp) + "\nOvertime Hours: " + df.format(oT)
                + "\n\n\n\t\t\tGross Pay: " + fmt.format(gP) + "\n\t\t\tTaxes: "
                + fmt.format(tD) + "\n\t\t\tNet Pay: " + fmt.format(nP);

        File theDir = new File(System.getProperty("user.dir") + File.separator + "PayStubs");
        if (!theDir.exists()) {
            theDir.mkdir();
            try (PrintWriter writer = new PrintWriter(theDir + File.separator + name + "'s_PayStub(" + date + ").txt", "UTF-8")) {
                writer.write(stub);
            }
        } else {
            try (PrintWriter writer = new PrintWriter(theDir + File.separator + name + "'s_PayStub(" + date + ").txt", "UTF-8")) {
                writer.write(stub);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        employeeName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        employeePay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeHours = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        overtimePay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        overtimeHours = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grossPay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        taxes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        netPay = new javax.swing.JTextField();
        confirmationBox = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarFile = new javax.swing.JMenu();
        newStub = new javax.swing.JMenuItem();
        generate = new javax.swing.JMenuItem();
        saveToFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paystub Generator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(512, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(512, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 32)); // NOI18N
        formTitle.setText("Workforce Paystub Generator");
        jPanel1.add(formTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Employee Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 75, -1, 20));

        employeeName.setToolTipText("Employee Name");
        jPanel1.add(employeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 75, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pay Per Hour:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, -1, 20));

        employeePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePayActionPerformed(evt);
            }
        });
        jPanel1.add(employeePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 115, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hours Worked:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 153, -1, 20));

        employeeHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeHoursActionPerformed(evt);
            }
        });
        jPanel1.add(employeeHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 153, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Overtime Pay:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 191, -1, 20));

        overtimePay.setEditable(false);
        overtimePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimePayActionPerformed(evt);
            }
        });
        jPanel1.add(overtimePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 191, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Overtime Hours:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 229, -1, 20));

        overtimeHours.setEditable(false);
        overtimeHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimeHoursActionPerformed(evt);
            }
        });
        jPanel1.add(overtimeHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 229, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gross Pay:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 267, -1, 20));
        jLabel4.setVisible(false);

        grossPay.setEditable(false);
        grossPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossPayActionPerformed(evt);
            }
        });
        jPanel1.add(grossPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 267, 150, -1));
        overtimePay.setVisible(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Taxes:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 305, -1, 20));
        jLabel5.setVisible(false);

        taxes.setEditable(false);
        taxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxesActionPerformed(evt);
            }
        });
        jPanel1.add(taxes, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 305, 150, -1));
        overtimeHours.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Net Pay:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 343, -1, 20));
        jLabel5.setVisible(false);

        netPay.setEditable(false);
        netPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netPayActionPerformed(evt);
            }
        });
        jPanel1.add(netPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 343, 150, -1));
        overtimeHours.setVisible(false);

        confirmationBox.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        confirmationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationBoxActionPerformed(evt);
            }
        });
        jPanel1.add(confirmationBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 263, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);

        menuBarFile.setText("File");

        newStub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        newStub.setText("New");
        newStub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStubActionPerformed(evt);
            }
        });
        menuBarFile.add(newStub);

        generate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        menuBarFile.add(generate);

        saveToFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        saveToFile.setText("Save To File");
        saveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToFileActionPerformed(evt);
            }
        });
        menuBarFile.add(saveToFile);

        jMenuBar1.add(menuBarFile);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePayActionPerformed

    }//GEN-LAST:event_employeePayActionPerformed

    private void employeeHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeHoursActionPerformed

    }//GEN-LAST:event_employeeHoursActionPerformed

    private void grossPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossPayActionPerformed

    private void taxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxesActionPerformed

    private void netPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netPayActionPerformed

    private void overtimeHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overtimeHoursActionPerformed

    }//GEN-LAST:event_overtimeHoursActionPerformed

    private void overtimePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overtimePayActionPerformed

    }//GEN-LAST:event_overtimePayActionPerformed

    private void confirmationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmationBoxActionPerformed

    private void saveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToFileActionPerformed
        // TODO add your handling code here:
        date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyy HH.mm.ss"));
        try {
            file(employeeName.getText(), Double.parseDouble(employeePay.getText()),
                    Double.parseDouble(employeeHours.getText()), Double.parseDouble(overtimeHours.getText()),
                    Double.parseDouble(overtimePay.getText()), Double.parseDouble(grossPay.getText()),
                    Double.parseDouble(taxes.getText()), Double.parseDouble(netPay.getText()));
        } catch (IOException ex) {
            Logger.getLogger(WorkforcePaystubGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

        confirmationBox.setText("Saved to: " + System.getProperty("user.dir"));
    }//GEN-LAST:event_saveToFileActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(employeeHours.getText()) > 40) {
            jLabel4.setVisible(true);
            overtimePay.setVisible(true);
            jLabel5.setVisible(true);
            overtimeHours.setVisible(true);
            overtimeHours.setText(String.valueOf(Double.parseDouble(employeeHours.getText()) - 40));
            overtimePay.setText(String.valueOf(Double.parseDouble(employeePay.getText()) * 1.5));
            grossPay.setText(String.valueOf((Double.parseDouble(employeePay.getText()) * 40) + (Double.parseDouble(overtimePay.getText()) * Double.parseDouble(overtimeHours.getText()))));
            taxes.setText(String.valueOf(Double.parseDouble(grossPay.getText()) * 0.076));
            netPay.setText(String.valueOf(Double.parseDouble(grossPay.getText()) - Double.parseDouble(taxes.getText())));
        } else {
            jLabel4.setVisible(false);
            overtimePay.setVisible(false);
            jLabel5.setVisible(false);
            overtimeHours.setVisible(false);
            grossPay.setText(String.valueOf(Double.parseDouble(employeePay.getText()) * Double.parseDouble(employeeHours.getText())));
            taxes.setText(String.valueOf(Double.parseDouble(grossPay.getText()) * 0.076));
            netPay.setText(String.valueOf(Double.parseDouble(grossPay.getText()) - Double.parseDouble(taxes.getText())));
            overtimeHours.setText("0");
            overtimePay.setText("0");
        }
    }//GEN-LAST:event_generateActionPerformed

    private void newStubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStubActionPerformed
        
    }//GEN-LAST:event_newStubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmationBox;
    private javax.swing.JTextField employeeHours;
    private javax.swing.JTextField employeeName;
    private javax.swing.JTextField employeePay;
    private javax.swing.JLabel formTitle;
    private javax.swing.JMenuItem generate;
    private javax.swing.JTextField grossPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuBarFile;
    private javax.swing.JTextField netPay;
    private javax.swing.JMenuItem newStub;
    private javax.swing.JTextField overtimeHours;
    private javax.swing.JTextField overtimePay;
    private javax.swing.JMenuItem saveToFile;
    private javax.swing.JTextField taxes;
    // End of variables declaration//GEN-END:variables
}
