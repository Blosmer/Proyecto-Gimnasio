package com.leonardo.GYM.view;

import com.leonardo.GYM.dao.AccesosDao;
import com.leonardo.GYM.model.AccesoModel;
//import com.leonardo.GYM.model.ModeloTabla;
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
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane1.setViewportView(tblAccesos);

        imgFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mrIncognito.jpg"))); // NOI18N

        javax.swing.GroupLayout imgFotoLayout = new javax.swing.GroupLayout(imgFoto);
        imgFoto.setLayout(imgFotoLayout);
        imgFotoLayout.setHorizontalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imgFotoLayout.setVerticalGroup(
            imgFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btnUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setText("Gestión de accesos");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(btnBusqueda)
                        .addGap(60, 60, 60))
                    .addComponent(jScrollPane1)
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
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblApellidos, lblId, lblNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addGap(15, 15, 15)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApellidos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
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
        
        lblId.setText(idCliente);
        lblNombre.setText(nombreCli);
        lblApellidos.setText(apellidoCli);
    }

    public void refrescaTabla() {
        
        ModeloTabla mlt = new ModeloTabla();
        mlt.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha"});
        TableRowSorter sorter = new TableRowSorter(mlt);
        tblAccesos.setModel(mlt);
        

        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getAccesosCliente(Integer.parseInt(lblId.getText()));

        for (AccesoModel accesoIt : arrayAccesos) {
            mlt.addRow(accesoIt.toArrayStringClientes());
            System.out.println(accesoIt.getIdAcceso());
        }
        //tblAccesos.setModel(dtm);
    }

    private void refrescarUltimos() {
        ModeloTabla mlt = new ModeloTabla();
        mlt.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha", "ID_Cliente", "Nombre"});
        TableRowSorter sorter = new TableRowSorter(mlt);
        tblAccesos.setModel(mlt);
        
       
        mlt.setColumnIdentifiers(new String[]{"ID_Acceso", "Tipo", "Fecha", "ID_Cliente", "Nombre"});
       
        tblAccesos.setModel(mlt);
        

        tblAccesos.setRowSorter(sorter);
        AccesosDao ac = new AccesosDao();

        ArrayList<AccesoModel> arrayAccesos = ac.getUltimosAccesos();

        for (AccesoModel accesoIt : arrayAccesos) {
            mlt.addRow(accesoIt.toArrayStringUltimos());
        }
        //tblAccesos.setEnabled(false);
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
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAccesos;
    // End of variables declaration//GEN-END:variables
    private NuevoAcceso dlgNewAccess;
}
class ModeloTabla extends DefaultTableModel{
   public boolean isCellEditable (int row, int column){
       // Aquí devolvemos true o false según queramos que una celda identificada por fila,columna (row,column), sea o no editable
       /*if (column == 3)
          return true;*/
       return false;
   }
}
