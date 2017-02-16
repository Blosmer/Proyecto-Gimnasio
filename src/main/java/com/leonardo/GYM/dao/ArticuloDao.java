/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.GYM.dao;

import com.leonardo.GYM.model.ArticuloModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Mac
 */
public class ArticuloDao {

    public void insertarArticulo(String descripcion, double pvp, int stock) throws ParseException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql = String.format("INSERT INTO Articulos(descripcion, pvp, stock) VALUES ('%s', %s, %s)", descripcion,
                    pvp, stock);
            //System.out.println(sql);

            sentencia.executeUpdate(sql);
            System.out.println("ARTICULO INTRODUCIDO");

            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<ArticuloModel> getArticulos() {
        ArrayList<ArticuloModel> listaArticulos = new ArrayList<>();
        ArticuloModel articulo;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Articulos");

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    articulo = new ArticuloModel();
                    articulo.setIdArticulo(rs.getByte("id_articulo"));
                    articulo.setDescripcion(rs.getString("descripcion"));
                    articulo.setPvp(rs.getByte("pvp"));
                    articulo.setStock(rs.getByte("stock"));
                    listaArticulos.add(articulo);
                }
            } else {
                System.out.println("No hay articulos");
            }

            rs.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaArticulos;
    }
    public int getStock(int producto){
        int stock = 0;
        return stock;
    }
}
