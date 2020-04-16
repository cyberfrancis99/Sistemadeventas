package clases.DAO;

import java.sql.SQLException;

/**
 *
 * @author 
 */
public class DaoFactura extends DaoLog {
    
    public DaoFactura(String host, String db, String user, String pass) throws SQLException {
        super(host, db, user, pass);
    }
    
}
