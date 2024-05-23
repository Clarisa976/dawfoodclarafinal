/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package views;

import controllers.ProductosJpaController;
import controllers.TpvJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import models.Tpv;
import views.PanelPrincipal;

/**
 *
 * @author clara
 */
public class VentanaAdmin extends java.awt.Dialog {

    /**
     * Creates new form VentanaAdmin
     */
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");
    private static TpvJpaController tjc = new TpvJpaController(emf);
    private PanelPrincipal panelMain;

    public VentanaAdmin(PanelPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(panelMain);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPassField = new javax.swing.JPasswordField();
        jBtnAcceder = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();

        setResizable(false);
        setTitle("Wok & Roll - Administrador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Introduce la contraseña:");

        jPassField.setBackground(new java.awt.Color(204, 204, 204));
        jPassField.setForeground(new java.awt.Color(0, 0, 0));
        jPassField.setText("Ab*+34");
        jPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassFieldActionPerformed(evt);
            }
        });

        jBtnAcceder.setBackground(new java.awt.Color(204, 255, 204));
        jBtnAcceder.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAcceder.setText("ACCEDER");
        jBtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccederActionPerformed(evt);
            }
        });

        jBtnVolver.setBackground(new java.awt.Color(204, 255, 204));
        jBtnVolver.setForeground(new java.awt.Color(0, 0, 0));
        jBtnVolver.setText("CANCELAR");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPassField)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnVolver)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jBtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccederActionPerformed
        // TODO add your handling code here:
        new VentanaAdministrador(panelMain, true).setVisible(true);
    }//GEN-LAST:event_jBtnAccederActionPerformed

    private void jPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassFieldActionPerformed
        // TODO add your handling code here:
        //la contraseña que se ha puesto
        String passIngresada = new String(jPassField.getPassword());


        //contraseña almacenada en la base de datos
        Tpv tpv = tjc.findTpv(1);
        String passBD = tpv.getPassAdministrador();
        System.out.println(passBD);

        //se comprueba si las contraseñas coinciden
        if (passIngresada.equals(passBD)) {
            //si coinciden
            new VentanaAdministrador(panelMain, true).setVisible(true);
            System.out.println("Las contraseñas coinciden");
        } else {
            //si no coinciden
            JOptionPane.showMessageDialog(null,
                    "Te has equivocado", "Cagaste",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPassFieldActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcceder;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassField;
    // End of variables declaration//GEN-END:variables
}
