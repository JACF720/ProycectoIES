
package interfacez;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import laboratorio_clinico.conexion_MYSQL;
import laboratorio_clinico.encoder;


public class user_access extends javax.swing.JFrame {
    encoder mEncoder = new encoder();

    //Creacion de metodo para ingresar con un usuario existente en la 
    //base de datos
    public void acceso() {
        conexion_MYSQL c = new conexion_MYSQL();
        Connection conectar = c.obtener_conexion();    
        
        int contador = 1;
        
        
        String user = txt_user.getText();
        String passw =mEncoder.ecnode(txt_password.getText().trim());
        System.out.println(passw);
        
        //Query para seleciconar un usuario a la base de datos
        String sql = "SELECT * FROM usuarios WHERE nom_usuario='" + user + "'AND contraseña='" + passw + "'";
        try {
            //creamos un aconexion a la base de datos
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {

                if (contador == 1) {
                    JOptionPane.showMessageDialog(null, "Bienvenido a <Hospital Angeles Pedregal> Labortorio Clínico.");
                    Home h = new Home();
                    h.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no son correctos \n Intente nuevamente.");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }

    public user_access() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setBackground(new java.awt.Color(255, 255, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASSWORD:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USER:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ACCEDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Iniciar Sesión");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_i.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        acceso();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(user_access.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_access.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_access.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_access.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_access().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField txt_password;
    public static javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
