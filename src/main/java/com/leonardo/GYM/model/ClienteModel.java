package com.leonardo.gym.model;

import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class ClienteModel {
    private int id_cliente;
    private String nombre;
    private String apellidos;
    private String nif;
    private String localidad;
    private String domicilio;
    private String cp;
    private String genero;
    private Date fecha_nacimiento;
    private int telefono_fijo;
    private int telefono_movil;
    private String email;
    private Image LONGBLOB;
    private String observaciones;

    public ClienteModel(){
        
    }

    // El constructor de la clase ClienteModel
    public ClienteModel(int id_cliente, String nombre, String apellidos, String nif, String localidad, String domicilio, String cp, String genero, Date fecha_nacimiento, int telefono_fijo, int telefono_movil, String email, Image LONGBLOB, String observaciones) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.localidad = localidad;
        this.domicilio = domicilio;
        this.cp = cp;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono_fijo = telefono_fijo;
        this.telefono_movil = telefono_movil;
        this.email = email;
        this.LONGBLOB = LONGBLOB;
        this.observaciones = observaciones;
    }
    
    // Metodos de los atributos
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(int telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public int getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(int telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getLONGBLOB() {
        return LONGBLOB;
    }

    public void setLONGBLOB(Image LONGBLOB) {
        this.LONGBLOB = LONGBLOB;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Vector toVector() {
        Vector array = new Vector();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        array.add(id_cliente);
        array.add(nombre);
        array.add(apellidos);
        array.add(nif);
        array.add(localidad);
        array.add(domicilio);
        array.add(cp);
        array.add(genero);
        array.add(dateFormat.format(fecha_nacimiento));
        array.add(telefono_fijo);
        array.add(telefono_movil);
        array.add(email);
        array.add(LONGBLOB);
        array.add(observaciones);
        return array;
    }
    
    @Override
    public String toString() {
        return "clientes {id_cliente="+id_cliente+", nombre="+nombre+", apellidos="+apellidos+", nif="+nif+", localidad="+localidad+", domicilio="+domicilio+", cp="+cp+", genero="+genero+", fecha_nacimiento="+fecha_nacimiento+", telefono_fijo="+telefono_fijo+", telefono_movil="+telefono_movil+", email="+email+", LONGBLOB="+LONGBLOB+", observaciones="+observaciones+"}";
    }

    
}
