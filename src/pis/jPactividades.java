/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

/**
 *
 * @author Astaroth
 */
public class jPactividades extends javax.swing.JPanel {

    /**
     * Creates new form jPactividades
     */
    public jPactividades() {
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
        jLabel8 = new javax.swing.JLabel();
        rSPanelVector3 = new rojeru_san.rspanel.RSPanelVector();
        jBtadministrador = new rojeru_san.rsbutton.RSButtonRound();
        jBtempleado = new rojeru_san.rsbutton.RSButtonRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableregisactivid = new rojerusan.RSTableMetro1();
        jBtgenerar = new rojeru_san.rsbutton.RSButtonRound();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelVector2.setBackground(new java.awt.Color(90, 210, 209));
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
        jLabel2.setText("Registro de actividades");
        rSPanelVector2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registro.png"))); // NOI18N
        rSPanelVector2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        rSPanelVector3.setBackground(new java.awt.Color(121, 116, 210));
        rSPanelVector3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtadministrador.setBackground(new java.awt.Color(51, 51, 51));
        jBtadministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register-machine_icon-icons.com_48487.png"))); // NOI18N
        jBtadministrador.setText("Administrador");
        jBtadministrador.setColorBorde(new java.awt.Color(43, 43, 43));
        jBtadministrador.setColorHover(new java.awt.Color(102, 102, 102));
        jBtadministrador.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSPanelVector3.add(jBtadministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 15, 160, 40));

        jBtempleado.setBackground(new java.awt.Color(51, 51, 51));
        jBtempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register-machine_icon-icons.com_48487.png"))); // NOI18N
        jBtempleado.setText("Empleado");
        jBtempleado.setColorBorde(new java.awt.Color(43, 43, 43));
        jBtempleado.setColorHover(new java.awt.Color(102, 102, 102));
        jBtempleado.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSPanelVector3.add(jBtempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 15, 160, 40));

        rSPanelVector2.add(rSPanelVector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 900, 70));

        jTableregisactivid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableregisactivid.setBackgoundHead(new java.awt.Color(121, 116, 210));
        jTableregisactivid.setBackgoundHover(new java.awt.Color(121, 116, 210));
        jTableregisactivid.setColorPrimaryText(new java.awt.Color(121, 116, 210));
        jTableregisactivid.setColorSecundaryText(new java.awt.Color(121, 116, 210));
        jTableregisactivid.setOpaque(false);
        jTableregisactivid.setSelectionBackground(new java.awt.Color(121, 116, 210));
        jScrollPane2.setViewportView(jTableregisactivid);

        rSPanelVector2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 700, 420));

        jBtgenerar.setBackground(new java.awt.Color(51, 51, 51));
        jBtgenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register-machine_icon-icons.com_48487.png"))); // NOI18N
        jBtgenerar.setText("Generar");
        jBtgenerar.setColorBorde(new java.awt.Color(43, 43, 43));
        jBtgenerar.setColorHover(new java.awt.Color(102, 102, 102));
        jBtgenerar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSPanelVector2.add(jBtgenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 160, 40));

        add(rSPanelVector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 690));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRound jBtadministrador;
    private rojeru_san.rsbutton.RSButtonRound jBtempleado;
    private rojeru_san.rsbutton.RSButtonRound jBtgenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro1 jTableregisactivid;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    private rojeru_san.rspanel.RSPanelVector rSPanelVector2;
    private rojeru_san.rspanel.RSPanelVector rSPanelVector3;
    // End of variables declaration//GEN-END:variables
}
