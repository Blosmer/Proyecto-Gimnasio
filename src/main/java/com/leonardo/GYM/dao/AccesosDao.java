package com.leonardo.GYM.dao;

import com.leonardo.GYM.model.AccesoModel;
import com.leonardo.GYM.view.IU_Accesos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class AccesosDao{

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public AccesosDao() {
    }

    public void insertarAcceso(int idCliente) throws ParseException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            Date date = new Date();
            Date ultimaFecha;
            
            int tipo;

            String sqlTipo = String.format("SELECT fechahora, tipo FROM Accesos "
                    + "WHERE id_cliente = %s ORDER BY id_acceso DESC LIMIT 1", idCliente);
            ResultSet resultTipo = sentencia.executeQuery(sqlTipo);

            if (resultTipo.isBeforeFirst()) {
                resultTipo.next();
                ultimaFecha = dateFormat.parse(resultTipo.getString(1));
                if (resultTipo.getInt(2) == 0) {
                    tipo = 1;
                } else {
                    tipo = 0;
                }
            } else {
                resultTipo.close();
                tipo = 1;
                ultimaFecha = date;
            }

            String sql = String.format("INSERT INTO Accesos(tipo, fechahora, id_cliente) VALUES (%s, '%s', '%s')", tipo,
                    dateFormat.format(date), idCliente);
            //System.out.println(sql);

            if (date.getTime() - ultimaFecha.getTime() < (10000) && 
                    date.getTime() - ultimaFecha.getTime() > 0) {
                
                
                /*JOptionPane.showMessageDialog(IU_Accesos.class, 
                        "Ha introducido 2 accesos muy rapido.", 
                        "Acceso continuo", JOptionPane.ERROR_MESSAGE);*/
                
                System.out.println("Esperate 10 segundos para pasar la tarjetita");
            } else {
                sentencia.executeUpdate(sql);
                System.out.println("ACCESO INTRODUCIDO");
            }
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<AccesoModel> getAccesosCliente(int idCliente) {
        ArrayList<AccesoModel> listaAccesos = new ArrayList<>();
        AccesoModel acceso;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Accesos where id_cliente= " + idCliente);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    acceso = new AccesoModel();
                    acceso.setIdAcceso(rs.getByte("id_acceso"));
                    acceso.setTipo(rs.getString("tipo"));
                    acceso.setFechaHora(rs.getString("fechahora"));
                    acceso.setIdCliente(rs.getByte("id_cliente"));
                    listaAccesos.add(acceso);
                }
            } else {
                System.out.println("El cliente no tiene accesos");
            }

            rs.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAccesos;
    }
    
    public ArrayList<AccesoModel> getUltimosAccesos() {
        ArrayList<AccesoModel> listaAccesos = new ArrayList<>();
        AccesoModel acceso;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT a.*, cl.nombre, cl.apellidos FROM Accesos a left join Clientes cl \n" +
                                                        "ON a.id_cliente=cl.id_cliente\n" +
                                                        "ORDER BY id_acceso DESC LIMIT 20");

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    acceso = new AccesoModel();
                    acceso.setIdAcceso(rs.getByte("id_acceso"));
                    acceso.setTipo(rs.getString("tipo"));
                    acceso.setFechaHora(rs.getString("fechahora"));
                    acceso.setIdCliente(rs.getByte("id_cliente"));
                    acceso.setNombreCliente(rs.getString("cl.nombre"));
                    acceso.setApellidosCliente(rs.getString("cl.apellidos"));
                    listaAccesos.add(acceso);
                }
            } else {
                System.out.println("No hay accesos");
            }

            rs.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAccesos;
    }
}
