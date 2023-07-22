
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chira
 */
public class FundTransfer extends javax.swing.JFrame {

    Connection con=null;
Statement stmt=null;
ResultSet rs=null;

    /**
     * Creates new form SamurdhiAccount
     */
    public FundTransfer() {
        initComponents();
          con=databaseConnection.connection();
        
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        BankAccount = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        acno = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        Transfer = new javax.swing.JButton();
        bal = new javax.swing.JButton();
        checkbal = new javax.swing.JLabel();
        Transferlist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Fund Transfer");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Acc No.");

        Menu.setBackground(new java.awt.Color(153, 153, 153));
        Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        balance.setBackground(new java.awt.Color(255, 255, 255));
        balance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BankAccount.setBackground(new java.awt.Color(153, 153, 153));
        BankAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BankAccount.setText("Bank Account");
        BankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankAccountActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Amount");

        acno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date");

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Transfer.setBackground(new java.awt.Color(153, 153, 153));
        Transfer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transfer.setText("Transfer");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        bal.setBackground(new java.awt.Color(153, 153, 153));
        bal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bal.setText("Check Balance");
        bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balActionPerformed(evt);
            }
        });

        checkbal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbal.setText("balance");

        Transferlist.setBackground(new java.awt.Color(153, 153, 153));
        Transferlist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Transferlist.setText("Transfer List");
        Transferlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(balance)
                            .addComponent(acno, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(checkbal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Transfer)
                    .addComponent(BankAccount))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(bal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Transferlist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(Menu)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addComponent(acno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(balance)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transfer)
                    .addComponent(bal))
                .addGap(18, 18, 18)
                .addComponent(checkbal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu)
                    .addComponent(BankAccount)
                    .addComponent(Transferlist))
                .addGap(74, 74, 74))
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

    private void BankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankAccountActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Bankview view=new Bankview();
        view.setVisible(true); 
    }//GEN-LAST:event_BankAccountActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        // TODO add your handling code here:
         try
        {
          stmt=con.createStatement();
          int Acno=Integer.parseInt(acno.getText());
          double bamount=Double.parseDouble(amount.getText());
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
          String bDate=sdf.format(date.getDate());
          
          String query="INSERT INTO fundtransfer(acno,amount,date)VALUES(?,?,?)";
          PreparedStatement preparedStmt=con.prepareStatement(query);
          preparedStmt.setInt(1, Acno);
          preparedStmt.setDouble(2,bamount);
          preparedStmt.setString(3,bDate);
         
          
          preparedStmt.execute();
          JOptionPane.showMessageDialog(null,"transfered successfully");
          
          
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_TransferActionPerformed

    private void balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balActionPerformed
        // TODO add your handling code here:
        try{
         stmt=con.createStatement();
          double bamount=Double.parseDouble(amount.getText());
           String query="Select sum(amount) from fundtransfer";
            ResultSet rs=stmt.executeQuery(query);
            
           double sbalance=100000;
            rs.next();
            double sum=rs.getDouble(1);
           bamount=rs.getDouble("sum(amount)");
           sbalance-=bamount;
           String s=Double.toString(sbalance);
           checkbal.setText(s);
           
        }
        catch(Exception e){
              System.out.println(e); 
        }
    }//GEN-LAST:event_balActionPerformed

    private void TransferlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferlistActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        TransferList view=new TransferList();
        view.setVisible(true);
    }//GEN-LAST:event_TransferlistActionPerformed

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
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FundTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankAccount;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton Transferlist;
    private javax.swing.JTextField acno;
    private javax.swing.JTextField amount;
    private javax.swing.JButton bal;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel checkbal;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
