/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.DAO;

import clases.DTO.Dtocategoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author
 */
    
public class DaoCategoria extends DaoLog {
     
    public DaoCategoria(String host, String db, String user, String pass) throws SQLException {
        super(host, db, user, pass);
    }
    
     public boolean selectcategoria(String descripcion, int codigo) throws SQLException
  {     
        ResultSet rs;
        PreparedStatement buscar=null;
       String sql="SELECT id, descripcion FROM public.categoria \n";
       
       
       try {          
            buscar = conexion.prepareStatement(sql);
            buscar.setInt(1, codigo);
            buscar.setString(2, descripcion);
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
