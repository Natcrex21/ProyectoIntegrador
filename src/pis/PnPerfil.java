/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import re.dao.DAOException;
import re.dao.DAOManager;
import reg.modelo.Empleado;
import reg.modelo.Login;

/**
 *
 * @author Astaroth
 */
public class PnPerfil extends javax.swing.JPanel {

    /**
     * Creates new form PnPerfil
     */
    
    private DAOManager manager;
    private Empleado empleado;
    private Login login;
    private boolean editable;
    Empleado2 ventana2;//Poner mi ventana 
    
    public Empleado2 getVentana2() {
        return ventana2;
    }

    public void setVentana2(Empleado2 ventana2) {
        this.ventana2 = ventana2;
    }
    
    public DAOManager getManager() {
        return manager;
    }

    public void setManager(DAOManager manager) {
        this.manager = manager;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public boolean isEditable() {
        return editable;
    }

    //Metodos getter and setter
    public void setEditable(boolean editable) {   
        this.editable = editable;
        this.jTxidempleado.setEditable(false);
        this.jTxcedula.setEditable(false);
        this.jTxnombres.setEditable(editable);
        this.jTxapellidos.setEditable(editable);
        this.jTxtelefono.setEditable(editable);
        this.jTxdireccion.setEditable(editable);
        this.jTcorreo.setEditable(editable);
        this.jTxsexo.setEnabled(false);
        this.jTxciudad.setEditable(editable);
        this.Jpscont.setEditable(editable);
    }
    public void loadData() {
        if (empleado != null) {
            this.jTxidempleado.setText(empleado.getCod_empleado()+"");
            this.jTxnombres.setText(empleado.getNombres());
            this.jTxapellidos.setText(empleado.getApellidos());
            this.jTxcedula.setText(empleado.getCedula());
            this.jTxtelefono.setText(empleado.getTelefono());
            this.jTxdireccion.setText(empleado.getDireccion());
            this.jTcorreo.setText(empleado.getCorreo());
            this.jTxsexo.setText(empleado.getSexo());
            this.jTxciudad.setText(empleado.getCiudad());
            this.Jpscont.setText(login.getContraseña());
        }else {
            this.jTxidempleado.setText("");
            this.jTxnombres.setText("");
            this.jTxapellidos.setText("");
            this.jTxcedula.setText("");
            this.jTxtelefono.setText("");
            this.jTxdireccion.setText("");
            this.jTcorreo.setText("");
            this.jTxsexo.setText("");
            this.jTxciudad.setText("");
            this.Jpscont.setText("");
            
        }

        this.jTxidempleado.requestFocus();
    }
    public void saveData() {
        empleado.setCod_empleado(Integer.parseInt(jTxidempleado.getText()));
        empleado.setNombres(this.jTxnombres.getText());
        empleado.setApellidos(this.jTxapellidos.getText());
        empleado.setCedula(this.jTxcedula.getText());
        empleado.setTelefono(this.jTxtelefono.getText());       
        empleado.setDireccion(this.jTxdireccion.getText());
        empleado.setCorreo(this.jTcorreo.getText());
        empleado.setSexo(this.jTxsexo.getText());
        empleado.setCiudad(this.jTxciudad.getText());
    }

    public PnPerfil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelVector2 = new rojeru_san.rspanel.RSPanelVector();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxsexo = new rojeru_san.RSMTextFull();
        jLabel5 = new javax.swing.JLabel();
        jTxcedula = new rojeru_san.RSMTextFull();
        jLbeliminarcuenta = new javax.swing.JLabel();
        jTxnombres = new rojeru_san.RSMTextFull();
        jLabel7 = new javax.swing.JLabel();
        jTxidempleado = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        jTxtelefono = new rojeru_san.RSMTextFull();
        jLabel9 = new javax.swing.JLabel();
        jTxciudad = new rojeru_san.RSMTextFull();
        jLabel10 = new javax.swing.JLabel();
        jTxdireccion = new rojeru_san.RSMTextFull();
        jLabel11 = new javax.swing.JLabel();
        jTxapellidos = new rojeru_san.RSMTextFull();
        JBTguardar = new rojeru_san.rsbutton.RSButtonRound();
        jLabel12 = new javax.swing.JLabel();
        jbtactualizar = new rojeru_san.rsbutton.RSButtonRound();
        jLabel13 = new javax.swing.JLabel();
        jTcorreo = new rojeru_san.RSMTextFull();
        Jpscont = new rojeru_san.RSMPassView();

        setBackground(new java.awt.Color(204, 204, 204));

        rSPanelVector2.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelVector2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelHora1.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelHora1.setForeground(new java.awt.Color(51, 51, 51));
        rSPanelVector2.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1061, 0, 81, 29));

        rSLabelFecha1.setForeground(new java.awt.Color(51, 51, 51));
        rSPanelVector2.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 2, 79, 27));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Date:");
        rSPanelVector2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 2, -1, 27));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datos de empleado");
        rSPanelVector2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Phone.png"))); // NOI18N
        rSPanelVector2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");
        rSPanelVector2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 20));

        jTxsexo.setBackground(new java.awt.Color(204, 204, 204));
        jTxsexo.setForeground(new java.awt.Color(51, 51, 51));
        jTxsexo.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxsexo.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxsexo.setPlaceholder("Sexo");
        jTxsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxsexoActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 250, 33));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sexo.png"))); // NOI18N
        rSPanelVector2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jTxcedula.setBackground(new java.awt.Color(204, 204, 204));
        jTxcedula.setForeground(new java.awt.Color(51, 51, 51));
        jTxcedula.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxcedula.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxcedula.setPlaceholder("No cedula");
        jTxcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxcedulaActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, 40));

        jLbeliminarcuenta.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLbeliminarcuenta.setForeground(new java.awt.Color(51, 51, 51));
        jLbeliminarcuenta.setText("Eliminar cuenta");
        jLbeliminarcuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbeliminarcuentaMouseClicked(evt);
            }
        });
        rSPanelVector2.add(jLbeliminarcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, -1, -1));

        jTxnombres.setBackground(new java.awt.Color(204, 204, 204));
        jTxnombres.setForeground(new java.awt.Color(51, 51, 51));
        jTxnombres.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxnombres.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxnombres.setPlaceholder("Nombres completos");
        jTxnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxnombresActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 250, 33));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password_3715.png"))); // NOI18N
        rSPanelVector2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 40, 40));

        jTxidempleado.setBackground(new java.awt.Color(204, 204, 204));
        jTxidempleado.setForeground(new java.awt.Color(51, 51, 51));
        jTxidempleado.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxidempleado.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxidempleado.setPlaceholder("Id empleado");
        jTxidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxidempleadoActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 32));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Idjob.png"))); // NOI18N
        rSPanelVector2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jTxtelefono.setBackground(new java.awt.Color(204, 204, 204));
        jTxtelefono.setForeground(new java.awt.Color(51, 51, 51));
        jTxtelefono.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxtelefono.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxtelefono.setPlaceholder("Teléfono");
        jTxtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtelefonoActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, 32));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ciudad.png"))); // NOI18N
        rSPanelVector2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 40, 40));

        jTxciudad.setBackground(new java.awt.Color(204, 204, 204));
        jTxciudad.setForeground(new java.awt.Color(51, 51, 51));
        jTxciudad.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxciudad.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxciudad.setPlaceholder("Ciudad");
        jTxciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxciudadActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, 32));

        jLabel10.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        rSPanelVector2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 40, 40));

        jTxdireccion.setBackground(new java.awt.Color(204, 204, 204));
        jTxdireccion.setForeground(new java.awt.Color(51, 51, 51));
        jTxdireccion.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxdireccion.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxdireccion.setPlaceholder("Dirección");
        jTxdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxdireccionActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, 32));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Idcard.png"))); // NOI18N
        rSPanelVector2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jTxapellidos.setBackground(new java.awt.Color(204, 204, 204));
        jTxapellidos.setForeground(new java.awt.Color(51, 51, 51));
        jTxapellidos.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTxapellidos.setBotonColor(new java.awt.Color(51, 51, 51));
        jTxapellidos.setPlaceholder("Apellidos completos");
        jTxapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxapellidosActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTxapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 250, 33));

        JBTguardar.setBackground(new java.awt.Color(0, 0, 0));
        JBTguardar.setText("Guardar datos ");
        JBTguardar.setColorBorde(new java.awt.Color(43, 43, 43));
        JBTguardar.setColorHover(new java.awt.Color(51, 51, 51));
        JBTguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTguardarActionPerformed(evt);
            }
        });
        rSPanelVector2.add(JBTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Nombres");
        rSPanelVector2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jbtactualizar.setBackground(new java.awt.Color(0, 0, 0));
        jbtactualizar.setText("Actualizar datos");
        jbtactualizar.setColorBorde(new java.awt.Color(43, 43, 43));
        jbtactualizar.setColorHover(new java.awt.Color(51, 51, 51));
        rSPanelVector2.add(jbtactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newpost_email_3297.png"))); // NOI18N
        rSPanelVector2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 40, 40));

        jTcorreo.setBackground(new java.awt.Color(204, 204, 204));
        jTcorreo.setForeground(new java.awt.Color(51, 51, 51));
        jTcorreo.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        jTcorreo.setBotonColor(new java.awt.Color(51, 51, 51));
        jTcorreo.setPlaceholder("Correo Electronico");
        jTcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcorreoActionPerformed(evt);
            }
        });
        rSPanelVector2.add(jTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 32));

        Jpscont.setBackground(new java.awt.Color(204, 204, 204));
        Jpscont.setForeground(new java.awt.Color(51, 51, 51));
        Jpscont.setBordeColorFocus(new java.awt.Color(51, 51, 51));
        Jpscont.setBotonColor(new java.awt.Color(51, 51, 51));
        rSPanelVector2.add(Jpscont, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelVector2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(rSPanelVector2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxsexoActionPerformed

    private void jTxcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxcedulaActionPerformed

    private void jTxnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxnombresActionPerformed

    private void jTxidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxidempleadoActionPerformed

    private void jTxtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtelefonoActionPerformed

    private void jTxciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxciudadActionPerformed

    private void jTxdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxdireccionActionPerformed

    private void jTxapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxapellidosActionPerformed

    private void jTcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcorreoActionPerformed

    private void jLbeliminarcuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbeliminarcuentaMouseClicked
        // TODO add your handling code here:
        try {
            int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar sus datos?", "Mensaje del Sistema",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (n == JOptionPane.OK_OPTION) {
                manager.getLoginDAO().eliminar(login);
                manager.getEmpleadoDAO().eliminar(empleado);
                ventana2.dispose();
                jFrmPrincipal ventana = new jFrmPrincipal();
                ventana.setVisible(true);
                ventana.pack();
            }
        } catch (DAOException ex) {
            Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLbeliminarcuentaMouseClicked

    private void JBTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTguardarActionPerformed
        // TODO add your handling code here:
        saveData();
        try {
            manager.getEmpleadoDAO().modificar(empleado);
            JOptionPane.showMessageDialog(null, "Se ha actualizado su información", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (DAOException ex) {
            Logger.getLogger(PnPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBTguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRound JBTguardar;
    private rojeru_san.RSMPassView Jpscont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbeliminarcuenta;
    private rojeru_san.RSMTextFull jTcorreo;
    private rojeru_san.RSMTextFull jTxapellidos;
    private rojeru_san.RSMTextFull jTxcedula;
    private rojeru_san.RSMTextFull jTxciudad;
    private rojeru_san.RSMTextFull jTxdireccion;
    private rojeru_san.RSMTextFull jTxidempleado;
    private rojeru_san.RSMTextFull jTxnombres;
    private rojeru_san.RSMTextFull jTxsexo;
    private rojeru_san.RSMTextFull jTxtelefono;
    private rojeru_san.rsbutton.RSButtonRound jbtactualizar;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    private rojeru_san.rspanel.RSPanelVector rSPanelVector2;
    // End of variables declaration//GEN-END:variables
}
