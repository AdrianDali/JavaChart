/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.ConnectionMDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author dali
 */
public class Usuario {
    private int id_usuario ;
    private String nombre;
    private Date fecha_ingreso;
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return this.getNombre();
    }
    
    public Vector<Usuario> mostrarUsuario(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Usuario> vectorUser = new Vector<Usuario>();
        Usuario user = null;
        
        try {
            ConnectionMDB con = new ConnectionMDB();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("Select * from usuarios");
            rs = ps.executeQuery();
            
            //esto es para anadir un primer pais "seleccione pais" para que se vea bie
            user = new Usuario();
            user.setId_usuario(0);
            user.setNombre("Seleccione Usuario");
            vectorUser.add(user);
            
            while (rs.next()) {  
                user = new Usuario();
            user.setId_usuario(rs.getInt("id_usuario"));
            user.setNombre(rs.getString("nombre"));
            user.setFecha_ingreso(rs.getDate("fecha_ingreso"));
            user.setEdad(rs.getInt("edad"));
            vectorUser.add(user);
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            
        }
        return vectorUser;
        
    }
    public String mostrarNombreUsuario(int idUsuario){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String nombreUsuario = "";
        
        
        try {
            ConnectionMDB con = new ConnectionMDB();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("Select nombre from usuarios where id_usuario = " + idUsuario);
            rs = ps.executeQuery();
                    
            while (rs.next()) {  
                nombreUsuario = rs.getString("nombre");
              
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            
        }
        return nombreUsuario;
        
    }
    public Vector<Usuario> mostrarUsuarioArea(int id_area){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Usuario> vectorUser = new Vector<Usuario>();
        Usuario user = null;
        
        try {
            ConnectionMDB con = new ConnectionMDB();
            Connection conexion = con.getConnection();
            System.out.println("ARREEEAAA " + id_area);
            ps = conexion.prepareStatement("Select * from usuario where disponible = 1 and id_area = " +id_area);
            rs = ps.executeQuery();
            
            //esto es para anadir un primer pais "seleccione pais" para que se vea bie
            user = new Usuario();
            user.setId_usuario(0);
            user.setNombre("Seleccione Usuario");
            vectorUser.add(user);
            
            while (rs.next()) {  
                user = new Usuario();
            user.setId_usuario(rs.getInt("id_usuario"));
            user.setNombre(rs.getString("nombre"));
            user.setFecha_ingreso(rs.getDate("fecha_ingreso"));
            user.setEdad(rs.getInt("edad"));
            vectorUser.add(user);
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            
        }
        return vectorUser;
        
    }    
}
