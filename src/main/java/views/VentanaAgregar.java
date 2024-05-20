/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import models.Productos;
import models.Tipoproducto;

/**
 *
 * @author clara
 */
public class VentanaAgregar extends javax.swing.JDialog {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");
    

    /**
     * Creates new form VentanaAgregar
     */
    public VentanaAgregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTiposProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1TipoComida = new javax.swing.ButtonGroup();
        buttonGroup2TipoIVA = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelIDProducto = new javax.swing.JLabel();
        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelPrecioProducto = new javax.swing.JLabel();
        jLabelTipoIVA = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelTipoProducto = new javax.swing.JLabel();
        jtfIDProducto = new javax.swing.JTextField();
        jtfNombreProducto = new javax.swing.JTextField();
        jtfPrecioProducto = new javax.swing.JTextField();
        jrbTipoIVA10 = new javax.swing.JRadioButton();
        jrbTipoIVA21 = new javax.swing.JRadioButton();
        jSpinnerStock = new javax.swing.JSpinner();
        jBtnGuardar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jCheckBoxComidas = new javax.swing.JCheckBox();
        jCheckBoxBebidas = new javax.swing.JCheckBox();
        jCheckBoxPostres = new javax.swing.JCheckBox();
        jComboBoxComidas = new javax.swing.JComboBox<>();
        jComboBoxBebidas = new javax.swing.JComboBox<>();
        jComboBoxPostres = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wok & Roll - Agregar producto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabelIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIDProducto.setText("ID producto: ");

        jLabelNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreProducto.setText("Nombre:");

        jLabelPrecioProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioProducto.setText("Precio sin IVA:");

        jLabelTipoIVA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoIVA.setText("Tipo de IVA:");

        jLabelStock.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStock.setText("Stock:");

        jLabelTipoProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoProducto.setText("Tipo de producto:");

        jtfIDProducto.setEditable(false);
        jtfIDProducto.setBackground(new java.awt.Color(204, 204, 204));
        jtfIDProducto.setToolTipText("ID del producto");

        jtfNombreProducto.setBackground(new java.awt.Color(51, 51, 51));
        jtfNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        jtfNombreProducto.setToolTipText("Introduce el nombre del producto");

        jtfPrecioProducto.setBackground(new java.awt.Color(51, 51, 51));
        jtfPrecioProducto.setForeground(new java.awt.Color(255, 255, 255));
        jtfPrecioProducto.setToolTipText("Introduce el precio del producto");

        jrbTipoIVA10.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2TipoIVA.add(jrbTipoIVA10);
        jrbTipoIVA10.setForeground(new java.awt.Color(255, 255, 255));
        jrbTipoIVA10.setSelected(true);
        jrbTipoIVA10.setText("10%");

        jrbTipoIVA21.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2TipoIVA.add(jrbTipoIVA21);
        jrbTipoIVA21.setForeground(new java.awt.Color(255, 255, 255));
        jrbTipoIVA21.setText("21%");

        jBtnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBtnGuardar.setText("GUARDAR");
        jBtnGuardar.setToolTipText("Guardar cambios");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnVolver.setBackground(new java.awt.Color(204, 255, 204));
        jBtnVolver.setForeground(new java.awt.Color(0, 0, 0));
        jBtnVolver.setText("VOLVER");
        jBtnVolver.setToolTipText("Volver a la pantalla anterior");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jCheckBoxComidas.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1TipoComida.add(jCheckBoxComidas);
        jCheckBoxComidas.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxComidas.setText("COMIDAS:");
        jCheckBoxComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxComidasActionPerformed(evt);
            }
        });

        jCheckBoxBebidas.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1TipoComida.add(jCheckBoxBebidas);
        jCheckBoxBebidas.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxBebidas.setText("BEBIDAS:");
        jCheckBoxBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBebidasActionPerformed(evt);
            }
        });

        jCheckBoxPostres.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1TipoComida.add(jCheckBoxPostres);
        jCheckBoxPostres.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPostres.setText("POSTRES:");
        jCheckBoxPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPostresActionPerformed(evt);
            }
        });

        jComboBoxComidas.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxComidas.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxComidas.setToolTipText("Selecciona el tipo de comida");

        jComboBoxBebidas.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxBebidas.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxBebidas.setToolTipText("Selecciona el tipo de bebida");

        jComboBoxPostres.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxPostres.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPostres.setToolTipText("Selecciona el tipo de postre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxPostres)
                            .addComponent(jCheckBoxBebidas)
                            .addComponent(jCheckBoxComidas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPostres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxBebidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxComidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTipoProducto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelStock)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerStock, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTipoIVA)
                                .addGap(18, 18, 18)
                                .addComponent(jrbTipoIVA10)
                                .addGap(18, 18, 18)
                                .addComponent(jrbTipoIVA21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPrecioProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPrecioProducto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombreProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNombreProducto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIDProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jtfIDProducto)))))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnVolver))
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelIDProducto, jLabelNombreProducto, jLabelPrecioProducto, jLabelStock, jLabelTipoIVA, jLabelTipoProducto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnGuardar, jBtnVolver});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBoxBebidas, jCheckBoxComidas, jCheckBoxPostres});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDProducto)
                    .addComponent(jtfIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTipoProducto)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxComidas)
                    .addComponent(jComboBoxComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxBebidas)
                    .addComponent(jComboBoxBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPostres)
                    .addComponent(jComboBoxPostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jBtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreProducto)
                    .addComponent(jtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecioProducto)
                            .addComponent(jtfPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jBtnVolver)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoIVA)
                    .addComponent(jrbTipoIVA10)
                    .addComponent(jrbTipoIVA21))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStock)
                    .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = jtfNombreProducto.getText().trim();
        String precioStr = jtfPrecioProducto.getText().trim();
         String tipoIVA = jrbTipoIVA10.isSelected() ? "IVA_DIEZ" : "IVA_VEINTIUNO";
        Integer stock = (Integer) jSpinnerStock.getValue();

        if (nombre.isEmpty() || precioStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor, completa todos los campos obligatorios.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (stock <= 0) {
            JOptionPane.showMessageDialog(this, 
                    "El stock debe ser mayor que 0.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        BigDecimal precio;
        try {
            precio = new BigDecimal(precioStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor, introduce un precio válido.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nomTipoProducto = null;

        if (jCheckBoxComidas.isSelected() && jComboBoxComidas.getSelectedItem() != null) {
            nomTipoProducto = (String) jComboBoxComidas.getSelectedItem();
        } else if (jCheckBoxBebidas.isSelected() && jComboBoxBebidas.getSelectedItem() != null) {
            nomTipoProducto = (String) jComboBoxBebidas.getSelectedItem();
        } else if (jCheckBoxPostres.isSelected() && jComboBoxPostres.getSelectedItem() != null) {
            nomTipoProducto = (String) jComboBoxPostres.getSelectedItem();
        }

        if (nomTipoProducto == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            TypedQuery<Tipoproducto> query = em.createNamedQuery("Tipoproducto.findByNomTipoProducto", Tipoproducto.class);
            query.setParameter("nomTipoProducto", nomTipoProducto);
            Tipoproducto tipoProducto = query.getSingleResult();

            Productos producto = new Productos();
            producto.setNombre(nombre);
            producto.setPrecioSinIVA(precio);
            producto.setTipoIVA(tipoIVA);
            producto.setStock(stock);
            producto.setIdTipoProducto(tipoProducto);

            em.persist(producto);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Producto guardado exitosamente.");
            this.dispose();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error al guardar el producto: " + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }

    }//GEN-LAST:event_jBtnGuardarActionPerformed

    //método para cargar las distintas subcateogrías
    private void cargarTiposProducto() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<String> queryComidas = em.createQuery("SELECT t.nomTipoProducto FROM Tipoproducto t WHERE t.nomCategoria = 'COMIDAS'", String.class);
            List<String> tiposComidas = queryComidas.getResultList();
            for (String tipo : tiposComidas) {
                jComboBoxComidas.addItem(tipo);
            }

            TypedQuery<String> queryBebidas = em.createQuery("SELECT t.nomTipoProducto FROM Tipoproducto t WHERE t.nomCategoria = 'BEBIDAS'", String.class);
            List<String> tiposBebidas = queryBebidas.getResultList();
            for (String tipo : tiposBebidas) {
                jComboBoxBebidas.addItem(tipo);
            }

            TypedQuery<String> queryPostres = em.createQuery("SELECT t.nomTipoProducto FROM Tipoproducto t WHERE t.nomCategoria = 'POSTRES'", String.class);
            List<String> tiposPostres = queryPostres.getResultList();
            for (String tipo : tiposPostres) {
                jComboBoxPostres.addItem(tipo);
            }
        } finally {
            em.close();
        }
    }


    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jCheckBoxComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxComidasActionPerformed
        // TODO add your handling code here:
        jComboBoxComidas.setEnabled(jCheckBoxComidas.isSelected());
        jComboBoxBebidas.setEnabled(false);
        jComboBoxPostres.setEnabled(false);
        jCheckBoxBebidas.setSelected(false);
        jCheckBoxPostres.setSelected(false);
    }//GEN-LAST:event_jCheckBoxComidasActionPerformed

    private void jCheckBoxBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBebidasActionPerformed
        // TODO add your handling code here:
        jComboBoxBebidas.setEnabled(jCheckBoxBebidas.isSelected());
        jComboBoxComidas.setEnabled(false);
        jComboBoxPostres.setEnabled(false);
        jCheckBoxComidas.setSelected(false);
        jCheckBoxPostres.setSelected(false);
    }//GEN-LAST:event_jCheckBoxBebidasActionPerformed

    private void jCheckBoxPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPostresActionPerformed
        // TODO add your handling code here:
        jComboBoxPostres.setEnabled(jCheckBoxPostres.isSelected());
        jComboBoxComidas.setEnabled(false);
        jComboBoxBebidas.setEnabled(false);
        jCheckBoxComidas.setSelected(false);
        jCheckBoxBebidas.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPostresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1TipoComida;
    private javax.swing.ButtonGroup buttonGroup2TipoIVA;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JCheckBox jCheckBoxBebidas;
    private javax.swing.JCheckBox jCheckBoxComidas;
    private javax.swing.JCheckBox jCheckBoxPostres;
    private javax.swing.JComboBox<String> jComboBoxBebidas;
    private javax.swing.JComboBox<String> jComboBoxComidas;
    private javax.swing.JComboBox<String> jComboBoxPostres;
    private javax.swing.JLabel jLabelIDProducto;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JLabel jLabelPrecioProducto;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTipoIVA;
    private javax.swing.JLabel jLabelTipoProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JRadioButton jrbTipoIVA10;
    private javax.swing.JRadioButton jrbTipoIVA21;
    private javax.swing.JTextField jtfIDProducto;
    private javax.swing.JTextField jtfNombreProducto;
    private javax.swing.JTextField jtfPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
