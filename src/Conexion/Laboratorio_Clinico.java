package Conexion;

import Respaldo.Restauración.Inicio;
import interfacez.user_access;
import java.io.IOException;


public class Laboratorio_Clinico {
public void path(){
        try {
	String cmd = "mysqlbin.bat"; 
	Runtime.getRuntime().exec(cmd); 
        } catch (IOException ioe) {
	System.out.println (ioe);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Laboratorio_Clinico lab= new Laboratorio_Clinico();
       lab.path();
       Inicio ingreso=new Inicio(); 
       ingreso.setVisible(true);
    }
    
}
