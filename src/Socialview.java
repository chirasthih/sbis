/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author chira
 */
public class Socialview extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null;
ResultSet rs=null;

    /**
     * Creates new form Socialview
     */
    public Socialview() {
        initComponents();
        con=databaseConnection.connection();
        showSocial();        
    }
     public void showSocial(){
        try
        {
            stmt=con.createStatement();
            if(category.getSelectedItem().equals("All"))
            {
                
            
            String query="SELECT * FROM social";
            ResultSet re=stmt.executeQuery(query);
            socialTable.setModel(DbUtils.resultSetToTableModel(re));
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
        category = new javax.swing.JComboBox<>();
        socialtable = new javax.swing.JScrollPane();
        socialTable = new javax.swing.JTable();
        AddEdit = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Social Protection Fund");

        category.setBackground(new java.awt.Color(102, 255, 102));
        category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Child birth", "Marriage", "Hospitalized", "Death" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        socialTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        socialTable.setModel(new javax.swing.table.DefaultTableModel(
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
        socialtable.setViewportView(socialTable);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(591, 591, 591)
                .addComponent(AddEdit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Menu)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(socialtable, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(socialtable, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddEdit)
                .addGap(30, 30, 30)
                .addComponent(Menu)
                .addGap(42, 42, 42))
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

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
       try{
            stmt=con.createStatement();
            if(category.getSelectedItem().equals("All"))
            {
                String query="SELECT * FROM social";
                ResultSet re=stmt.executeQuery(query);
                socialTable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(category.getSelectedItem().equals("Child birth"))
            {
                String query="SELECT * FROM social WHERE category='Child birth'";
                ResultSet re=stmt.executeQuery(query);
                socialTable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(category.getSelectedItem().equals("Marriage"))
            {
                String query="SELECT * FROM social WHERE category='Marriage'";
                ResultSet re=stmt.executeQuery(query);
                socialTable.setModel(DbUtils.resultSetToTableModel(re));
            }

            if(category.getSelectedItem().equals("Hospitalized"))
            {
                String query="SELECT * FROM social WHERE category='Hospitalized'";
                ResultSet re=stmt.executeQuery(query);
                socialTable.setModel(DbUtils.resultSetToTableModel(re));
            }
              if(category.getSelectedItem().equals("Death"))
            {
                String query="SELECT * FROM social WHERE category='Death'";
                ResultSet re=stmt.executeQuery(query);
                socialTable.setModel(DbUtils.resultSetToTableModel(re));
            }
                    
        } 
          catch(Exception e){
            System.out.println(e);
          }
             
    }//GEN-LAST:event_categoryActionPerformed

    private void AddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SocialProtection view=new SocialProtection();
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
            java.util.logging.Logger.getLogger(Socialview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socialview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socialview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socialview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socialview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEdit;
    private javax.swing.JButton Menu;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable socialTable;
    private javax.swing.JScrollPane socialtable;
    // End of variables declaration//GEN-END:variables
}
