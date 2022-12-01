package carpeta;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JOHAN
 */
public class main extends javax.swing.JFrame {
    funcionesGenerales funciones = new funcionesGenerales();
    DefaultTableModel tablemodel;
    DefaultTableModel molde;
    boolean opc;
    int fila ;


    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        opc = false;
        
        try {
            tablemodel = funciones.mostrardatos();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtpos1.setText(Integer.toString(fila+1));
        txtpos2.setText(Integer.toString(funciones.numero));
        txtadress.setText(tablemodel.getValueAt(fila, 0).toString());
        txtnombre.setText(tablemodel.getValueAt(fila, 1).toString());
        txtnombrelast.setText(tablemodel.getValueAt(fila, 2).toString());
        txtemail.setText(tablemodel.getValueAt(fila, 3).toString());
        txtnumero.setText(tablemodel.getValueAt(fila, 4).toString());
    }
    public main(int a) {
        initComponents();
        setLocationRelativeTo(null);
        opc = true;
        txtpos1.setText("");
        txtpos2.setText("");
        txtadress.setText("");
        txtnombre.setText("");
        txtnombrelast.setText("");
        txtemail.setText("");
        txtnumero.setText("");
        btninsert.setText("Guardar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btninsert = new javax.swing.JButton();
        txtadress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtpos2 = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpos1 = new javax.swing.JTextField();
        txtnombrelast = new javax.swing.JTextField();
        btnprevious = new javax.swing.JButton();
        txtnumero = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        principalname = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Email:");

        btnbrowse.setText("Browse All Entries");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone Number:");

        btninsert.setText("Insert New Entry");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        txtadress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadressActionPerformed(evt);
            }
        });

        jLabel1.setText("of");

        txtpos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpos2ActionPerformed(evt);
            }
        });

        txtpos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpos1ActionPerformed(evt);
            }
        });

        btnprevious.setText("Previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Find an entry by last name"));

        jLabel7.setText("Last Name:");

        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(principalname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(principalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setText("Address ID:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnprevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtpos2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnnext))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrelast, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnbrowse)
                                        .addGap(47, 47, 47)
                                        .addComponent(btninsert))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprevious)
                    .addComponent(btnnext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnombrelast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbrowse)
                    .addComponent(btninsert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
            mostrartabla p1 = new mostrartabla();
            p1.setVisible(true);        

// TODO add your handling code here:
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        if (!opc){
            dispose();
            funciones.registre(); 
            if (!txtadress.getText().equals("")){
            contacto regis = new contacto();
            regis.setIdAddress(Integer.parseInt(txtadress.getText()));
            regis.setFirstName(txtnombre.getText());
            regis.setLastName(txtnombrelast.getText());
            regis.setEmail(txtemail.getText());
            regis.setPhoneNumber(Integer.parseInt(txtnumero.getText()));
        try {
            funciones.Insertdat(regis);
        } catch (SQLException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }        
    }//GEN-LAST:event_btninsertActionPerformed

    private void txtpos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpos1ActionPerformed

    private void txtadressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadressActionPerformed

    private void txtpos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpos2ActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(txtpos2.getText())-1 > fila && 0<=fila){
            fila++;
        txtpos1.setText(Integer.toString(fila+1));
        txtadress.setText(tablemodel.getValueAt(fila, 0).toString());
        txtnombre.setText(tablemodel.getValueAt(fila, 1).toString());
        txtnombrelast.setText(tablemodel.getValueAt(fila, 2).toString());
        txtemail.setText(tablemodel.getValueAt(fila, 3).toString());
        txtnumero.setText(tablemodel.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        // TODO add your handling code here:
         if (fila < Integer.parseInt(txtpos2.getText())&& 0<fila){   
            fila --; 
        txtpos1.setText(Integer.toString(fila+1));
        txtadress.setText(tablemodel.getValueAt(fila, 0).toString());
        txtnombre.setText(tablemodel.getValueAt(fila, 1).toString());
        txtnombrelast.setText(tablemodel.getValueAt(fila, 2).toString());
        txtemail.setText(tablemodel.getValueAt(fila, 3).toString());
        txtnumero.setText(tablemodel.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int nuevafila = 0;
        try {
            molde = funciones.buscardato(principalname.getText());
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0;i<Integer.parseInt(txtpos2.getText());i++){
           if (tablemodel.getValueAt(i, 0).toString().equals(molde.getValueAt(fila, 0).toString())) {
               System.out.println("encontrado  "+ i);
               nuevafila = i;
           } 
        }
        txtadress.setText(molde.getValueAt(fila, 0).toString());
        txtnombre.setText(molde.getValueAt(fila, 1).toString());
        txtnombrelast.setText(molde.getValueAt(fila, 2).toString());
        txtemail.setText(molde.getValueAt(fila, 3).toString());
        txtnumero.setText(molde.getValueAt(fila, 4).toString());
        txtpos1.setText(Integer.toString(nuevafila+1));
        fila = nuevafila;
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField principalname;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrelast;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpos1;
    private javax.swing.JTextField txtpos2;
    // End of variables declaration//GEN-END:variables
}