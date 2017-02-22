package com.leonardo.GYM.view;

import com.leonardo.GYM.dao.ArticuloDao;
import com.leonardo.GYM.dao.VentaDao;
import com.leonardo.GYM.model.ArticuloModel;
import com.leonardo.gym.model.ClienteModel;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class IU_Expendedora extends javax.swing.JFrame {

    private static int idArticulo;
    private static String nombreArticulo;

    private static final String siStock = "Este producto cuesta: ";
    private static final String noStock = "No queda stock de este producto.";

    private static boolean disponible = false;

    private static ArrayList<ArticuloModel> arrayArticulos;

    public IU_Expendedora() {
        initComponents();

        lblId.setText("");
        lblUsuario.setText("");
        lblNombre.setText("");

        cargarArrayArticulos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBoteProtes = new javax.swing.JButton();
        btnNukacola = new javax.swing.JButton();
        btnFanta = new javax.swing.JButton();
        btnAgua = new javax.swing.JButton();
        btnProhibido = new javax.swing.JButton();
        btnKingston = new javax.swing.JButton();
        btnCerveza = new javax.swing.JButton();
        btnMacdonal = new javax.swing.JButton();
        btnBurguer = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblString1 = new javax.swing.JLabel();
        lblString2 = new javax.swing.JLabel();
        lblString3 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Máquina Expendedora");

        btnBoteProtes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boteProtes70.jpg"))); // NOI18N
        btnBoteProtes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoteProtesActionPerformed(evt);
            }
        });

        btnNukacola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuka-cola70.png"))); // NOI18N
        btnNukacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNukacolaActionPerformed(evt);
            }
        });

        btnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fanta.png"))); // NOI18N
        btnFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFantaActionPerformed(evt);
            }
        });

        btnAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nestle.jpg"))); // NOI18N
        btnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAguaActionPerformed(evt);
            }
        });

        btnProhibido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barrita-energetica70.png"))); // NOI18N
        btnProhibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProhibidoActionPerformed(evt);
            }
        });

        btnKingston.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kigston.jpg"))); // NOI18N
        btnKingston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKingstonActionPerformed(evt);
            }
        });

        btnCerveza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerveza.jpg"))); // NOI18N
        btnCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCervezaActionPerformed(evt);
            }
        });

        btnMacdonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mcDonal.jpg"))); // NOI18N
        btnMacdonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMacdonalActionPerformed(evt);
            }
        });

        btnBurguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/burger.jpg"))); // NOI18N
        btnBurguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurguerActionPerformed(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.setEnabled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoExpendedora.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblString1.setText("¿Que desea comprar?");

        lblString2.setText("Ha elegido: producto.");

        lblString3.setText("Desea comprar / No queda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblString1)
                    .addComponent(lblString2)
                    .addComponent(lblString3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblString1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblString2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblString3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuario actual:");

        lblNombre.setText("Nombre, Apellidos");

        lblId.setText("1");

        jButton1.setText("Imprimir Informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnComprar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMacdonal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnBoteProtes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnProhibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnKingston, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNukacola, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(lblId))
                                    .addComponent(lblNombre)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnComprar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(lblId))
                        .addGap(9, 9, 9)
                        .addComponent(lblNombre))
                    .addComponent(btnCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNukacola, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProhibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKingston, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMacdonal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoteProtes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnCancelar))
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnComprar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArrayArticulos() {
        lblString2.setText("");
        lblString3.setText("");

        ArticuloDao art = new ArticuloDao();
        arrayArticulos = art.getArticulos();
        btnComprar.setEnabled(false);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void mostrar(int idArticulo) {
        nombreArticulo = arrayArticulos.get(idArticulo).getDescripcion();

        lblString2.setText("Ha elegido: " + nombreArticulo);

        if (arrayArticulos.get(idArticulo).getStock() == 0) {
            lblString3.setText(noStock);
            btnComprar.setEnabled(false);
        } else {
            lblString3.setText(siStock + arrayArticulos.get(idArticulo).getPvp() + " €");
            btnComprar.setEnabled(true);
            disponible = true;
        }
    }
    private void btnFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantaActionPerformed
        idArticulo = 2;
        mostrar(idArticulo);
    }//GEN-LAST:event_btnFantaActionPerformed

    private void btnNukacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNukacolaActionPerformed
        idArticulo = 1;
        mostrar(idArticulo);
    }//GEN-LAST:event_btnNukacolaActionPerformed

    private void btnCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCervezaActionPerformed
        idArticulo = 3;
        mostrar(idArticulo);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCervezaActionPerformed

    private void btnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaActionPerformed
        idArticulo = 4;
        mostrar(idArticulo);
    }//GEN-LAST:event_btnAguaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (lblId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce cliente antes de comprar.", "Cliente no introducido", JOptionPane.ERROR_MESSAGE);
        } else {
            VentaDao venta = new VentaDao();
            try {
                venta.setVenta(Integer.parseInt(lblId.getText()), idArticulo + 1);

                JOptionPane.showMessageDialog(this, "El cliente ha comprado: " + nombreArticulo, "¡Compra realizada!", 0);

            } catch (ParseException ex) {
                Logger.getLogger(IU_Expendedora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cargarArrayArticulos();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnProhibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProhibidoActionPerformed
        idArticulo = 5;
        mostrar(idArticulo);        // TODO add your handling code here:
    }//GEN-LAST:event_btnProhibidoActionPerformed

    private void btnKingstonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKingstonActionPerformed
        idArticulo = 6;
        mostrar(idArticulo);
    }//GEN-LAST:event_btnKingstonActionPerformed

    private void btnMacdonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMacdonalActionPerformed
        idArticulo = 7;
        mostrar(idArticulo);        // TODO add your handling code here:
    }//GEN-LAST:event_btnMacdonalActionPerformed

    private void btnBoteProtesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoteProtesActionPerformed
        idArticulo = 0;
        mostrar(idArticulo);            // TODO add your handling code here:
    }//GEN-LAST:event_btnBoteProtesActionPerformed

    private void btnBurguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurguerActionPerformed
        idArticulo = 8;
        mostrar(idArticulo);
        //mostrarStock(); // TODO add your handling code here:
    }//GEN-LAST:event_btnBurguerActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        JDialog pneBusqueda = new BusquedaPane(this, rootPaneCheckingEnabled, "maquina");
        //pneBusqueda.setVisible(true);
        pneBusqueda.show();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rutaPlantilla = "./src/main/java/com/leonardo/GYM/informes/InformeVentas.jrxml";

        Map parametros = new HashMap();

        JasperReport reporte;

        if (lblId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Busca un cliente antes de imprimir.", "Cliente no buscado", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");

                parametros.put("idCliente", Integer.parseInt(lblId.getText()));

                reporte = (JasperReport) JasperCompileManager.compileReport(rutaPlantilla);

                JasperPrint miInforme = JasperFillManager.fillReport(reporte, parametros, conexion);

                JasperViewer.viewReport(miInforme, false);

            } catch (ClassNotFoundException e) {
                System.out.print("Error driver");
            } catch (SQLException e) {
                System.out.print("Error sentencia SQL");
            } catch (JRException ex) {
                Logger.getLogger(IU_Accesos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void dispose() {
        super.dispose();
        if (menu == null) {
            menu = new MenuSeleccion();
            menu.setVisible(true);
        }
    }

    public void llenaDatos(ClienteModel cliente) {

        String idCliente = String.valueOf(cliente.getId_cliente());
        String nombreCli = cliente.getNombre();
        String apellidoCli = cliente.getApellidos();

        lblUsuario.setText("Usuario actual: ");
        lblId.setText(idCliente);
        lblNombre.setText(nombreCli + " " + apellidoCli);
        jButton1.setEnabled(disponible);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Expendedora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgua;
    private javax.swing.JButton btnBoteProtes;
    private javax.swing.JButton btnBurguer;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerveza;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnKingston;
    private javax.swing.JButton btnMacdonal;
    private javax.swing.JButton btnNukacola;
    private javax.swing.JButton btnProhibido;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblString1;
    private javax.swing.JLabel lblString2;
    private javax.swing.JLabel lblString3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
private MenuSeleccion menu;
}
