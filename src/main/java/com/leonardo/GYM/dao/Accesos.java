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

            Date date = new Date();
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sqlInserta = String.format("INSERT INTO Accesos(tipo, fechahora, id_cliente) VALUES (%s, '%s', '%s')", tipo,
                    dateFormat.format(date), idCliente);
            System.out.println(sqlInserta);
            sentencia.executeUpdate(sqlInserta);

            conexion.close();
            System.out.println("ACCESO INTRODUCIDO");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
