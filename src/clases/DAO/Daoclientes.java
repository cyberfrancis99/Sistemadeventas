/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.DAO;

import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Daoclientes extends DaoLog {
    
    public Daoclientes(String host, String db, String user, String pass) throws SQLException {
        super(host, db, user, pass);
    }
    
}
