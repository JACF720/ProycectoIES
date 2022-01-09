package Respaldo.Restauración;

import java.io.*;
import java.sql.*;
import javax.swing.*;
/* 3511 
Equipo 3 
Simulación
/**
 * @author Casillas Flores Jaime Alberto
 */
public class conexionbd {
    Inicio conb = new Inicio();
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    final String Controlador = "com.mysql.cj.jdbc.Driver";
    public static String usersql, passsql;
    private final String bd1 = conb.getBD();
    final String url_bd = "jdbc:mysql://localhost/?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    final String url_bd2 = "jdbc:mysql://localhost/" + bd1 + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    

    public void ValidarUs(String us, String contraseña) {
        try {
            usersql = us;
            passsql = contraseña;
            Class.forName(Controlador);
            conexion = DriverManager.getConnection(url_bd, us, contraseña);
            setus(us);
            setpass(contraseña);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta.", "Aviso!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ConectarBasedeDatos() throws SQLException {
        try {
            Class.forName(Controlador);
            conexion = DriverManager.getConnection(url_bd2, usersql, passsql);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery("SHOW DATABASES like '" + bd1 + "'");
            JOptionPane.showMessageDialog(null, "No es nulo, La base de datos " + bd1 + " existe.", "Aviso!!", JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Si es nulo, La base de datos " + bd1 + " no existe.", "Aviso!!", JOptionPane.ERROR_MESSAGE);
            conexion = DriverManager.getConnection(url_bd, usersql, passsql);
            sentencia = conexion.createStatement();
            String query = "DROP DATABASE IF EXISTS " + bd1;
            String query2 = "CREATE DATABASE " + bd1;
            sentencia.executeUpdate(query);
            sentencia.executeUpdate(query2);
            JOptionPane.showMessageDialog(null, "Se ha creado con exito la base de datos " + bd1 + "!!.", "Aviso!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    public static String getbd() {
        return bd1;
    }

    public void setbd(String bd) {
        this.bd1 = bd;
    }
    public static String getus() {
        return usersql;
    }

    public void setus(String us) {
        this.usersql = us;
    }
    public static String getpass() {
        return passsql;
    }

    public void setpass(String pass) {
        this.passsql = pass;
    }
}
