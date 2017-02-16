package com.leonardo.GYM.view;

import com.leonardo.GYM.dao.AccesosDao;
import com.leonardo.GYM.dao.ArticuloDao;
import com.leonardo.GYM.dao.VentaDao;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IU_Expendedora extends javax.swing.JFrame {

    private static int idCodigo;

    public IU_Expendedora() {
        initComponents();
        System.out.println("¿Que desea comprar?");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina Expendedora");

        btnBoteProtes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boteProtes70.jpg"))); // NOI18N

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

        btnProhibido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prohibido18.png"))); // NOI18N

        btnKingston.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kigston.jpg"))); // NOI18N

        btnCerveza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerveza.jpg"))); // NOI18N
        btnCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCervezaActionPerformed(evt);
            }
        });

        btnMacdonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mcDonal.jpg"))); // NOI18N

        btnBurguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/burger.jpg"))); // NOI18N

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Máquina Expendedora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtId.setToolTipText("Hpli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMacdonal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnBoteProtes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnProhibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnKingston, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNukacola, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnComprar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNukacola, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKingston, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProhibido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMacdonal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoteProtes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantaActionPerformed
        System.out.println("Ha elegido: FANTA NARANJA");
    }//GEN-LAST:event_btnFantaActionPerformed

    private void btnNukacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNukacolaActionPerformed
        boolean hayNukacola = false;
        ArticuloDao a = new ArticuloDao();
        a.getArticulos();
        
        if (hayNukacola) {
            VentaDao v = new VentaDao();
            try {
                v.setVenta(Integer.parseInt(txtId.getText()), 2);
            } catch (ParseException ex) {
                Logger.getLogger(IU_Expendedora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Ha elegido: NUKA-COLA");
    }//GEN-LAST:event_btnNukacolaActionPerformed

    private void btnCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCervezaActionPerformed

        System.out.println("Ha elegido: Mahou 0%0.");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCervezaActionPerformed

    private void btnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaActionPerformed
        System.out.println("Ha elegido: Nestle");
    }//GEN-LAST:event_btnAguaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce cliente antes de comprar.", "Cliente no introducido", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_btnComprarActionPerformed

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
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnKingston;
    private javax.swing.JButton btnMacdonal;
    private javax.swing.JButton btnNukacola;
    private javax.swing.JButton btnProhibido;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
