package clases;

import java.sql.*;

/**
 *
 * @author 
 */
public class Dao_Ingreso extends Dao_conection{
    //User's attributes
    private int id_user;
    private String username;
    private String password;
    
    //Database params
    private PreparedStatement prepare;
    private ResultSet result;

    public Dao_Ingreso(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public int getID(){
        return id_user;
    }
    
    public boolean verificarusuario() {
        
        try {
            //Build query for check user
            String query = "SELECT id FROM public.usuario _"
                    + "WHERE user=? AND pass=?";
            
            //Prepare Statement
            prepare = conexion.prepareStatement(query);
            prepare.setString(1, username);
            prepare.setString(2, password);
            
            //Get Result
            result = prepare.executeQuery();
            
            //Check if found one user
            if(result.next()){
                id_user = result.getInt(1);
                return true;
                
            } else {
                return false;
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
}
