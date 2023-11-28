package com.workforcePaystubGenerator;

import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class main extends JFrame {

    static String date;
    static String stub;
    static NumberFormat fmt = NumberFormat.getCurrencyInstance();
    static DecimalFormat df = new DecimalFormat("##.##");
    static File theDir;

    public main() {
        initComponents();

        UIManager.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.blue));
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    public static void file(String name, double hP, double hW, double oT, double oTp, double gP, double tD, double nP) throws IOException {
        stub = "Hours Pay: " + fmt.format(hP) + "\nHourly Worked: " + hW
                + "\nOvertime Pay: " + fmt.format(oTp) + "\nOvertime Hours: " + df.format(oT)
                + "\n\n\n\t\t\tGross Pay: " + fmt.format(gP) + "\n\t\t\tTaxes: "
                + fmt.format(tD) + "\n\t\t\tNet Pay: " + fmt.format(nP);

        new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Employees").mkdir();
        theDir = new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Employees" + File.separator + name);
        if (!theDir.exists()) {
            theDir.mkdir();
            try (PrintWriter writer = new PrintWriter(theDir + File.separator + date + ".txt", "UTF-8")) {
                writer.write(stub);
            }
        } else {
            try (PrintWriter writer = new PrintWriter(theDir + File.separator + date + ".txt", "UTF-8")) {
                writer.write(stub);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
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
        newFile = new javax.swing.JButton();
        saveToFile = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stub-Inator");
        setAutoRequestFocus(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(512, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(512, 330));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name:");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setFocusable(false);
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        employeeName.setBackground(new java.awt.Color(204, 204, 204));
        employeeName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeName.setNextFocusableComponent(employeePay);
        mainPanel.add(employeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pay Per Hour:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusable(false);
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        employeePay.setBackground(new java.awt.Color(204, 204, 204));
        employeePay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeePay.setNextFocusableComponent(employeeHours);
        employeePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePayActionPerformed(evt);
            }
        });
        mainPanel.add(employeePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hours Worked:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setFocusable(false);
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        employeeHours.setBackground(new java.awt.Color(204, 204, 204));
        employeeHours.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeHoursActionPerformed(evt);
            }
        });
        mainPanel.add(employeeHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Overtime Pay:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusable(false);
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        overtimePay.setEditable(false);
        overtimePay.setBackground(new java.awt.Color(204, 204, 204));
        overtimePay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        overtimePay.setFocusable(false);
        overtimePay.setInheritsPopupMenu(true);
        overtimePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimePayActionPerformed(evt);
            }
        });
        mainPanel.add(overtimePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Overtime Hours:");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setFocusable(false);
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        overtimeHours.setEditable(false);
        overtimeHours.setBackground(new java.awt.Color(204, 204, 204));
        overtimeHours.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        overtimeHours.setFocusable(false);
        overtimeHours.setInheritsPopupMenu(true);
        overtimeHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimeHoursActionPerformed(evt);
            }
        });
        mainPanel.add(overtimeHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gross Pay:");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setFocusable(false);
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, 20));

        grossPay.setEditable(false);
        grossPay.setBackground(new java.awt.Color(204, 204, 204));
        grossPay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grossPay.setFocusable(false);
        grossPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossPayActionPerformed(evt);
            }
        });
        mainPanel.add(grossPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Taxes:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setFocusable(false);
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 20));

        taxes.setEditable(false);
        taxes.setBackground(new java.awt.Color(204, 204, 204));
        taxes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taxes.setFocusable(false);
        taxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxesActionPerformed(evt);
            }
        });
        mainPanel.add(taxes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Net Pay:");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setFocusable(false);
        mainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 20));

        netPay.setEditable(false);
        netPay.setBackground(new java.awt.Color(204, 204, 204));
        netPay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        netPay.setFocusable(false);
        netPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netPayActionPerformed(evt);
            }
        });
        mainPanel.add(netPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, -1));

        newFile.setBackground(new java.awt.Color(204, 204, 204));
        newFile.setText("New");
        newFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newFile.setFocusPainted(false);
        newFile.setFocusable(false);
        newFile.setPreferredSize(new java.awt.Dimension(90, 40));
        newFile.setRequestFocusEnabled(false);
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        mainPanel.add(newFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        newFile.setVisible(false);

        saveToFile.setBackground(new java.awt.Color(204, 204, 204));
        saveToFile.setText("Save");
        saveToFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveToFile.setFocusPainted(false);
        saveToFile.setFocusable(false);
        saveToFile.setPreferredSize(new java.awt.Dimension(90, 40));
        saveToFile.setRequestFocusEnabled(false);
        saveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToFileActionPerformed(evt);
            }
        });
        mainPanel.add(saveToFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        saveToFile.setVisible(false);

        generateButton.setBackground(new java.awt.Color(204, 204, 204));
        generateButton.setText("Generate");
        generateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateButton.setFocusPainted(false);
        generateButton.setFocusable(false);
        generateButton.setPreferredSize(new java.awt.Dimension(90, 40));
        generateButton.setRequestFocusEnabled(false);
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });
        mainPanel.add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        backgroundImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/KvIVwz6.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        backgroundImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void saveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToFileActionPerformed
        date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyy HH.mm.ss"));
        try {
            file(employeeName.getText(), Double.parseDouble(employeePay.getText()),
                    Double.parseDouble(employeeHours.getText()), Double.parseDouble(overtimeHours.getText()),
                    Double.parseDouble(overtimePay.getText()), Double.parseDouble(grossPay.getText()),
                    Double.parseDouble(taxes.getText()), Double.parseDouble(netPay.getText()));
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(rootPane, "Saved to: " + theDir);
    }//GEN-LAST:event_saveToFileActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        this.dispose();
        new main().setVisible(true);
    }//GEN-LAST:event_newFileActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        if (!employeeHours.getText().isBlank() && !employeeName.getText().isBlank() && !employeePay.getText().isBlank()) {
            generateButton.setVisible(false);
            saveToFile.setVisible(true);
            newFile.setVisible(true);
            if (Double.parseDouble(employeeHours.getText()) > 40) {
                employeeHours.setEditable(false);
                employeeName.setEditable(false);
                employeePay.setEditable(false);
                employeeHours.setFocusable(false);
                employeeName.setFocusable(false);
                employeePay.setFocusable(false);
                overtimeHours.setText(String.valueOf(Double.parseDouble(employeeHours.getText()) - 40));
                overtimePay.setText(String.valueOf(Double.parseDouble(employeePay.getText()) * 1.5));
                grossPay.setText(String.valueOf((Double.parseDouble(employeePay.getText()) * 40) + (Double.parseDouble(overtimePay.getText()) * Double.parseDouble(overtimeHours.getText()))));
                taxes.setText(String.valueOf(Double.parseDouble(grossPay.getText()) * 0.076));
                netPay.setText(String.valueOf(Double.parseDouble(grossPay.getText()) - Double.parseDouble(taxes.getText())));
            } else {
                employeeHours.setEditable(false);
                employeeName.setEditable(false);
                employeePay.setEditable(false);
                employeeHours.setFocusable(false);
                employeeName.setFocusable(false);
                employeePay.setFocusable(false);
                grossPay.setText(String.valueOf(Double.parseDouble(employeePay.getText()) * Double.parseDouble(employeeHours.getText())));
                taxes.setText(String.valueOf(Double.parseDouble(grossPay.getText()) * 0.076));
                netPay.setText(String.valueOf(Double.parseDouble(grossPay.getText()) - Double.parseDouble(taxes.getText())));
                overtimeHours.setText("0");
                overtimePay.setText("0");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please make sure no fields (Employee name, Employee hours, Employee Pay) are left blank");
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField employeeHours;
    private javax.swing.JTextField employeeName;
    private javax.swing.JTextField employeePay;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField grossPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField netPay;
    private javax.swing.JButton newFile;
    private javax.swing.JTextField overtimeHours;
    private javax.swing.JTextField overtimePay;
    private javax.swing.JButton saveToFile;
    private javax.swing.JTextField taxes;
    // End of variables declaration//GEN-END:variables
}
