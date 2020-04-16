/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author grand
 */


/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/*package edu.uapa.database;*/

//package tutorial.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author Edwin
*/
public class DB 
{
    
    private static Connection conexion = null;

  // "jdbc:postgresql://localhost/northwind"
    public DB(String host,String db,String user,String pass) throws SQLException{
        String url = "jdbc:postgresql://"+host+"/"+db;
        
        try {     
            conexion=DriverManager.getConnection(url,user,pass);
        } catch (SQLException exc){
            throw exc;
        }
        
    }
    
     public DB(String motor,String host,String db,String user,String pass) throws SQLException{
        String url = "jdbc:"+motor+"://"+host+"/"+db;
        
        try {     
           // Class.forName("org.postgresl.Driver");
            conexion=DriverManager.getConnection(url,user,pass);
        } catch (SQLException exc){
            throw exc;
        }
        
    }
    
    public void execSP() throws SQLException
    {
        try
        {
          CallableStatement cStmt = conexion.prepareCall("{call demoSp(?, ?)}");    
          cStmt.setString(1, "abcdefg");    
          cStmt.setInt(2, 0);  
          cStmt.registerOutParameter("inOutParam", Types.INTEGER);    
        }catch(SQLException e) {
        throw e;
        }
        
    }
    
    
    public ResultSet execSelect(String sql) throws SQLException{   
         try 
         {
            Statement comando = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = comando.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
           // Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
        
    public void execSQL(String query) throws SQLException
       {
        try {
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
          //  Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
           // System.err.println("** Error de Base de datos **\n"+ex.getMessage());
        }
    }

    public void CerrarConexion() throws SQLException {
        try {
            conexion.close();
            conexion = null;
        } catch (SQLException ex) {
            throw ex;
            //Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //************************//
    
    public int generarSecuencia(String tipodoc)
    { String sql;
      int num=0;
      sql="select getsecuencia("+comilla(tipodoc)+")";
      ResultSet rs;
      
        try {
            rs=execSelect(sql);
            while (rs.next())
            {
               num=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      return  num;
    }
   
 
     public  String comilla(String st)
    {
       return "'"+st+"'"; 
    }   
     
}
