package com.leonardo.GYM.view;

import com.leonardo.GYM.dao.AccesosDao;
import com.leonardo.GYM.model.AccesoModel;
//import com.leonardo.GYM.model.ModeloTabla;
import com.leonardo.gym.model.ClienteModel;
import com.mysql.jdbc.Connection;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class IU_Accesos extends javax.swing.JFrame {

    private static boolean ultimos;
    File fichero = new File("./help_Accesos/help_set.hs");
    URL hsURL;
    HelpSet helpset;

    public IU_Accesos() {
        initComponents();
        ayuda();

        //lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("D:\\Proyectos\\Proyectos_NetBeans\\0.Proyectos_DI\\Gym_DAMMvn\\src\\main\\resources\\imagenes\\mrIncognito.jpg")));
        if (!lblId.getText().equals("")) {
            refrescaTabla();
        } else {
            refrescarUltimos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAcceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccesos = new javax.swing.JTable();
        imgFoto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        btnUltimos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Accesos");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Cliente: ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellidos: ");

        btnAcceso.setText("Nuevo Acceso");
        btnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoActionPerformed(evt);
            }
        });

        tblAccesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAccesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccesosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccesos);

        imgFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guy_Incognito.png"))); // NOI18N

        javax.swing.GroupLayout imgFotoLayout = new javax.swing.GroupLayout(imgFoto);
        imgFoto.setLayout(imgFotoLayout);
        imgFotoLayout.setHorizontalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imgFotoLayout.setVerticalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnBusqueda.setText("Busqueda Cliente");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText(" ");

        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidos.setText(" ");

        btnUltimos.setText("Ultimos Accesos");
        btnUltimos.setToolTipText("Refrescar utilmos accesos");
        btnUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoAcesos.png"))); // NOI18N

        btnInforme.setText("Imp. Informe");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda20.png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(85, 85, 85)
                        .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAcceso)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimos)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusqueda)
                        .addGap(18, 18, 18)
                        .addComponent(btnInforme)
                        .addGap(34, 34, 34)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblApellidos, lblId, lblNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addGap(15, 15, 15)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApellidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addComponent(imgFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAcceso)
                        .addComponent(btnBusqueda)
                        .addComponent(btnUltimos)
                        .addComponent(btnInforme)))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblApellidos, lblId, lblNombre});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose() {
        super.dispose();
        if (menu == null) {
            menu = new MenuSeleccion();
            menu.setVisible(true);
        }
//To change body of generated methods, choose Tools | Templates.
    }

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        JDialog pneBusqueda = new BusquedaPane(this, rootPaneCheckingEnabled, "accesos");
        //pneBusqueda.setVisible(true);
        pneBusqueda.show();
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoActionPerformed
        /*Abre DIALOGO de AÑADIR ACCESO*/
 /*
        if (dlgNewAccess == null)
        dlgNewAccess = new NuevoAcceso(this, true);
        dlgNewAccess.setVisible(true);
         */
        //Cogiendo el ID del cliente, del acceso seleccionado.

        //int idClienteTab = Integer.parseInt(tblAccesos.getValueAt(tblAccesos.getSelectedRow(), 3).toString());
        if (lblId.getText() == "") {
            JOptionPane.showMessageDialog(this,
                    "Tienes que buscar un cliente antes de añadir un acceso.",
                    "Cliente no seleccionado",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                AccesosDao accesoPrueba = new AccesosDao();

                String cliente = lblId.getText();
                accesoPrueba.insertarAcceso(Integer.valueOf(cliente));

            } catch (ParseException ex) {
                Logger.getLogger(NuevoAcceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            refrescaTabla();
        }

    }//GEN-LAST:event_btnAccesoActionPerformed

    private void btnUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosActionPerformed
        refrescarUltimos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimosActionPerformed

    private void tblAccesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccesosMouseClicked

        if (ultimos) {
            int filaSeleccionada = tblAccesos.getSelectedRow();

            String idCliTabla = (String) tblAccesos.getModel().getValueAt(filaSeleccionada, 3);
            String nombreCliTabla = (String) tblAccesos.getModel().getValueAt(filaSeleccionada, 4);
            String apellidoCliTabla = (String) tblAccesos.getModel().getValueAt(filaSeleccionada, 5);

            lblId.setText(idCliTabla);
            lblNombre.setText(nombreCliTabla);
            lblApellidos.setText(apellidoCliTabla);
        }
    }//GEN-LAST:event_tblAccesosMouseClicked

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        String rutaPlantilla = "./src/main/java/com/leonardo/GYM/informes/AccesosCliente.jrxml";

        Map parametros = new HashMap();

        JasperReport reporte;
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
    }//GEN-LAST:event_btnInformeActionPerformed
    public void ayuda() {

        try {
            hsURL = fichero.toURI().toURL();

            try {
                // Crea el HelpSet y el HelpBroker
                helpset = new HelpSet(getClass().getClassLoader(), hsURL);
                HelpBroker hb = helpset.createHelpBroker();
                // Pone ayuda al botón y a F1 en la ventana.
                hb.enableHelpOnButton(btnAyuda, "aplicacion", helpset);
                //F1
                hb.enableHelpKey(this.getContentPane(), "aplicacion", helpset);

            } catch (HelpSetException ex) {
                Logger.getLogger(IU_Accesos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(IU_Accesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed


    }//GEN-LAST:event_btnAyudaActionPerformed

    public void llenaDatos(ClienteModel cliente) {
        System.out.println(cliente.getId_cliente());

        String idCliente = String.valueOf(cliente.getId_cliente());
        String nombreCli = cliente.getNombre();
        String apellidoCli = cliente.getApellidos();

        lblId.setText(idCliente);
        lblNombre.setText(nombreCli);
        lblApellidos.setText(apellidoCli);
    }

    public void refrescaTabla() {
        ultimos = false;
        ModeloTabla mlt = new ModeloTabla();
        mlt.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha"});
        TableRowSorter sorter = new TableRowSorter(mlt);
        tblAccesos.setModel(mlt);

        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getAccesosCliente(Integer.parseInt(lblId.getText()));

        for (AccesoModel accesoIt : arrayAccesos) {
            mlt.addRow(accesoIt.toArrayStringClientes());
        }
        //tblAccesos.setModel(dtm);
    }

    private void refrescarUltimos() {
        ultimos = true;
        ModeloTabla mlt = new ModeloTabla();
        mlt.setColumnIdentifiers(new String[]{
            "ID_Acceso",
            "Tipo",
            "Fecha",
            "ID_Cliente",
            "Nombre",
            "Apellidos"});
        TableRowSorter sorter = new TableRowSorter(mlt);

        tblAccesos.setModel(mlt);

        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getUltimosAccesos();

        for (AccesoModel accesoIt : arrayAccesos) {
            mlt.addRow(accesoIt.toArrayStringUltimos());
        }
        //tblAccesos.setEnabled(false);
        lblId.setText("");
        lblNombre.setText("");
        lblApellidos.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Accesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceso;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnUltimos;
    private javax.swing.JPanel imgFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblAccesos;
    // End of variables declaration//GEN-END:variables
    private NuevoAcceso dlgNewAccess;
    private MenuSeleccion menu;
}


/*Clase para poder hacer NO EDITABLE las COLUMNAS de un JTable.*/
class ModeloTabla extends DefaultTableModel {

    public boolean isCellEditable(int row, int column) {
        // Aquí devolvemos true o false según queramos que una celda identificada por fila,columna (row,column), sea o no editable
        /*if (column == 3)
          return true;*/
        return false;
    }
}
