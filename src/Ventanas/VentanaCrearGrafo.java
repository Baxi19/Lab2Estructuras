/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.*;
import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Fabián
 */
public class VentanaCrearGrafo extends javax.swing.JFrame{
    Red red;
    int codigo = 0;
    boolean bandera = false;
    ImageIcon ic;
    private Usuario usuario;
    // public ImageIcon imagen = new ImageIcon(getClass().getResource("RouterIcon.png"));
    /**
     * Creates new form VentanaCrearGrafo
     */
   
    
    public VentanaCrearGrafo(Usuario usuario) {
       // jLabel1.setIcon(imagen);
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuario = usuario;
        this.red = new Red();
        MouseListener ml;
         ml = new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 if(e.getButton() == 1 && bandera == true){
                    System.out.println(red.insertarRouter(Integer.toString(codigo), e.getX(), e.getY()));
                    Graphics g = lienzo.getGraphics();
                    g.drawImage(new ImageIcon("src/Imagenes/RouterIcon.png").getImage(), e.getX(), e.getY(), jPanel1.getRootPane());
                    g.drawString(Integer.toString(codigo), e.getX(), e.getY());
                    codigo++;
                 }
                 
             }
             
             @Override
             public void mousePressed(MouseEvent e) {
                 
             }
             
             @Override
             public void mouseReleased(MouseEvent e) {
                 
             }
             
             @Override
             public void mouseEntered(MouseEvent e) {
                 
             }
             
             @Override
             public void mouseExited(MouseEvent e) {
                 
             }
         };
        lienzo.addMouseListener(ml);
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
        lienzo = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        destinoTextField = new javax.swing.JTextField();
        tiempoTextField = new javax.swing.JTextField();
        origenTexField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        lienzo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lienzo);
        lienzo.setBounds(22, 20, 520, 440);

        jLabel1.setText("Diagrama de red");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 0, 120, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 560, 480));

        jLabel2.setText("¿Agregar Routers?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 30));

        jButton2.setText("Crear conección");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, 30));

        jButton3.setText("Ayuda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, -1));

        jLabel5.setText("Tiempo de conección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jLabel6.setText("Router  destino:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        jLabel7.setText("Router origen:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 30));

        destinoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(destinoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, 30));
        getContentPane().add(tiempoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, 30));
        getContentPane().add(origenTexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 30));

        jButton4.setText("Listo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 100, -1));

        jButton1.setText("No");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jButton5.setText("Si");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jButton6.setText("Nuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (origenTexField.getText().isEmpty() | destinoTextField.getText().isEmpty() | tiempoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite el número de los routers.");
        }
        else {
            Router origen = red.buscarRouter(origenTexField.getText());
            Router destino = red.buscarRouter(destinoTextField.getText());
            if (origen != null && destino != null) {
                if (origen == destino) {
                    JOptionPane.showMessageDialog(rootPane, "No se puede crear una conección entre dos mismos routers.");
                    return;
                }
                if(red.buscarConeccion(origen, destino) == null){
                    int tiempo;
                    try{
                        tiempo = Integer.parseInt(tiempoTextField.getText());
                    }
                    catch(NumberFormatException exz){
                        JOptionPane.showMessageDialog(rootPane, "Digite un valor numérico en el tiempo de conección.");
                        return;
                    }                   
                    red.insertarConeccion(origen, destino, tiempo);
                    JOptionPane.showMessageDialog(rootPane, "Conección de " + origen.getId() + " a " + destino.getId() + " creada con éxito.");
                    Graphics g = lienzo.getGraphics();
                    g.drawLine(origen.getX(), origen.getY(), destino.getX() - 20, destino.getY());
                    g.drawString("♦", destino.getX() - 20, destino.getY());
                    if(origen.getX() > destino.getX() && origen.getY() - 20 > destino.getY()){
                        g.drawString(Integer.toString(tiempo), origen.getX() - Math.abs((origen.getX() - destino.getX())/2) , origen.getY() - Math.abs((origen.getY() - destino.getY())/2) );
                    }
                    if(origen.getX() < destino.getX() && origen.getY() - 20 < destino.getY()){
                        g.drawString(Integer.toString(tiempo), destino.getX() - Math.abs((origen.getX() - destino.getX())/2) , destino.getY() - Math.abs((origen.getY() - destino.getY())/2) );
                    }
                    if(origen.getX() > destino.getX() && origen.getY() - 20 < destino.getY()){
                        g.drawString(Integer.toString(tiempo), origen.getX() - Math.abs((origen.getX() - destino.getX())/2) , destino.getY() - Math.abs((origen.getY() - destino.getY())/2) );
                    }
                    if(origen.getX() < destino.getX() && origen.getY() - 20 > destino.getY()){
                        g.drawString(Integer.toString(tiempo), destino.getX() - Math.abs((origen.getX() - destino.getX())/2) , origen.getY() - Math.abs((origen.getY() - destino.getY())/2) );
                    }
                        
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Conección de " + origen.getId() + " a " + destino.getId() + " ya existe en la red.");
                }
            } 
            else {
                JOptionPane.showMessageDialog(rootPane, "No se encuentra alguno de los routers.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String ms1 = "Para agregar un router oprima el botón 'Si y seleccione en el espacio en blanco su posición con click izquierdo.";
        String ms2 = "Para crear una conección digite los datos solicitados.";
        JOptionPane.showMessageDialog(rootPane, ms1 + "\n" + ms2 + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            Graphics g = lienzo.getGraphics();
            usuario.setRegistroDeRed(red);
            capturarPantalla(usuario.getNombre());
        } catch (AWTException ex) {
            Logger.getLogger(VentanaCrearGrafo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaCrearGrafo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        bandera = true;
        jButton5.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bandera = false;
        jButton1.setEnabled(false);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Graphics g = lienzo.getGraphics();
        g.clearRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
        codigo = 0;
        red = new Red();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void destinoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private java.awt.Canvas lienzo;
    private javax.swing.JTextField origenTexField;
    private javax.swing.JTextField tiempoTextField;
    // End of variables declaration//GEN-END:variables

public void capturarPantalla(String Nombre) throws AWTException, IOException {
     BufferedImage captura = new Robot().createScreenCapture(new Rectangle(jPanel1.getX(),jPanel1.getY(), 560, 480) );
     // Save as JPEG
     File file = new File(Nombre + ".jpg");
     ImageIO.write(captura, "jpg", file);
     JOptionPane.showMessageDialog(null, "Diagrama de red guardado.");
  }

}
