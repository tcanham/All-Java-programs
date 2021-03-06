
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public class OneArmedBandit extends javax.swing.JFrame {
     static int total=0;
     static int subTotal=0;

    /**
     * Creates new form OneArmedBandit
     */
    public OneArmedBandit() {
        initComponents();
        spinButton.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coinIn = new javax.swing.JButton();
        spinButton = new javax.swing.JButton();
        window1 = new javax.swing.JLabel();
        leftWindow = new javax.swing.JTextField();
        midWindow = new javax.swing.JTextField();
        rightWindow = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        winAmount = new javax.swing.JLabel();
        totalWins = new javax.swing.JLabel();
        collect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("One Armed bandit");
        setBackground(new java.awt.Color(255, 245, 245));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        coinIn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        coinIn.setForeground(new java.awt.Color(153, 0, 153));
        coinIn.setText("Coin in");
        coinIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinInActionPerformed(evt);
            }
        });

        spinButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        spinButton.setForeground(new java.awt.Color(153, 0, 153));
        spinButton.setText("Spin");
        spinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinButtonActionPerformed(evt);
            }
        });

        leftWindow.setBackground(new java.awt.Color(255, 245, 245));
        leftWindow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        leftWindow.setForeground(new java.awt.Color(255, 0, 0));
        leftWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftWindowActionPerformed(evt);
            }
        });

        midWindow.setBackground(new java.awt.Color(255, 245, 245));
        midWindow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        midWindow.setForeground(new java.awt.Color(255, 0, 0));

        rightWindow.setBackground(new java.awt.Color(255, 245, 245));
        rightWindow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rightWindow.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        winAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        winAmount.setForeground(new java.awt.Color(255, 0, 51));
        winAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        totalWins.setBackground(new java.awt.Color(255, 245, 245));
        totalWins.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalWins.setForeground(new java.awt.Color(204, 0, 204));
        totalWins.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        collect.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        collect.setForeground(new java.awt.Color(153, 0, 153));
        collect.setText("collect");
        collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText(" Bank");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText(" €");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(window1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(coinIn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinButton))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(leftWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(midWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rightWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalWins, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(winAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(collect, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(window1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinButton)
                            .addComponent(coinIn))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(midWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(winAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalWins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(collect)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinButtonActionPerformed
        
//--------------------Get random symbols--------------------------- 
       
        String a =symbols.symbol();
        String b =symbols.symbol(); 
        String c =symbols.symbol();
        
 //------------------Show in windows------------------------------- 
        
        leftWindow.setText(" "+a+" ");
        midWindow.setText(" "+b+" ");
        rightWindow.setText(" "+c+" ");
        
//------------------Check for win------------------------------------
        
        
    if(a.equals(b)&&b.equals(c))
    { 
     jLabel1.setText("     Congratulations you are a winner!!");        
    }//end of if   
    else{ jLabel1.setText(" "); }
    
//----------------credit win and add to bank----------------------------   
  
    if(a.equals("Cherry") & b.equals("Cherry")&c.equals("Cherry"))
    {
     winAmount.setText("        You win €5");total=total+5;
    }
    else if(a.equals(" !Star!") & b.equals(" !Star!")&c.equals(" !Star!"))
    {
        winAmount.setText("       You win €10");total=total+10;
    } 
    else if(a.equals(" Apple") & b.equals(" Apple")&c.equals(" Apple"))
    {
        winAmount.setText("        You win €1");total=total+1;
    } 
    else{ winAmount.setText(" ");}

    String strTotal=total+"";//make into string
    totalWins.setText("  "+strTotal); 
   
    
//------------------------End of spin button-----------------------------    
    }//GEN-LAST:event_spinButtonActionPerformed
 
    
    private void coinInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coinInActionPerformed
    
 //-------------------Show spin button------------------------------------      
        
        spinButton.setVisible(true);
        
//------------------------------------------------------------------------        
    }//GEN-LAST:event_coinInActionPerformed

    private void leftWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftWindowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftWindowActionPerformed

    private void collectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectActionPerformed
        
 //----------------------------Reset bank----------------------------------    
       
        totalWins.setText(" ");total=0;
        
//-------------------------------------------------------------------------        
    }//GEN-LAST:event_collectActionPerformed

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
            java.util.logging.Logger.getLogger(OneArmedBandit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneArmedBandit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneArmedBandit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneArmedBandit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OneArmedBandit().setVisible(true);
            }
        });
      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coinIn;
    private javax.swing.JButton collect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField leftWindow;
    private javax.swing.JTextField midWindow;
    private javax.swing.JTextField rightWindow;
    private javax.swing.JButton spinButton;
    private javax.swing.JLabel totalWins;
    private javax.swing.JLabel winAmount;
    private javax.swing.JLabel window1;
    // End of variables declaration//GEN-END:variables
}
