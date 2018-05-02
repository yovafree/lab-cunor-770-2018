/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erwin
 */
public class Usuario {
    private Connection ConeccionSQLite;
    private ResultSet rs;
    
    /**
     * Constructor de la Clase: Resive un objeto Connection
     * @param ConeccionSQLite
     */
    public Usuario(Connection ConeccionSQLite)
    {
        this.ConeccionSQLite = ConeccionSQLite;
    }
    
    /**
     * Metodo getUsuarios
     * @return devuelve los usuarios.
     */
    public ResultSet getUsuarios(){
        String sSQL = "SELECT cod_usuario, nombres, apellidos FROM  usuario";
        try {
            Statement s = ConeccionSQLite.createStatement();
             rs = s.executeQuery(sSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return rs;
    }
}
