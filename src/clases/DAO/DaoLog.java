/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ing
 */
public class DaoLog {
    Connection conexion=null;
  int iduser=0;
    
  public  DaoLog(String host,String db,String user,String pass)  throws SQLException
    {
        String url = "jdbc:postgresql://"+host+"/"+db;
        
        try {     
            conexion=DriverManager.getConnection(url,user,pass);
        } catch (SQLException exc){
            throw exc;
        }        
    }

    public int getIduser() {
        return iduser;
    }
  
    public Connection getConexion() {
        return conexion;
    }  
   
  /*Revisar si usuario existe en el sistema
    
    */
  public boolean permisoForUser(String user, String pass) throws SQLException
  {     
        ResultSet rs;
        PreparedStatement buscar=null;
       String sql="SELECT id FROM public.usuario a\n" +
        "  where\n" +
        "  a.\"user\" = ? and \n" +
        "  a.pass = ? and\n" +
        "  a.activo =true\n" ;
       try {          
            buscar = conexion.prepareStatement(sql);
            buscar.setString(1, user);
            buscar.setString(2, pass);
            rs = buscar.executeQuery();
            while (rs.next())
            {
                iduser = rs.getInt(1);
                return true;
            }
       }catch(SQLException e)
       {
           throw e;
       } 
        return false;
    } 
}
