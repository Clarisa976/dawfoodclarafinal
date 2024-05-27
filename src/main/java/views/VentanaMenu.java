/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import daw.Metodos;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import models.ModeloTablaProductosFiltrada;
import models.Productos;

/**
 *
 * @author clara
 */
public class VentanaMenu extends javax.swing.JDialog {

    /**
     * Creates new form VentanaMenu
     */
    private PanelPrincipal panelMain;

    public VentanaMenu(PanelPrincipal parent, boolean modal) {
        super(parent, modal);
        this.panelMain = parent;
        initComponents();
        cargarTablas();
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
        jTabbedMenu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableComidas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBebidas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePostres = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jBtnAgregarCarrito = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnVerCarrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wok & Roll - Menú");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedMenu.setForeground(new java.awt.Color(255, 255, 255));

        jTableComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableComidas);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la comida:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedMenu.addTab("COMIDAS", jPanel2);

        jTableBebidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableBebidas);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione la bebida:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedMenu.addTab("BEBIDAS", jPanel3);

        jTablePostres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePostres);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione el postre:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedMenu.addTab("POSTRES", jPanel4);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione la cantidad:");

        jBtnAgregarCarrito.setBackground(new java.awt.Color(204, 255, 204));
        jBtnAgregarCarrito.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAgregarCarrito.setText("AGREGAR AL CARRITO");
        jBtnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarCarritoActionPerformed(evt);
            }
        });

        jBtnVolver.setBackground(new java.awt.Color(204, 255, 204));
        jBtnVolver.setForeground(new java.awt.Color(0, 0, 0));
        jBtnVolver.setText("VOLVER");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnVerCarrito.setBackground(new java.awt.Color(51, 51, 51));
        jBtnVerCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito2.png"))); // NOI18N
        jBtnVerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnVolver))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jBtnVerCarrito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAgregarCarrito))))
                    .addComponent(jTabbedMenu))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnAgregarCarrito, jBtnVolver});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnVerCarrito, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jBtnAgregarCarrito)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(jBtnVolver)
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarCarritoActionPerformed
        // TODO add your handling code here:
        //para agregar al carrito primero tiene que tener un producto seleccionado
        //luego tiene que tener una cantidad superior a 0

        //primero tenemos que saber que tab esta seleccionada
        int tabSeleccionada = jTabbedMenu.getSelectedIndex();
        JTable tablaSeleccionada = null;

        switch (tabSeleccionada) {
            case 0:
                tablaSeleccionada = jTableComidas;
                break;
            case 1:
                tablaSeleccionada = jTableBebidas;
                break;
            case 2:
                tablaSeleccionada = jTablePostres;
                break;
            default:
                break;
        }

        //luego comprobamos que haya una fila seleccionada y que la cantidad
        //del jspinner sea mayor a 0
        if (tablaSeleccionada != null && tablaSeleccionada.getSelectedRowCount() == 1) {
            int cantidad = (Integer) jSpinnerCantidad.getValue();
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0.");
            } else {
                int selectedRow = tablaSeleccionada.getSelectedRow();
                String nombreProducto = (String) tablaSeleccionada.getValueAt(selectedRow, 0);
                BigDecimal precioConIVA = (BigDecimal) tablaSeleccionada.getValueAt(selectedRow, 4);

                //lo pasamos a string
                String precioConIVAStr = String.format("%.2f", precioConIVA.multiply(new BigDecimal(cantidad)));

                //llamamos al jdialog del carrito y agrergamos el string anterior
                VentanaCarrito.agregarProducto(nombreProducto,precioConIVA,cantidad);
                cargarTablas();
                
                //después de agregar un producto al carrito reseteamos el jspinner
                jSpinnerCantidad.setValue(0);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningún producto.");
        }

    }//GEN-LAST:event_jBtnAgregarCarritoActionPerformed

    private void jBtnVerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerCarritoActionPerformed
        // TODO add your handling code here:
        
        new VentanaCarrito(panelMain, true).setVisible(true);
        cargarTablas();
    }//GEN-LAST:event_jBtnVerCarritoActionPerformed

    //método para cargar los datos en la tabla modificado para que se pueda
    //filtrar según la categoría y permitiendonos pasarle una tabla
    //donde queremos que vayan esos datos
    private void cargarDatosJTable(String categoria, JTable tabla) {

        // Se crea el modelo de datos que contendrá el JTable
        // Este modelo se rellena de datos y luego se asocia al JTable
        ModeloTablaProductosFiltrada modelo = new ModeloTablaProductosFiltrada();

        // Array de object con el número de columnas del jtable
        // Para guardar cada campo de cada Persona de la lista
        Object[] fila = new Object[modelo.getColumnCount()];

        //obtenemos los datos de la base de datos
        EntityManager em = panelMain.emf.createEntityManager();

        try {
            //creamos la lista de productos buscando con una query que hemos creado
            //para que pueda filtrar por categoría
            List<Productos> productosList = em.createNamedQuery("Productos.findByCategoria", Productos.class)
                    .setParameter("nomCategoria", categoria)
                    .getResultList();


            for (Productos producto : productosList) {
                fila[0] = producto.getNombre();
                //añadimos el nombre del tipo de producto
                fila[1] = producto.getIdTipoProducto() != null ? producto.getIdTipoProducto().getNomTipoProducto() : null;
                fila[2] = producto.getPrecioSinIVA();
                fila[3] = Metodos.formateoIVA(producto.getTipoIVA());
                fila[4] = Metodos.calcularPrecioConIVA(producto.getPrecioSinIVA(), producto.getTipoIVA());
                fila[5] = producto.getStock();

                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();

        }

        tabla.setModel(modelo);
    }

    //con este método cargaremos las tablas filtrando el tipo de la categoria y 
    //en que tabla iría
    private void cargarTablas() {
        cargarDatosJTable("COMIDAS", jTableComidas);
        cargarDatosJTable("BEBIDAS", jTableBebidas);
        cargarDatosJTable("POSTRES", jTablePostres);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarCarrito;
    private javax.swing.JButton jBtnVerCarrito;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTabbedPane jTabbedMenu;
    private javax.swing.JTable jTableBebidas;
    private javax.swing.JTable jTableComidas;
    private javax.swing.JTable jTablePostres;
    // End of variables declaration//GEN-END:variables
}
