/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import re.dao.DAOException;
import re.dao.DAOManager;
import re.dao.bd.OracleDaoManager;
import reg.modelo.Login;

/**
 *
 * @author kriz_
 */
public class jDlgLogin extends javax.swing.JDialog {

    /**
     * Creates new form jDlgLogin
     */
    private DAOManager manager;
    private int cont;
    private String boton;

    public jDlgLogin(java.awt.Frame parent, boolean modal, DAOManager manager) {
        super(parent, modal);
        this.manager = manager;
        initComponents();
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 196, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 294, -1, 28));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 200, 30));
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 30));

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 392, 112, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserBW2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 42, 112, 168));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Playas.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 700, 518));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Login login = manager.getLoginDAO().obtenerUser(jTextField1.getText());
            try {
                if (login.getUsuario().equals(jTextField1.getText()) && login.getContraseña().equals(String.valueOf(jPasswordField2.getPassword()))) {

                    DAOManager manager = new OracleDaoManager("jdbc:oracle:thin:@localhost:1521:XE", "system", "042395");
                    int cod = 0;
                    if (login.getIdUsuario() != 0 && boton.equals("Usuario")) {
                        cod = login.getIdUsuario();
                        jDlgPerfil ventana = new jDlgPerfil(null, true, manager, cod);
                        dispose();
                        ventana.pack();
                        ventana.setVisible(true);
                    } else if (login.getIdAdmin() != 0) {
                        cod = login.getIdAdmin();
                    } else if (login.getIdAgenVenta() != 0 && boton.equals("Agente")) {
                        cod = login.getIdAgenVenta();
                        jDivistaAgente ventana = new jDivistaAgente(null, true);
                        dispose();
                        ventana.pack();
                        ventana.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene permisos para entrar al perfil deseado", "Sistema", JOptionPane.ERROR_MESSAGE);
                        jFrmPrincipal ventana = new jFrmPrincipal();
                        dispose();
                        ventana.setVisible(true);
                    }
                } else {
                    cont = cont + 1;
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta.\nLe quedan " + (3 - cont) + " intentos", "Sistema", JOptionPane.ERROR_MESSAGE);
                    if (cont == 3) {
                        jFrmPrincipal ventana = new jFrmPrincipal();
                        dispose();
                        ventana.setVisible(true);
                    }

                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(jFrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(jFrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(jDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DAOManager manager = new OracleDaoManager("jdbc:oracle:thin:@localhost:1521:XE", "system", "042395");
                    jDlgLogin dialog = new jDlgLogin(new javax.swing.JFrame(), true, manager);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(jDlgLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(jDlgLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
