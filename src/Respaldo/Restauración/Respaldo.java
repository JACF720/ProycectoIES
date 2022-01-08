package Respaldo.Restauración;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class Respaldo {
    conexionbd con =new conexionbd();
    String bd = conexionbd.getbd();
    
    
    public void Respaldo(String us, String contraseña){
        try {
            JOptionPane.showMessageDialog(null, bd);
            Process p = Runtime.getRuntime().exec("mysqldump -u "+us+" -p"+contraseña+" "+bd);
            new Error(p.getErrorStream()).start();
            InputStream is = p.getInputStream();//Pedimos la entrada
            FileOutputStream fos = new FileOutputStream("laboratorio_clinico.sql"); //creamos el archivo para le respaldo
            byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer
            
            int leido = is.read(buffer); //Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
            while (leido > 0) {
                fos.write(buffer, 0, leido);//Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
                leido = is.read(buffer);
            }
            
            fos.close();//Cierra respaldo
        } catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Restauración(String us, String contraseña){
        try {
            Process p = Runtime.getRuntime().exec("mysql -u "+us+" -p"+contraseña+" "+bd);
            new Error(p.getErrorStream()).start();
            OutputStream os = p.getOutputStream(); //Pedimos la salida
            FileInputStream fis = new FileInputStream("laboratorio_clinico.sql"); //creamos el archivo para le respaldo
            byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer
            
            int leido = fis.read(buffer);//Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
            while (leido > 0) {
                os.write(buffer, 0, leido); //Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
                leido = fis.read(buffer);
            }
            os.flush(); //vacía los buffers de salida
            os.close(); //Cierra
            fis.close(); //Cierra respaldo
        } catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
