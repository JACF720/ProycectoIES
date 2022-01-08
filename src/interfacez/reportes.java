package interfacez;

import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import laboratorio_clinico.conexion_MYSQL;

public class reportes extends javax.swing.JFrame {

    // Esrtablecer conexion a MYSQL
    conexion_MYSQL c = new conexion_MYSQL();
    Connection conectar = c.obtener_conexion();

    DefaultTableModel model;
    String[] Campos_tabla = {"CLIENTE", "TIPO EXAMEN", "EXAMEN", "PRECIO"};
    String[] informacion = new String[50];

    public reportes() {
        initComponents();
        this.setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        table_rc = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_r = new javax.swing.JTable();
        combo_f = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_price_r = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jc_fecha_reporte = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_rp = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_cant_p = new javax.swing.JTextField();
        btn_cancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        table_r.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Tipo Examen", "Examen", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_r);

        combo_f.setBackground(new java.awt.Color(255, 255, 255));
        combo_f.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_f.setForeground(new java.awt.Color(0, 0, 0));
        combo_f.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Reporte General", "Bioquimicos", "Hematologicos", "Hormonas", "Inmunologicos" }));
        combo_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_fActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Generar reporte por:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ganancia del Laboratorio Clínico \"Hospital Angeles\" :   $");

        txt_price_r.setBackground(new java.awt.Color(255, 255, 255));
        txt_price_r.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_price_r.setForeground(new java.awt.Color(0, 0, 0));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("Salir");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(combo_f, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_price_r, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_price_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addGap(30, 30, 30))
        );

        table_rc.addTab("REPORTES GANACIAS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jc_fecha_reporte.setBackground(new java.awt.Color(255, 255, 255));
        jc_fecha_reporte.setForeground(new java.awt.Color(0, 0, 0));
        jc_fecha_reporte.setDateFormatString("yyyy/MM/dd");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Reportes por fecha");

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table_rp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Tipo Examen", "Examen", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_rp);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pacientes atendido en  Laboratorio Clínico \"Hospital Angeles Pedregal\" :   ");

        txt_cant_p.setBackground(new java.awt.Color(255, 255, 255));
        txt_cant_p.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_cant_p.setForeground(new java.awt.Color(0, 0, 0));

        btn_cancelar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar1.setText("Salir");
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(txt_cant_p, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jc_fecha_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jc_fecha_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cant_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btn_cancelar1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        table_rc.addTab("REPORTES PACIENTES", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(table_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_fActionPerformed

        String i = combo_f.getSelectedItem().toString();
        if (i.equals("Reporte General")) {
//------------GENERAR REPORTE DE TODOS LAS CITA-------------------------------------
            try {
                String Query = "SELECT *FROM citas";
                model = new DefaultTableModel(null, Campos_tabla);
                Statement st = (Statement) conectar.createStatement();
                ResultSet rs = st.executeQuery(Query);
                while (rs.next()) {
                    informacion[0] = rs.getString("cliente");
                    informacion[1] = rs.getString("Tipo_examen");
                    informacion[2] = rs.getString("nombre_examen");
                    informacion[3] = rs.getString("precio");
                    model.addRow(informacion);
                }
                table_r.setModel(model);
//---------------------MOSTRAR PRECIO DE REPORTE---------------------------------------
                try {
                    String query = "{call reporte_precio_total()}";
                    CallableStatement st1 = conectar.prepareCall(query);
                    ResultSet rs1 = st1.executeQuery();
                    while (rs1.next()) {
                        txt_price_r.setText(rs1.getString("precio_reporte_total"));
                    }
                    table_r.setModel(model);
                } catch (SQLException ex) {
                    Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {

//------llamado de stored procedures de busqueda para nuestro reporte por nombre de examense-----------------
            try {
                String query = "{call busqueda(?)}";
                model = new DefaultTableModel(null, Campos_tabla);
                CallableStatement st = conectar.prepareCall(query);
                st.setString(1, combo_f.getSelectedItem().toString());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    informacion[0] = rs.getString("cliente");
                    informacion[1] = rs.getString("Tipo_examen");
                    informacion[2] = rs.getString("nombre_examen");
                    informacion[3] = rs.getString("precio");
                    model.addRow(informacion);
                }
                table_r.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
//-------------------------------------------------------------------------------------------------------------
            try {
                String query = "{call reporte_precio(?)}";
                CallableStatement st = conectar.prepareCall(query);
                st.setString(1, combo_f.getSelectedItem().toString());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    txt_price_r.setText(rs.getString("precio_reporte"));
                }
                table_r.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//.---------------------------------------------------------------------------------------------

    }//GEN-LAST:event_combo_fActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //llamado metodo de reporte de persona por dia
        try {
            String query = "{call reporte_persona(?)}";
            model = new DefaultTableModel(null, Campos_tabla);
            CallableStatement st = conectar.prepareCall(query);
            st.setString(1, ((JTextField) jc_fecha_reporte.getDateEditor().getUiComponent()).getText());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                informacion[0] = rs.getString("cliente");
                informacion[1] = rs.getString("Tipo_examen");
                informacion[2] = rs.getString("nombre_examen");
                informacion[3] = rs.getString("precio");
                System.out.println(rs.getString("precio"));
                model.addRow(informacion);
            }
            table_rp.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        //--------------------------------------------------------------------------------------------      

        try {
            String query = "{call ingreso_persona(?)}";

            CallableStatement st = conectar.prepareCall(query);
            st.setString(1, ((JTextField) jc_fecha_reporte.getDateEditor().getUiComponent()).getText());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                txt_cant_p.setText(rs.getString("total_persona"));

            }
            table_rp.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JComboBox<String> combo_f;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jc_fecha_reporte;
    private javax.swing.JTable table_r;
    private javax.swing.JTabbedPane table_rc;
    private javax.swing.JTable table_rp;
    private javax.swing.JTextField txt_cant_p;
    private javax.swing.JTextField txt_price_r;
    // End of variables declaration//GEN-END:variables
}
