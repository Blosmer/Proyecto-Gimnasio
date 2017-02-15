/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.GYM.dao;

import com.leonardo.GYM.model.VentaModel;
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

/**
 *
 * @author Mac
 */
public class VentaDao {

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public VentaDao() {

    }

    public void insertarVenta(int idCliente, int idArticulo) throws ParseException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            Date date = new Date();

            String sql = String.format("INSERT INTO Ventas(fecha_hora_venta, id_articulo, id_cliente) VALUES ('%s', %s, %s)",
                    dateFormat.format(date), idArticulo, idCliente);
            //System.out.println(sql);

            sentencia.executeUpdate(sql);
            System.out.println("VENTA INTRODUCIDA");
            
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<VentaModel> getVentasCliente(int idCliente) {
        ArrayList<VentaModel> listaVentas = new ArrayList<>();
        VentaModel venta;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Ventas where id_cliente= " + idCliente);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    venta = new VentaModel();
                    venta.setIdVenta(rs.getByte("id_venta"));
                    venta.setIdArticulo(rs.getByte("id_articulo"));
                    venta.setFechaHoraVenta(rs.getString("fecha_hora_venta"));
                    venta.setIdCliente(rs.getByte("id_cliente"));
                    listaVentas.add(venta);
                }
            } else {
                System.out.println("Hay ventas de ese cliente");
            }

            rs.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaVentas;
    }

    public ArrayList<VentaModel> getVentasArticulo(int idArticulo) {
        ArrayList<VentaModel> listaVentas = new ArrayList<>();
        VentaModel venta;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Ventas where id_articulo= " + idArticulo);

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    venta = new VentaModel();
                    venta.setIdVenta(rs.getByte("id_venta"));
                    venta.setIdArticulo(rs.getByte("id_articulo"));
                    venta.setFechaHoraVenta(rs.getString("fecha_hora_venta"));
                    venta.setIdCliente(rs.getByte("id_cliente"));
                    listaVentas.add(venta);
                }
            } else {
                System.out.println("No hay ventas de ese articulo");
            }

            rs.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaVentas;
    }

}
