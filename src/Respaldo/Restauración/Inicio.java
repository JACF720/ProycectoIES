package Respaldo.Restauración;

import static Respaldo.Restauración.conexionbd.passsql;
import interfacez.user_access;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
    
    public String usr;
    public String pss;
    public static String bd;
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Usuariotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Contraseñatxt = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lexend Deca", 0, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jButton1.setText("INICIAR SESIÓN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        Usuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuariotxtKeyPressed(evt);
            }
        });
        getContentPane().add(Usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, -1));

        jLabel2.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Contraseñatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñatxtKeyPressed(evt);
            }
        });
        getContentPane().add(Contraseñatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, -1));

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 40, 30));

        jLabel4.setText("BD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        BD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BDKeyPressed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Usuariotxt.getText().equals("") || Contraseñatxt.getText().equals("") || BD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No dejar campos vacios.", "Aviso!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                conexionbd a = new conexionbd();
                Respaldo exp = new Respaldo();
                user_access in = new user_access();
                String user, psw, bd;
                user = Usuariotxt.getText();
                psw = Contraseñatxt.getText();
                bd= BD.getText();
                setBD(bd);
                a.ValidarUs(user, psw);
                a.ConectarBasedeDatos();
//                exp.Restauración(user, psw);
                exp.Respaldo(user, psw);
                in.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static String getBD() {
        return bd;
    }

    public void setBD(String bd) {
        this.bd = bd;
    }
    private void UsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuariotxtKeyPressed
        // TODO add your handling code here:
        if (Usuariotxt.getText().equals("")) {
            // cadena no está vacía
            Usuariotxt.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Contraseñatxt.requestFocus();
            }
        }
    }//GEN-LAST:event_UsuariotxtKeyPressed

    private void ContraseñatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñatxtKeyPressed
        // TODO add your handling code here:
        if (Contraseñatxt.getText().equals("")) {
            // cadena no está vacía
            Contraseñatxt.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                BD.requestFocus();
            }
        }
    }//GEN-LAST:event_ContraseñatxtKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        conexionbd a = new conexionbd();
        a.DesconectarBasedeDatos();
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDActionPerformed

    private void BDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BDKeyPressed
        // TODO add your handling code here:
        if (BD.getText().equals("")) {
            // cadena no está vacía
            BD.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Usuariotxt.requestFocus();
            }
        }
    }//GEN-LAST:event_BDKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BD;
    private javax.swing.JPasswordField Contraseñatxt;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
