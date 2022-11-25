
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/**
 *
 * @author kevin
 */
public class ConexionMysql {
    Connection cn;
    
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/miproyecto","root","");
            System.out.println("Conexión Exitosa");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION"+e);
        }
        return cn;
    }
}
