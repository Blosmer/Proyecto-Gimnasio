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
import java.util.ArrayList;

/**
 *
 * @author Mac
 */
public class VentaDao {
    
    
    public ArrayList<VentaModel> devolverVentaCliente(int idCliente) {
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
        return listaVentas;
    }
    
    public ArrayList<VentaModel> devolverVentaArticulo(int idArticulo) {
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
        return listaVentas;
    }
    
}
