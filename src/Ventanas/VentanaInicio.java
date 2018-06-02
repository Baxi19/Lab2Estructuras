/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Arbol;
import javax.swing.JOptionPane;

/**
 *
 * @author toshib
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaInicio() {
        initComponents();
        this.setSize(1000,600);
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jButtonOff = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonIngresar1 = new javax.swing.JButton();
        jButtonIngresar2 = new javax.swing.JButton();
        jButtonIngresar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoInicio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(40, 1, 75));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jButtonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jButtonIngresar.setBorder(null);
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setContentAreaFilled(false);
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.setRequestFocusEnabled(false);
        jButtonIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseClicked(evt);
            }
        });
        jPanel2.add(jButtonIngresar);
        jButtonIngresar.setBounds(310, 390, 60, 60);

        jButtonOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off1.png"))); // NOI18N
        jButtonOff.setBorder(null);
        jButtonOff.setBorderPainted(false);
        jButtonOff.setContentAreaFilled(false);
        jButtonOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOff.setRequestFocusEnabled(false);
        jButtonOff.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off2.png"))); // NOI18N
        jButtonOff.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off2.png"))); // NOI18N
        jButtonOff.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off2.png"))); // NOI18N
        jButtonOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOffMouseClicked(evt);
            }
        });
        jPanel2.add(jButtonOff);
        jButtonOff.setBounds(320, 20, 60, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 148, 148));
        jLabel3.setText("Bienvenido");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 20, 230, 100);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crear Registro de Red");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 120, 250, 50);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ver Diagramas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 400, 250, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eliminar Red");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 210, 250, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Realizar Pruebas");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 300, 250, 50);

        jButtonIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jButtonIngresar1.setBorder(null);
        jButtonIngresar1.setBorderPainted(false);
        jButtonIngresar1.setContentAreaFilled(false);
        jButtonIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar1.setRequestFocusEnabled(false);
        jButtonIngresar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresar1MouseClicked(evt);
            }
        });
        jPanel2.add(jButtonIngresar1);
        jButtonIngresar1.setBounds(310, 120, 60, 60);

        jButtonIngresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jButtonIngresar2.setBorder(null);
        jButtonIngresar2.setBorderPainted(false);
        jButtonIngresar2.setContentAreaFilled(false);
        jButtonIngresar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar2.setRequestFocusEnabled(false);
        jButtonIngresar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresar2MouseClicked(evt);
            }
        });
        jPanel2.add(jButtonIngresar2);
        jButtonIngresar2.setBounds(310, 210, 60, 60);

        jButtonIngresar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jButtonIngresar3.setBorder(null);
        jButtonIngresar3.setBorderPainted(false);
        jButtonIngresar3.setContentAreaFilled(false);
        jButtonIngresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar3.setRequestFocusEnabled(false);
        jButtonIngresar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar2.png"))); // NOI18N
        jButtonIngresar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresar3MouseClicked(evt);
            }
        });
        jPanel2.add(jButtonIngresar3);
        jButtonIngresar3.setBounds(310, 300, 60, 60);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOffMouseClicked
      //Para salir del sistema
        Arbol.getInstance().cerrarSistema();
    }//GEN-LAST:event_jButtonOffMouseClicked

    private void jButtonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseClicked
        
        //Arbol.getInstance().verificarUsuario(Integer.parseInt(jPasswordFieldContraseña.getText()), jTextFieldNombre.getText());
    }//GEN-LAST:event_jButtonIngresarMouseClicked

    private void jButtonIngresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresar1MouseClicked
       VentanaCrearGrafo vg = new VentanaCrearGrafo(Arbol.getInstance().getUsuarioAux());
       vg.setVisible(true);
    }//GEN-LAST:event_jButtonIngresar1MouseClicked

    private void jButtonIngresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresar2MouseClicked

    private void jButtonIngresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresar3MouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonIngresar1;
    private javax.swing.JButton jButtonIngresar2;
    private javax.swing.JButton jButtonIngresar3;
    private javax.swing.JButton jButtonOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
