package com.leonardo.GYM.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accesos{

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public Accesos() {
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
}
