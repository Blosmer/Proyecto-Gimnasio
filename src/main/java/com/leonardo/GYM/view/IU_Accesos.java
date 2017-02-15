package com.leonardo.GYM.view;

import com.leonardo.GYM.dao.AccesosDao;
import com.leonardo.GYM.model.AccesoModel;
import com.leonardo.gym.model.ClienteModel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class IU_Accesos extends javax.swing.JFrame {

    public IU_Accesos() {
        initComponents();

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
        lblImg = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        btnUltimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accesos");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID Cliente: ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nombre:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Apellidos: ");

        btnAcceso.setText("Nuevo Acceso");
        btnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoActionPerformed(evt);
            }
        });

        tblAccesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Acceso", "Tipo", "Fecha ", "ID_Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccesos);

        imgFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lblImg.setText("Error 420");

        javax.swing.GroupLayout imgFotoLayout = new javax.swing.GroupLayout(imgFoto);
        imgFoto.setLayout(imgFotoLayout);
        imgFotoLayout.setHorizontalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        imgFotoLayout.setVerticalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        btnBusqueda.setText("Busqueda Cliente");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        lblNombre.setText(" ");

        lblApellidos.setText(" ");

        btnUltimos.setText("Ultimos Accesos");
        btnUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnAcceso)
                        .addGap(30, 30, 30)
                        .addComponent(btnUltimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBusqueda)
                        .addGap(60, 60, 60))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblApellidos, lblId, lblNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblId))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceso)
                    .addComponent(btnBusqueda)
                    .addComponent(btnUltimos))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblApellidos, lblId, lblNombre});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        JDialog pneBusqueda = new BusquedaPane(this, rootPaneCheckingEnabled);
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
            JOptionPane.showMessageDialog(this, "Tienes que buscar un cliente antes de añadir un acceso.", "Cliente no seleccionado", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                AccesosDao accesoPrueba = new AccesosDao();

                String cliente = lblId.getText();
                accesoPrueba.insertarAcceso(Integer.valueOf(cliente));
                dispose();
            } catch (ParseException ex) {
                Logger.getLogger(NuevoAcceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            refrescaTabla();
        }

    }//GEN-LAST:event_btnAccesoActionPerformed

    private void btnUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosActionPerformed
refrescarUltimos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimosActionPerformed

    public void llenaDatos(ClienteModel cliente) {
        System.out.println(cliente.getId_cliente());

        String idCliente = String.valueOf(cliente.getId_cliente());
        String nombreCli = cliente.getNombre();
        String apellidoCli = cliente.getApellidos();

        System.out.println(idCliente + " - " + nombreCli + " - " + apellidoCli);

        lblId.setText(idCliente);
        lblNombre.setText(nombreCli);
        lblApellidos.setText(apellidoCli);

        System.out.println("LlenarDatosAcabado");
    }

    public void refrescaTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha"});

        TableRowSorter sorter = new TableRowSorter(dtm);
        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getAccesosCliente(Integer.parseInt(lblId.getText()));

        for (AccesoModel accesoIt : arrayAccesos) {
            dtm.addRow(accesoIt.toArrayStringClientes());
            System.out.println(accesoIt.getIdAcceso());
        }
        tblAccesos.setModel(dtm);
        tblAccesos.setEnabled(false);
    }

    private void refrescarUltimos() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha", "ID_Cliente", "Nombre"});

        TableRowSorter sorter = new TableRowSorter(dtm);
        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getUltimosAccesos();

        for (AccesoModel accesoIt : arrayAccesos) {
            dtm.addRow(accesoIt.toArrayStringUltimos());
            System.out.println(accesoIt.getIdAcceso());
        }
        tblAccesos.setModel(dtm);
        tblAccesos.setEnabled(false);
    }
     
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
            java.util.logging.Logger.getLogger(IU_Accesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Accesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Accesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Accesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Accesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceso;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnUltimos;
    private javax.swing.JPanel imgFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblAccesos;
    // End of variables declaration//GEN-END:variables
    private NuevoAcceso dlgNewAccess;
}
