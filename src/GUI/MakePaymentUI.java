/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Joe
 */
public class MakePaymentUI extends javax.swing.JFrame {
  
    public JLabel getCV2Label() {
        return CV2Label;
    }

    public void setCV2Label(JLabel CV2Label) {
        this.CV2Label = CV2Label;
    }

    public JTextField getCV2Text() {
        return CV2Text;
    }

    public void setCV2Text(JTextField CV2Text) {
        this.CV2Text = CV2Text;
    }

    public JLabel getCardNumberLabel() {
        return CardNumberLabel;
    }

    public void setCardNumberLabel(JLabel CardNumberLabel) {
        this.CardNumberLabel = CardNumberLabel;
    }

    public JTextField getCardNumberText() {
        return CardNumberText;
    }

    public void setCardNumberText(JTextField CardNumberText) {
        this.CardNumberText = CardNumberText;
    }

    public JLabel getExpiryDateLabel() {
        return ExpiryDateLabel;
    }

    public void setExpiryDateLabel(JLabel ExpiryDateLabel) {
        this.ExpiryDateLabel = ExpiryDateLabel;
    }

    public JTextField getExpiryDateText() {
        return ExpiryDateText;
    }

    public void setExpiryDateText(JTextField ExpiryDateText) {
        this.ExpiryDateText = ExpiryDateText;
    }

    public JCheckBox getFuturePaymentsBox() {
        return FuturePaymentsBox;
    }

    public void setFuturePaymentsBox(JCheckBox FuturePaymentsBox) {
        this.FuturePaymentsBox = FuturePaymentsBox;
    }

    public JLabel getNameCardLabel() {
        return NameCardLabel;
    }

    public void setNameCardLabel(JLabel NameCardLabel) {
        this.NameCardLabel = NameCardLabel;
    }

    public JTextField getNameCardText() {
        return NameCardText;
    }

    public void setNameCardText(JTextField NameCardText) {
        this.NameCardText = NameCardText;
    }

    public JButton getPayLaterButton() {
        return PayLaterButton;
    }

    public void setPayLaterButton(JButton PayLaterButton) {
        this.PayLaterButton = PayLaterButton;
    }

    public JButton getPayNowButton() {
        return PayNowButton;
    }

    public void setPayNowButton(JButton PayNowButton) {
        this.PayNowButton = PayNowButton;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * Creates new form MakePaymentUI
     * @param jPanel1
     */
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public MakePaymentUI() {
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

        jPanel1 = new javax.swing.JPanel();
        NameCardLabel = new javax.swing.JLabel();
        CardNumberLabel = new javax.swing.JLabel();
        ExpiryDateLabel = new javax.swing.JLabel();
        CV2Label = new javax.swing.JLabel();
        NameCardText = new javax.swing.JTextField();
        CardNumberText = new javax.swing.JTextField();
        ExpiryDateText = new javax.swing.JTextField();
        CV2Text = new javax.swing.JTextField();
        FuturePaymentsBox = new javax.swing.JCheckBox();
        PayNowButton = new javax.swing.JButton();
        PayLaterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit Card Details"));

        NameCardLabel.setText("Name On Card: ");

        CardNumberLabel.setText("Card Number: ");

        ExpiryDateLabel.setText("Expiry Date: ");

        CV2Label.setText("CV2 Number: ");

        CardNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNumberTextActionPerformed(evt);
            }
        });

        ExpiryDateText.setText("DD/MM/YY");

        CV2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CV2TextActionPerformed(evt);
            }
        });

        FuturePaymentsBox.setText("Save details for future payments? ");
        FuturePaymentsBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FuturePaymentsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuturePaymentsBoxActionPerformed(evt);
            }
        });

        PayNowButton.setText("Make Paymet Now");

        PayLaterButton.setText("Pay On Arrival");
        PayLaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayLaterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CardNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExpiryDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CV2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PayNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CV2Text)
                                    .addComponent(ExpiryDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(CardNumberText)
                                    .addComponent(NameCardText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(PayLaterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(FuturePaymentsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameCardLabel)
                    .addComponent(NameCardText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardNumberLabel)
                    .addComponent(CardNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpiryDateLabel)
                    .addComponent(ExpiryDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CV2Label)
                    .addComponent(CV2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(FuturePaymentsBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayNowButton)
                    .addComponent(PayLaterButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CardNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardNumberTextActionPerformed

    private void CV2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CV2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CV2TextActionPerformed

    private void FuturePaymentsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuturePaymentsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuturePaymentsBoxActionPerformed

    private void PayLaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayLaterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayLaterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MakePaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakePaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakePaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakePaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakePaymentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CV2Label;
    private javax.swing.JTextField CV2Text;
    private javax.swing.JLabel CardNumberLabel;
    private javax.swing.JTextField CardNumberText;
    private javax.swing.JLabel ExpiryDateLabel;
    private javax.swing.JTextField ExpiryDateText;
    private javax.swing.JCheckBox FuturePaymentsBox;
    private javax.swing.JLabel NameCardLabel;
    private javax.swing.JTextField NameCardText;
    private javax.swing.JButton PayLaterButton;
    private javax.swing.JButton PayNowButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}