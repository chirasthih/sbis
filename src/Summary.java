

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chira
 */
public class Summary extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
  
   
    public Summary() {
        initComponents();
          con=databaseConnection.connection();
          
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        benecount = new javax.swing.JButton();
        benenum = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loancount = new javax.swing.JButton();
        loannum = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        socialcount = new javax.swing.JButton();
        socialnum = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bankcount = new javax.swing.JButton();
        banknum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        benecount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        benecount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/benefi1.jpg"))); // NOI18N
        benecount.setText("Beneficiaries");
        benecount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benecountActionPerformed(evt);
            }
        });

        benenum.setBackground(new java.awt.Color(255, 255, 255));
        benenum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(benecount))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(benenum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(benecount)
                .addGap(29, 29, 29)
                .addComponent(benenum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        loancount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loancount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loan1.jpg"))); // NOI18N
        loancount.setText("Loan Programs");
        loancount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loancountActionPerformed(evt);
            }
        });

        loannum.setBackground(new java.awt.Color(255, 255, 255));
        loannum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(loancount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loannum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loancount)
                .addGap(40, 40, 40)
                .addComponent(loannum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        socialcount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        socialcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social protection2.jpg"))); // NOI18N
        socialcount.setText("Social Protection Fund");
        socialcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialcountActionPerformed(evt);
            }
        });

        socialnum.setBackground(new java.awt.Color(255, 255, 255));
        socialnum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(socialcount))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(socialnum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(socialcount)
                .addGap(18, 18, 18)
                .addComponent(socialnum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        bankcount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bankcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank2.jpg"))); // NOI18N
        bankcount.setText("Bank Accounts");
        bankcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankcountActionPerformed(evt);
            }
        });

        banknum.setBackground(new java.awt.Color(255, 255, 255));
        banknum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bankcount))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(banknum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bankcount)
                .addGap(26, 26, 26)
                .addComponent(banknum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Summary");

        Menu.setBackground(new java.awt.Color(153, 153, 153));
        Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(421, 421, 421))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Menu)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Menu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu view=new Menu();
        view.setVisible(true);
        
    }//GEN-LAST:event_MenuActionPerformed

    private void benecountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benecountActionPerformed
        // TODO add your handling code here:
        try{
            String sql="Select count(name) from beneficiaries";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
           
            rs.next();
            int count=rs.getInt(1);
            benenum.setText(rs.getString("count(name)"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_benecountActionPerformed

    private void loancountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loancountActionPerformed
        // TODO add your handling code here:
         try{
            String sql="Select count(name) from loan";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
           
            rs.next();
            int count=rs.getInt(1);
            loannum.setText(rs.getString("count(name)"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_loancountActionPerformed

    private void bankcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankcountActionPerformed
        // TODO add your handling code here:
         try{
            String sql="Select count(name) from bank";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
           
            rs.next();
            int count=rs.getInt(1);
            banknum.setText(rs.getString("count(name)"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_bankcountActionPerformed

    private void socialcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialcountActionPerformed
        // TODO add your handling code here:
         try{
            String sql="Select count(name) from social";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
           
            rs.next();
            int count=rs.getInt(1);
            socialnum.setText(rs.getString("count(name)"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_socialcountActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton bankcount;
    private javax.swing.JLabel banknum;
    private javax.swing.JButton benecount;
    private javax.swing.JLabel benenum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loancount;
    private javax.swing.JLabel loannum;
    private javax.swing.JButton socialcount;
    private javax.swing.JLabel socialnum;
    // End of variables declaration//GEN-END:variables
}
