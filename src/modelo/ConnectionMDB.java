/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dali
 */
public class ConnectionMDB {
    public static final String URL = "jdbc:mysql://localhost:3306/monitoreo_trabajo?autoReconnet=true&useSSL=false";
   // public static final String user = "adrian";
    public static final String user = "root";
    public static final String password = "1234";
    
    public Connection getConnection(){
        Connection conection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = (Connection) DriverManager.getConnection(URL,user,password);
           // System.out.println("se logro");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conection;
    }
}
