
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chira
 */
public class Loanview extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
    /**
     * Creates new form Loanview
     */
    public Loanview() {
        initComponents();
        con=databaseConnection.connection();
        showLoanp();
    }
    public void showLoanp(){
        try
        {
            stmt=con.createStatement();
            if(loanprogram.getSelectedItem().equals("All"))
            {
                
            
            String query="SELECT * FROM loan";
            ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loanprogram = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        loantable = new javax.swing.JTable();
        AddEdit = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Loan Programs");

        loanprogram.setBackground(new java.awt.Color(102, 255, 0));
        loanprogram.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loanprogram.setForeground(new java.awt.Color(51, 51, 51));
        loanprogram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Self Employment", "Cultivation", "Fisheries", "Distress Loan", "Consumable", "Home", "Isuru" }));
        loanprogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanprogramActionPerformed(evt);
            }
        });

        loantable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(loantable);

        AddEdit.setBackground(new java.awt.Color(153, 153, 153));
        AddEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddEdit.setText("Add/Edit");
        AddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditActionPerformed(evt);
            }
        });

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
                .addGap(476, 476, 476)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loanprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AddEdit)
                        .addGap(491, 491, 491))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Menu)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(loanprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(AddEdit)
                .addGap(42, 42, 42)
                .addComponent(Menu)
                .addContainerGap(103, Short.MAX_VALUE))
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

    private void loanprogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanprogramActionPerformed
        // TODO add your handling code here:
        try{
            stmt=con.createStatement();
            if(loanprogram.getSelectedItem().equals("All"))
            {
            String query="SELECT * FROM loan";
            ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
            }
            
            if(loanprogram.getSelectedItem().equals("Self Employment"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Self Employment'";
            ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
            }
        
            if(loanprogram.getSelectedItem().equals("Cultivation"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Cultivation'";
            ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
            }
            
             if(loanprogram.getSelectedItem().equals("Fisheries"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Fisheries'";
             ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
            }
                   if(loanprogram.getSelectedItem().equals("Distress Loan"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Distress Loan'";
             ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
        }
             
         if(loanprogram.getSelectedItem().equals("Consumable"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Consumable'";
             ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
        }
         
          if(loanprogram.getSelectedItem().equals("Home"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Home'";
             ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
        }
          
           if(loanprogram.getSelectedItem().equals("Isuru"))
            {
            String query="SELECT * FROM loan WHERE loanprogram='Isuru'";
             ResultSet re=stmt.executeQuery(query);
            loantable.setModel(DbUtils.resultSetToTableModel(re));
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_loanprogramActionPerformed

    private void AddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Loanprogram view=new Loanprogram();
        view.setVisible(true);
    }//GEN-LAST:event_AddEditActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu view=new Menu();
        view.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed
      
       
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
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loanview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEdit;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loanprogram;
    private javax.swing.JTable loantable;
    // End of variables declaration//GEN-END:variables
}
