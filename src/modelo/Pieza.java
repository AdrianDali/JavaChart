/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hermo
 */
public class Pieza {
    private int id_pieza ; 
    private int nombre_pieza; 

    public Pieza(int nombre_pieza) {
        this.nombre_pieza = nombre_pieza;
    }

    public int getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(int id_pieza) {
        this.id_pieza = id_pieza;
    }

    public int getNombre_pieza() {
        return nombre_pieza;
    }

    public void setNombre_pieza(int nombre_pieza) {
        this.nombre_pieza = nombre_pieza;
    }
    
    
    
}
