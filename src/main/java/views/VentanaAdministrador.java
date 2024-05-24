/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package views;

import controllers.ProductosJpaController;
import daw.Metodos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import models.ModeloTablaProductos;
import models.Productos;

/**
 *
 * @author clara
 */
public class VentanaAdministrador extends java.awt.Dialog {

    /**
     * Creates new form VentanaAdministrador
     */
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");
    private static final ProductosJpaController pjc = new ProductosJpaController(emf);
    private PanelPrincipal panelMain;

    public VentanaAdministrador(PanelPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatosJTable();
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
        jBtnAgregar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBtnSubcategorias = new javax.swing.JButton();

        setResizable(false);
        setTitle("Wok & Roll - Gestionar productos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jBtnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAgregar.setText("AGREGAR");
        jBtnAgregar.setToolTipText("Agregar un producto nuevo");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnVolver.setBackground(new java.awt.Color(204, 255, 204));
        jBtnVolver.setForeground(new java.awt.Color(0, 0, 0));
        jBtnVolver.setText("VOLVER");
        jBtnVolver.setToolTipText("Volver al menú principal");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnModificar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        jBtnModificar.setText("MODIFICAR");
        jBtnModificar.setToolTipText("Modificar el producto seleccionado");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnBorrar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jBtnBorrar.setText("BORRAR");
        jBtnBorrar.setToolTipText("Borrar el producto seleccionado");
        jBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos:");

        jBtnSubcategorias.setBackground(new java.awt.Color(204, 255, 204));
        jBtnSubcategorias.setForeground(new java.awt.Color(0, 0, 0));
        jBtnSubcategorias.setText("SUBCATEGORÍAS");
        jBtnSubcategorias.setToolTipText("Accede a la sección de las categorías");
        jBtnSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubcategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jBtnSubcategorias)))
                    .addComponent(jLabel1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnAgregar, jBtnBorrar, jBtnModificar, jBtnSubcategorias, jBtnVolver});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnVolver)
                        .addGap(135, 135, 135)
                        .addComponent(jBtnSubcategorias))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningún registro");
        } else {
            //modificamos el producto seleccionado
            //primero obtenemos el id del producto seleccionado
            int selectedRow = jTable1.getSelectedRow();
            Integer idProducto = (Integer) jTable1.getValueAt(selectedRow, 0);
            EntityManager em = emf.createEntityManager();
            try {
                //verificamos si el producto está o no en un ticket
                boolean productoEnTicket = em.createQuery("SELECT COUNT(d) FROM Detalletickets d WHERE d.detalleticketsPK.idProducto = :idProducto", Long.class)
                        .setParameter("idProducto", idProducto)
                        .getSingleResult() > 0;
                //si está no se borra
                if (productoEnTicket) {
                    JOptionPane.showMessageDialog(null, "El producto no puede ser modificado porque está presente en un ticket.");
                } else {
                new VentanaModificar(panelMain, true, idProducto).setVisible(true);
//                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente.");
                }
                // Una vez termine la ejecución de la ventana
                // Llamo a cargar de nuevo los datos en el jTable con los cambios
                cargarDatosJTable();
            } catch (Exception e) {
                e.printStackTrace();
                
            } finally {
                em.close();
                //si lo cerramos peta
//                emf.close();
            }
        }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        new VentanaAgregar(panelMain, true).setVisible(true);
        // Una vez termine la ejecución de la ventana Agregar
        // Llamo a cargar de nuevo los datos en el jTable con los cambios
        cargarDatosJTable();

    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningún registro");
        } else {
            //borramos el producto seleccionado
            //primero obtenemos el id del producto seleccionado
            int selectedRow = jTable1.getSelectedRow();
            Integer idProducto = (Integer) jTable1.getValueAt(selectedRow, 0);

            EntityManager em = emf.createEntityManager();
            try {
                //verificamos si el producto está o no en un ticket
                boolean productoEnTicket = em.createQuery("SELECT COUNT(d) FROM Detalletickets d WHERE d.detalleticketsPK.idProducto = :idProducto", Long.class)
                        .setParameter("idProducto", idProducto)
                        .getSingleResult() > 0;
                //si está no se borra
                if (productoEnTicket) {
                    JOptionPane.showMessageDialog(null, "El producto no puede ser borrado porque está presente en un ticket.");
                } else {
                    //sino está lo eliminamos
                    em.getTransaction().begin();
                    Productos producto = pjc.findProductos(idProducto);
                    if (producto != null) {
                       pjc.destroy(idProducto);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Producto borrado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto seleccionado no existe.");
                    }
                    // Una vez termine la ejecución
                    // Llamo a cargar de nuevo los datos en el jTable con los cambios
                    cargarDatosJTable();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar borrar el producto.");
            } finally {
                em.close();
                //si lo cerramos peta
//                emf.close();
            }

        }
    }//GEN-LAST:event_jBtnBorrarActionPerformed

    private void jBtnSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubcategoriasActionPerformed
        // TODO add your handling code here:
        new VentanaAdministrarCategorias(panelMain, true).setVisible(true);
    }//GEN-LAST:event_jBtnSubcategoriasActionPerformed

    // Este método inserta los datos de la lista en el jtable
    private void cargarDatosJTable() {

        // Se crea el modelo de datos que contendrá el JTable
        // Este modelo se rellena de datos y luego se asocia al JTable
        ModeloTablaProductos modelo = new ModeloTablaProductos();

        // Array de object con el número de columnas del jtable
        // Para guardar cada campo de cada Persona de la lista
        Object[] fila = new Object[modelo.getColumnCount()];

        //obtenemos los datos de la base de datos
        EntityManager em = emf.createEntityManager();

        try {
            List<Productos> productosList = em.createNamedQuery("Productos.findAll", Productos.class
            ).getResultList();

            // Depuración: verificar si se obtuvieron productos
            if (productosList.isEmpty()) {
                System.out.println("No se encontraron productos en la base de datos.");
            } else {
                System.out.println("Número de productos encontrados: " + productosList.size());
            }

            // Añadir los datos al modelo de la tabla
            for (Productos producto : productosList) {
                fila[0] = producto.getIdProducto();
                fila[1] = producto.getNombre();
                fila[2] = producto.getPrecioSinIVA();
                fila[3] = Metodos.formateoIVA(producto.getTipoIVA());
                fila[4] = producto.getStock();
                //mostramos el nombre del tipoProducto no un número feo
                fila[5] = producto.getIdTipoProducto() != null ? producto.getIdTipoProducto().getNomTipoProducto() : null;

                modelo.addRow(fila);
            }
        } catch (Exception e) {
            // Depuración: imprimir la pila de errores si ocurre una excepción
            e.printStackTrace();
        } finally {
            em.close();
            //si lo cerramos peta
//            emf.close();
        }

        // Decimos al JTable el modelo a usar
        jTable1.setModel(modelo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnBorrar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnSubcategorias;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
