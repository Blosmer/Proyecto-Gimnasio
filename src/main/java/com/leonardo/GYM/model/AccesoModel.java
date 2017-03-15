/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.GYM.model;

import java.awt.Image;
import java.sql.Blob;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 *
 * @author Mac
 */
public class AccesoModel {

    private int idAcceso, idCliente;
    private String tipo, fechaHora, nombreCliente, apellidosCliente;
    private ImageIcon fotoCliente;

    public AccesoModel() {

    }

    public ImageIcon getFotoCliente() {
        return fotoCliente;
    }

    public void setFotoCliente(ImageIcon fotoCliente) {
        this.fotoCliente = fotoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String[] toArrayStringClientes() {
        String cadenaTipo;

        if (tipo.equals("1")) {
            cadenaTipo = "Entrada";
        } else {
            cadenaTipo = "Salida";
        }

        String[] s = new String[3];
        s[0] = Integer.toString(idAcceso);
        s[1] = cadenaTipo;
        s[2] = fechaHora;

        return s;
    }

    public Vector toArrayStringUltimos() {
        String cadenaTipo;

        if (tipo.equals("1")) {
            cadenaTipo = "Entrada";
        } else {
            cadenaTipo = "Salida";
        }
        Vector v = new Vector();
        v.add(idAcceso);
        v.add(cadenaTipo);
        v.add(fechaHora);
        v.add(String.valueOf(idCliente));
        v.add(nombreCliente);
        v.add(apellidosCliente);
        /*
        String[] s = new String[6];
        s[0] = Integer.toString(idAcceso);
        s[1] = cadenaTipo;
        s[2] = fechaHora;
        s[3] = String.valueOf(idCliente);
        s[4] = nombreCliente;
        s[5] = apellidosCliente;
         */

        return v;
    }
}
