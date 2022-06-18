/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author hermo
 */
public class Usuario {
    private int id_usuario;
    private String nombre;
    private Date fecha_ingreso;

    public Usuario(int id_usuario, String nombre, Date fecha_ingreso) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    
    
    
}
