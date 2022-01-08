/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import interfacez.add_cites;
import static interfacez.add_cites.jc_date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class datos {

    String turno = "", cliente = "", fecha_cita = "",
            hora_cita = "", t_examen = "", n_examen = "", precio = "";

    public void capturar_datos() {
        turno = add_cites.txt_turn.getText();
        cliente = add_cites.txt_client.getText();
        fecha_cita = ((JTextField) jc_date.getDateEditor().getUiComponent()).getText();
        hora_cita = add_cites.combo_hora.getSelectedItem().toString();
        t_examen = add_cites.combo_examen.getSelectedItem().toString();
        n_examen = add_cites.combo_examen.getSelectedItem().toString();
        precio = add_cites.txt_price.getText();
    }
public void mostrar_datos(){
    
    JOptionPane.showMessageDialog (null, "Cita registrada con exito\n"
                    + "Turno:"+turno+"\n"+"Cliente: "+cliente+"\n"
                            + "Fecha Cita: "+fecha_cita+"\n"+"Hora Cita: "+hora_cita+"\n"
                            +"Tipo Examen:  "+t_examen+"\n"+"Nombre Examen:  "+n_examen+"\n"+"Precio Examen: $"+precio);

}
}