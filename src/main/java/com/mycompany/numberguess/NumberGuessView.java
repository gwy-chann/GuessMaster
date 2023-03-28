/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.numberguess;

import java.awt.event.KeyEvent;
import java.util.Random;

/**
 *
 * @author rosel
 */
public class NumberGuessView extends javax.swing.JFrame {
    /**
     * Creates new form NumberGuessView
     */
    public NumberGuessView() {
        initComponents();
        btnReset.setVisible(false);
    }
    
    
    AboutGuessMaster aboutGuessMaster = new AboutGuessMaster();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGuessNumber = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GuessMaster");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(118, 95, 141));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter your guess between (1-100)");

        txtGuessNumber.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtGuessNumber.setForeground(new java.awt.Color(107, 68, 126));
        txtGuessNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGuessNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtGuessNumber.setCaretColor(new java.awt.Color(51, 0, 102));
        txtGuessNumber.setMargin(new java.awt.Insets(12, 50, 2, 6));
        txtGuessNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGuessNumberKeyPressed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(249, 249, 249));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosel\\Downloads\\btnSubmit 100skr.png")); // NOI18N
        btnSubmit.setAlignmentX(0.5F);
        btnSubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSubmit.setBorderPainted(false);
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        logo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosel\\Downloads\\GuessMaster(600 × 500 px).png")); // NOI18N
        logo.setMaximumSize(new java.awt.Dimension(600, 250));
        logo.setMinimumSize(new java.awt.Dimension(600, 600));

        lblMessage.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(118, 95, 141));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setToolTipText("");

        btnReset.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosel\\Downloads\\btnReset.png")); // NOI18N
        btnReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReset.setBorderPainted(false);
        btnReset.setContentAreaFilled(false);
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(249, 249, 249));
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosel\\Downloads\\SKR.png")); // NOI18N
        btnAbout.setBorder(null);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(txtGuessNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addComponent(btnSubmit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(txtGuessNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        
        onSubmit();
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
      onReset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void txtGuessNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuessNumberKeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(isDone) {
                onReset();
                return;
            }
            onSubmit();
        }
    }//GEN-LAST:event_txtGuessNumberKeyPressed

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        // TODO add your handling code here:
        aboutGuessMaster.setVisible(true);
        aboutGuessMaster.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAboutMouseClicked

    
    private void onReset() {
        lblMessage.setText("Guess again.");
        txtGuessNumber.setText("");
        
        btnReset.setVisible(false);
        tryCount = 0;
        isDone = false;
        
    }
    private void onSubmit() {
        // This converts the string into an integer
        int txtPlayerGuess = Integer.parseInt(this.txtGuessNumber.getText());
        
        if("".equals(this.txtGuessNumber.getText())) return;
        
        tryCount++;
        
         if (tryCount == 6) {   
                lblMessage.setText("Game Over! The random number is " + randomNumber + " Play again.");
                btnReset.setVisible(true);      
                isDone = true;
                return;
         }
            
        if (txtPlayerGuess == randomNumber) {
            
               lblMessage.setText("Correct it only took you " + tryCount + " tries.");
               isDone = true;
                btnReset.setVisible(true);
                
        }   else if (randomNumber > txtPlayerGuess) {
               
                txtGuessNumber.setText("");
                lblMessage.setText("The random number is higher");
            
        } else {
            
                txtGuessNumber.setText("");
                lblMessage.setText("The random number is lower");  
            
        }
    
    
    }
    
    
    static int randomNumber = 0;
    static int tryCount = 0;
    static boolean isDone = false;
    public static void main(String args[]) {
  
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberGuessView().setVisible(true);
            }
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtGuessNumber;
    // End of variables declaration//GEN-END:variables
}
