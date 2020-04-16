/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author pc
 */
public class Dao_conection {
    
    //Atributos privados
    private String server;
    private String ip;
    private int puerto;
    private String usuario;
    private String contrasena;
    private String database;
    public static Connection conexion;
    
    public Dao_conection() {
        //Datos de conexión al servidor (SOLO CAMBIAR SI ES ABSOLUTAMENTE NECESARIO).
        ip = "192.168.56.102";
        puerto = 5432;
        usuario = "postgres";
        contrasena = "letmein";
        database = "final_fac";
        
        //Se crea el string de conexión
        server = "jdbc:postgresql://" + ip + "/" + database;
        
        //Crear la conexión a la base de datos
        sqlConect();
    }
    
    /**
     * Este método sirve para Ocrea una conexión a una base de dates.
     * @return conexión.
     */
    private void sqlConect() {
        
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(server, usuario, contrasena);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
 
    }
    
    private void sqlCerrar() { 
        if (conexion!=null) {
            
            try {
                if (conexion.isClosed()==false) {
                    conexion.close();         
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }     
    }  
}


