/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
