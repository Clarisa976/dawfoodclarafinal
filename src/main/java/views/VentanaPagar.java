/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package views;

import controllers.DetalleticketsJpaController;
import controllers.ProductosJpaController;
import controllers.TicketsJpaController;
import controllers.TpvJpaController;
import daw.Metodos;
import daw.Tarjeta;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import models.Detalletickets;
import models.DetalleticketsPK;
import models.Productos;
import models.Tickets;

/**
 *
 * @author clara
 */
public class VentanaPagar extends java.awt.Dialog {

    /**
     * Creates new form VentanaPagar
     */
    private PanelPrincipal panelMain;
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");
    private static final TicketsJpaController tjc = new TicketsJpaController(emf);
    private static final DetalleticketsJpaController dtjc = new DetalleticketsJpaController(emf);
    private static final ProductosJpaController pjc = new ProductosJpaController(emf);
    private static final TpvJpaController tpvjc = new TpvJpaController(emf);
    private static final HashMap<String, Integer> productosCarrito = VentanaCarrito.getProductosCarrito();

    public VentanaPagar(PanelPrincipal parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNumeroTarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbMes = new javax.swing.JComboBox<>();
        jcbAnio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCVV = new javax.swing.JTextField();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPagar = new javax.swing.JButton();

        setResizable(false);
        setTitle("Wok & Roll - Plataforma de pago");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo2.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Introduce los últimos cuatro números de tu tarjeta*:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credit-card-alt-regular-24.png"))); // NOI18N

        jtfNumeroTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        jtfNumeroTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        jtfNumeroTarjeta.setToolTipText("Introduce los cuatro últimos dígitos de tu tarjeta");
        jtfNumeroTarjeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 1, true));
        jtfNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroTarjetaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Caducidad*:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-regular-24.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("/");

        jcbMes.setBackground(new java.awt.Color(255, 255, 255));
        jcbMes.setForeground(new java.awt.Color(0, 0, 0));
        jcbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4","5","6","7","8","9","10","11","12" }));
        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });

        jcbAnio.setBackground(new java.awt.Color(255, 255, 255));
        jcbAnio.setForeground(new java.awt.Color(0, 0, 0));
        jcbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jcbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAnioActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Código de seguridad*:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock-alt-solid-24.png"))); // NOI18N

        jtfCVV.setBackground(new java.awt.Color(255, 255, 255));
        jtfCVV.setForeground(new java.awt.Color(0, 0, 0));
        jtfCVV.setToolTipText("Introduce el CVV");
        jtfCVV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 1, true));
        jtfCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCVVActionPerformed(evt);
            }
        });

        jBtnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jBtnCancelar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.setToolTipText("Cancela la operación");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPagar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnPagar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBtnPagar.setForeground(new java.awt.Color(0, 0, 0));
        jBtnPagar.setText("PAGAR");
        jBtnPagar.setToolTipText("Realizar pago");
        jBtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnPagar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCVV))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCancelar, jBtnPagar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNumeroTarjeta))
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtfCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPagar))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtfCVV, jtfNumeroTarjeta});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPagarActionPerformed
        // TODO add your handling code here:

        //Comprobamos que los cuatro dígitos introducidos, la fecha y el cvv
        //coinciden con uno de los que tenemos regristrados para simular una
        //pasarela de pago
        //obtenemos los datos introducidos en la ventana
        String numeroTarjeta = jtfNumeroTarjeta.getText();
        String cvv = jtfCVV.getText();
        int mes = Integer.parseInt((String) jcbMes.getSelectedItem());
        int anio = Integer.parseInt((String) jcbAnio.getSelectedItem());
        LocalDate fechaCaducidad = LocalDate.of(anio, mes, 1);
        //comprobamos si coincide o no
        Tarjeta tarjeta = buscarTarjeta(numeroTarjeta, fechaCaducidad, cvv);

        if (tarjeta != null) {
            // Si la tarjeta es válida, procedemos con la compra
            try {
                realizarCompra();
                JOptionPane.showMessageDialog(this, "Compra realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Datos de tarjeta incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBtnPagarActionPerformed

    //método para buscar la tarjeta en la lista de tarjetas que tenemos para probar
    private Tarjeta buscarTarjeta(String numero, LocalDate fechaCaducidad, String cvv) {
        List<Tarjeta> tarjetasRegistradas = Tarjeta.tarjetasRegistradasBD();
        for (Tarjeta tarjeta : tarjetasRegistradas) {
            if (tarjeta.getNumeroTarjeta().endsWith(numero)
                    && tarjeta.getFechaCaducidadTarjeta().equals(fechaCaducidad)
                    && tarjeta.getCvv().equals(cvv)) {
                return tarjeta;
            }
        }
        return null; //tarjeta no encontrada
    }

    //método para realizar la compra
    private void realizarCompra(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            //creamos un nuevo Ticket
            Tickets ticket = new Tickets();
            ticket.setFechaOperacion(new Date());
            ticket.setHoraOperacion(new Date());
            ticket.setNumeroPedido(new Random().nextInt(1, 10000));
            ticket.setCodTransaccion("TRANS" + new Random().nextInt(1, 999));
            ticket.setIdTpv(tpvjc.findTpv(1));
            BigDecimal importeTotal = BigDecimal.ZERO;//no funciona si ponemos 0

            //verificamos el stock del producto elegido en el carrito
            //creamos un array  donde se guardarán los detalles de la compra
            List<Detalletickets> detalles = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : productosCarrito.entrySet()) {
                String nombreProducto = entry.getKey().split(" - ")[0];
                int cantidad = entry.getValue();

                //namequery para buscar los productos por el nombre
                Productos producto = Metodos.findProductoByName(nombreProducto);
                //si no hay stock suficiente salta la excepción
                if (producto.getStock() < cantidad) {
                    throw new Exception("No hay suficiente stock para el producto: " + nombreProducto);
                }

                //calculamos cuanto sería el importe total y lo añadimos al ticket
                importeTotal = importeTotal.add(producto.getPrecioSinIVA().multiply(new BigDecimal(cantidad)));
            }

            //hacemos el set del importe total
            ticket.setImporteTotal(calcularTotalCarrito());
            //creamos el ticket
            tjc.create(ticket);

            //volvemos a recorrer el map del carrito y creamos el detalle ticket
            //sino insistimos en esto no funciona
            for (Map.Entry<String, Integer> entry : productosCarrito.entrySet()) {
                String nombreProducto = entry.getKey().split(" - ")[0];
                int cantidad = entry.getValue();

                Productos producto = Metodos.findProductoByName(nombreProducto);

                //creamos el detalleticket asignandole la pk
                DetalleticketsPK pk = new DetalleticketsPK(ticket.getIdTicket(), producto.getIdProducto());
                Detalletickets detalle = new Detalletickets(pk);
                //lo vamos añadiendo a la lista de detalleticket
                detalle.setCantidadProducto(cantidad);
                detalle.setProductos(producto);
                detalle.setTickets(ticket);

                //actualizamos el stock del producto stock del producto
                producto.setStock(producto.getStock() - cantidad);
                //editamos el producto
                pjc.edit(producto);

                //creamos el detalleticket con el jpa de detalleticket
                dtjc.create(detalle);
            }

            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();

        } finally {
            em.close();
        }
    }

    //método en el que cogemos el total del carrito y lo calculamos
    private BigDecimal calcularTotalCarrito() {
        BigDecimal total = BigDecimal.ZERO;
        HashMap<String, Integer> productosCarrito = VentanaCarrito.getProductosCarrito();

        for (String claveProducto : productosCarrito.keySet()) {
            String[] partes = claveProducto.split(" - Precio unitario: ");
            String precioStr = partes[1].trim();

            //remplazamos las coma por punto para que no pete
            precioStr = precioStr.replace(",", ".");

            BigDecimal precio = new BigDecimal(precioStr);
            int cantidad = productosCarrito.get(claveProducto);
            total = total.add(precio.multiply(new BigDecimal(cantidad)));
        }
        return total.setScale(2, RoundingMode.HALF_UP);

    }


    private void jtfNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroTarjetaActionPerformed

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMesActionPerformed

    private void jcbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAnioActionPerformed

    private void jtfCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCVVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbAnio;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JTextField jtfCVV;
    private javax.swing.JTextField jtfNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
