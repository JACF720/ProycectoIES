
package Conexion;

import Respaldo.Restauración.conexionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class conexion_MYSQL {
    conexionbd conb = new conexionbd();
    private String user = conb.getus();
    private String password = conb.getpass();
    private String DB_name = conb.getbd();
    private String host = "localhost";
    
    private Connection conectar = null;
    
    private final String URL = "jdbc:mysql://" + host + ":3306/" + DB_name;

    public conexion_MYSQL() {
    }

    public Connection obtener_conexion() {
        try {
            conectar = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectarse a la base de datos!! " + ex);
        }
        if (conectar != null) {
            System.out.println("Conectado a la base de datos....");
        }
        return conectar;
    }
    
    //Tablas
     public static ResultSet getTabla (String Consulta){
        conexion_MYSQL con = new conexion_MYSQL(); 
        Connection conectar =con.obtener_conexion();
        Statement st;
        ResultSet datos=null;
        
        try{
            st = conectar.createStatement();
            datos=st.executeQuery(Consulta);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        return datos;
    }
}
