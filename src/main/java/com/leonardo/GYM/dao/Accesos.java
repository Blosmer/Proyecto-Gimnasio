package com.leonardo.GYM.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accesos {

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Accesos() {
    }

    ResultSet rs;

    public void insertarAcceso(int idCliente, int tipo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();
            
            int tipoConsulta;
            Date date = new Date();
            System.out.println(dateFormat.format(date));

            String sqlTipo = String.format("SELECT fechahora, tipo FROM Accesos "
                    + "WHERE id_cliente = %s ORDER BY id_acceso DESC LIMIT 1", idCliente);
            ResultSet resultTipo = sentencia.executeQuery(sqlTipo);
            resultTipo.next();
            tipoConsulta = resultTipo.getInt(2);
            
            if (tipoConsulta == 0) {
                tipo = 1;
            } else {
                tipo = 0;
            }
            System.out.println(tipoConsulta);
            System.out.println(resultTipo.getDate(1));
            
            System.out.println((date.getTime() - resultTipo.getDate(1).getTime())/(1000));
            if ((date.getTime() - resultTipo.getDate(1).getTime())<(1000*60)) {   
                System.out.println("No ha pasado un minuto");
            } else {
                System.out.println("Ha pasado más de un minuto");
            }

            String sql = String.format("INSERT INTO Accesos(tipo, fechahora, id_cliente) VALUES (%s, '%s', '%s')", tipo,
                    dateFormat.format(date), idCliente);
            System.out.println(sql);
            //sentencia.executeUpdate(sql);

            conexion.close();
            //System.out.println("ACCESO INTRODUCIDO");
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
