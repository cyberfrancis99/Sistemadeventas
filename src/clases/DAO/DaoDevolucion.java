package clases.DAO;

import java.sql.SQLException;

/**
 *
 * @author 
 */
public class DaoDevolucion extends DaoLog {
  
    public DaoDevolucion(String host, String db, String user, String pass) throws SQLException {
        super(host, db, user, pass);
    }  
}
