package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivet
 */
public class conexion {

    private final String base = "comercio";
    private final String password = "";
    private final String user = "root";
    private final String url = "jdbc:mysql://localhost:3306/" + base + "?serverTimezone = UTC";
    
    public Connection getConexion() throws ClassNotFoundException, SQLException{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        return con;
        
    }
    
}
