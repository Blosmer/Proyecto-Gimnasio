/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.GYM.model;

/**
 *
 * @author Mac
 */
public class AccesoModel {

    private int idAcceso, idCliente;
    private String tipo, fechaHora, nombreCliente, apellidosCliente;

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

    public AccesoModel() {

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

    public String[] toArrayStringUltimos() {
        String cadenaTipo;

        if (tipo.equals("1")) {
            cadenaTipo = "Entrada";
        } else {
            cadenaTipo = "Salida";
        }

        String[] s = new String[6];
        s[0] = Integer.toString(idAcceso);
        s[1] = cadenaTipo;
        s[2] = fechaHora;
        s[3] = String.valueOf(idCliente);
        s[4] = nombreCliente;
        s[5] = apellidosCliente;
        
        return s;
    }
}
