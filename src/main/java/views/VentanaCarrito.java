/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import java.util.HashMap;
import javax.swing.DefaultListModel;

/**
 *
 * @author clara
 */
public class VentanaCarrito extends javax.swing.JDialog {

    /**
     * Creates new form VentanaCarrito
     */
    private static DefaultListModel<String> listModel = new DefaultListModel<>();
    private static HashMap<String, Integer> productosCarrito = new HashMap<>();
    private PanelPrincipal panelMain;

    public VentanaCarrito(PanelPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(panelMain);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCarrito = new javax.swing.JList<>();
        jBtnPagar = new javax.swing.JButton();
        jBtnVaciar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wok & Roll - Carrito");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito actual:");

        jListCarrito.setBackground(new java.awt.Color(51, 51, 51));
        jListCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jListCarrito.setModel(listModel);
        jScrollPane1.setViewportView(jListCarrito);

        jBtnPagar.setText("PAGAR");

        jBtnVaciar.setText("VACIAR");

        jBtnVolver.setText("VOLVER");
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
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnPagar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnVolver)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPagar)
                    .addComponent(jBtnVaciar)
                    .addComponent(jBtnVolver))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void agregarProducto(String producto) {
        listModel.addElement(producto);
    }
    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPagar;
    private javax.swing.JButton jBtnVaciar;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
