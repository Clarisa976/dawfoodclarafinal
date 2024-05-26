/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import controllers.TipoproductoJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import models.Tipoproducto;

/**
 *
 * @author clara
 */
public class VentanaModificarCategoria extends javax.swing.JDialog {

    /**
     * Creates new form VentanaAgregarCategoria
     */
    private PanelPrincipal panelMain;
    private Integer idTipoProducto;
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");
    private static final TipoproductoJpaController tpjc = new TipoproductoJpaController(emf);

    public VentanaModificarCategoria(PanelPrincipal parent, boolean modal, Integer idTipoProducto) {
        super(parent, modal);
        initComponents();
        this.idTipoProducto = idTipoProducto;
        cargarDatosProducto();
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

        btnGroupTipoCategorias = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jrbntComidas = new javax.swing.JRadioButton();
        jrbtnBebidas = new javax.swing.JRadioButton();
        jrbtnPostres = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wok & Roll - Agragar categoría");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID subcategoría:");

        jtfID.setEditable(false);
        jtfID.setBackground(new java.awt.Color(204, 204, 204));
        jtfID.setForeground(new java.awt.Color(0, 0, 0));
        jtfID.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de categoría*:");

        jrbntComidas.setBackground(new java.awt.Color(51, 51, 51));
        btnGroupTipoCategorias.add(jrbntComidas);
        jrbntComidas.setForeground(new java.awt.Color(255, 255, 255));
        jrbntComidas.setText("COMIDAS");
        jrbntComidas.setToolTipText("");

        jrbtnBebidas.setBackground(new java.awt.Color(51, 51, 51));
        btnGroupTipoCategorias.add(jrbtnBebidas);
        jrbtnBebidas.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnBebidas.setText("BEBIDAS");
        jrbtnBebidas.setToolTipText("");

        jrbtnPostres.setBackground(new java.awt.Color(51, 51, 51));
        btnGroupTipoCategorias.add(jrbtnPostres);
        jrbtnPostres.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnPostres.setText("POSTRES");
        jrbtnPostres.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la subcategoría*:");

        jtfNombre.setBackground(new java.awt.Color(51, 51, 51));
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtfNombre.setToolTipText("Introduce el nombre de la subcategoría");

        jbtnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        jbtnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnSalir.setBackground(new java.awt.Color(204, 255, 204));
        jbtnSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSalir.setText("VOLVER");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jrbntComidas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbtnBebidas)
                                .addGap(34, 34, 34)
                                .addComponent(jrbtnPostres))
                            .addComponent(jtfID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jbtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSalir)
                .addGap(66, 66, 66))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jrbntComidas, jrbtnBebidas, jrbtnPostres});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnGuardar, jbtnSalir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbntComidas)
                    .addComponent(jrbtnBebidas)
                    .addComponent(jrbtnPostres))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnSalir))
                .addGap(23, 23, 23))
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

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = jtfNombre.getText();
        String categoria = null;

        if (jrbntComidas.isSelected()) {
            categoria = "COMIDAS";
        } else if (jrbtnBebidas.isSelected()) {
            categoria = "BEBIDAS";
        } else if (jrbtnPostres.isSelected()) {
            categoria = "POSTRES";
        }

        if (nombre.isEmpty() || categoria == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //modificamos y guardamos el nuevo tipoproducto
        Tipoproducto tipoProductoModificado = tpjc.findTipoproducto(idTipoProducto);
        //verificamos que el nombre del tipo producto que se modifica ya exista
        Tipoproducto existente = tpjc.findTipoproductoByNombre(nombre);
        if (existente != null && !existente.getIdTipoProducto().equals(idTipoProducto)) {
            JOptionPane.showMessageDialog(this, "El nombre del tipo de producto ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tipoProductoModificado.setNomTipoProducto(nombre);
        tipoProductoModificado.setNomCategoria(categoria);

        try {
            tpjc.edit(tipoProductoModificado);
            JOptionPane.showMessageDialog(this, "Categoría agregada exitosamente.", "Wok & Roll - mantenimiento", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar la categoría: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    //método para cargar los datos del producto seleccionado
    private void cargarDatosProducto() {
        EntityManager em = emf.createEntityManager();
        try {
            Tipoproducto producto = tpjc.findTipoproducto(idTipoProducto);
            if (producto != null) {
                jtfID.setText(producto.getIdTipoProducto().toString());
                jtfNombre.setText(producto.getNomTipoProducto());

                if (producto != null) {

                    switch (producto.getNomCategoria()) {
                        case "COMIDAS":
                            jrbntComidas.setSelected(true);
                            break;
                        case "BEBIDAS":
                            jrbtnBebidas.setSelected(true);
                            break;
                        case "POSTRES":
                            jrbtnPostres.setSelected(true);
                            break;
                    }
                }
            }
        } finally {
            em.close();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipoCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JRadioButton jrbntComidas;
    private javax.swing.JRadioButton jrbtnBebidas;
    private javax.swing.JRadioButton jrbtnPostres;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
