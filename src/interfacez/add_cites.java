package interfacez;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import laboratorio_clinico.conexion_MYSQL;
import laboratorio_clinico.datos;

public class add_cites extends javax.swing.JFrame {

    // Esrtablecer conexion a MYSQL
    conexion_MYSQL c = new conexion_MYSQL();
    Connection conectar = c.obtener_conexion();

    DefaultComboBoxModel modelExam_types, modelExam;

    //mrtodo para llenar en combo box de tipo de examenes
    public void llenar_combo_types_E() {
        String[] t_exams = {"Seleccionar", "Bioquimicos", "Hematologicos", "Hormonas", "Inmunologicos"};
        modelExam_types = new DefaultComboBoxModel(t_exams);
        combo_tipos.setModel(modelExam_types);
    }

    //llenar combo box de los examenes de acuerdo al tipo
    public void llenar_combo_Exams() {
        String[] seleccionar = {"Seleccionar"};
        String[] bioquimicos = {"Seleccionar", "Glucosa", "Ácido Urico", "Creatinina", "Urea", "Colesterol", "Trigliceridos", "Hierro"};
        String[] hematologicos = {"Seleccionar", "Hemogramas C+ Plaquetas", "Plaquetas", "Ácido Fólico"};
        String[] hormonas = {"Seleccionar", "HGG (Prueba Embarazo)"};
        String[] inmunologicos = {"Seleccionar", "VIH / SIDA"};

        String Exam_types = combo_tipos.getSelectedItem().toString();
        switch (Exam_types) {
            case "Seleccionar":
                modelExam = new DefaultComboBoxModel(seleccionar);
                combo_examen.setModel(modelExam);
                break;
            case "Bioquimicos":
                modelExam = new DefaultComboBoxModel(bioquimicos);
                combo_examen.setModel(modelExam);
                break;
            case "Hematologicos":
                modelExam = new DefaultComboBoxModel(hematologicos);
                combo_examen.setModel(modelExam);
                break;
            case "Hormonas":
                modelExam = new DefaultComboBoxModel(hormonas);
                combo_examen.setModel(modelExam);
                break;
            case "Inmunologicos":
                modelExam = new DefaultComboBoxModel(inmunologicos);
                combo_examen.setModel(modelExam);
                break;
            default:
                break;
        }
    }

    public add_cites() {
        initComponents();
        this.setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);

        llenar_combo_types_E();
        btn_update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_turn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_client = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jc_date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_examen = new javax.swing.JComboBox<>();
        combo_hora = new javax.swing.JComboBox<>();
        combo_tipos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(252, 243, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Cita", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setText("Agregar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Turno:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 40, -1, -1));

        txt_turn.setBackground(new java.awt.Color(255, 255, 255));
        txt_turn.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 36, 82, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 76, -1, -1));

        txt_client.setEditable(false);
        txt_client.setBackground(new java.awt.Color(255, 255, 255));
        txt_client.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 72, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Cita:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 108, -1, 29));

        jc_date.setBackground(new java.awt.Color(255, 255, 255));
        jc_date.setForeground(new java.awt.Color(0, 0, 0));
        jc_date.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 108, 198, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo Examen:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 185, -1, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Examen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        combo_examen.setBackground(new java.awt.Color(255, 255, 255));
        combo_examen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_examen.setForeground(new java.awt.Color(0, 0, 0));
        combo_examen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(combo_examen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 190, -1));

        combo_hora.setBackground(new java.awt.Color(255, 255, 255));
        combo_hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_hora.setForeground(new java.awt.Color(0, 0, 0));
        combo_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00" }));
        jPanel1.add(combo_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, -1));

        combo_tipos.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_tipos.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tiposActionPerformed(evt);
            }
        });
        jPanel1.add(combo_tipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio Examen $");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        txt_price.setBackground(new java.awt.Color(255, 255, 255));
        txt_price.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 82, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hora Cita:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, -1, 29));

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setText("Reagendar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(252, 243, 207));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searc.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        //por terminar xd
        try {
            String query = "{call maximo_cita_dia(?)}";
            CallableStatement st = conectar.prepareCall(query);
            ResultSet rs = st.executeQuery();
            st.setString(1, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            while (rs.next()) {

                String num_citas = rs.getString("total_citas");
                System.out.println(rs.getString("total_citas"));
                if (Integer.parseInt(num_citas) < 2) {
                    JOptionPane.showMessageDialog(null, "Erroar");
                } else {
                    JOptionPane.showMessageDialog(null, "Erroa elser");
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        //------------------------------------------------------------------------
        try {
            CallableStatement insert = conectar.prepareCall("{call add_cites(?,?,?,?,?,?,?)}");
            insert.setString(1, txt_turn.getText());
            insert.setString(2, txt_client.getText());
            insert.setString(3, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            insert.setString(4, combo_hora.getSelectedItem().toString());
            insert.setString(5, combo_tipos.getSelectedItem().toString());
            insert.setString(6, combo_examen.getSelectedItem().toString());
            insert.setString(7, txt_price.getText());

            //ejecutamos query
            insert.execute();
            //presentamos mensaje de registro, lo llamamos de la clase datos
            datos d = new datos();
            d.capturar_datos();
            d.mostrar_datos();
            this.dispose();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR INTENTE NUEVAMENTE!!!\n" + e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void combo_tiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tiposActionPerformed
        llenar_combo_Exams();
    }//GEN-LAST:event_combo_tiposActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {
            CallableStatement update = conectar.prepareCall("{call update_cites(?,?,?,?,?,?,?)}");
            update.setString(1, txt_turn.getText());
            update.setString(2, txt_client.getText());
            update.setString(3, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            update.setString(4, combo_hora.getSelectedItem().toString());
            update.setString(5, combo_tipos.getSelectedItem().toString());
            update.setString(6, combo_examen.getSelectedItem().toString());
            update.setString(7, txt_price.getText());

            //ejecutamos query
            update.execute();
            //presentamos mensaje de registro
            JOptionPane.showMessageDialog(null, "Cita reagendada");
            this.dispose();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR INTENTE NUEVAMENTE!!!\n" + e);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mis_clientes mc = new mis_clientes();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_cites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_cites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_cites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_cites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_cites().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    public static javax.swing.JButton btn_save;
    public static javax.swing.JButton btn_update;
    public static javax.swing.JComboBox<String> combo_examen;
    public static javax.swing.JComboBox<String> combo_hora;
    public static javax.swing.JComboBox<String> combo_tipos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static com.toedter.calendar.JDateChooser jc_date;
    public static javax.swing.JTextField txt_client;
    public static javax.swing.JTextField txt_price;
    public static javax.swing.JTextField txt_turn;
    // End of variables declaration//GEN-END:variables
}
