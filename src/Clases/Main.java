package Clases;

import Ventanas.VentanaLogin;
import Ventanas.VentanaRegistro;
import java.io.File;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombresUsuarios = new ArrayList<>();
        String aux = "";
        nombresUsuarios.add("AB");
        nombresUsuarios.add("BC");
        nombresUsuarios.add("CD");
        System.out.println("Tamaño arrayList" + nombresUsuarios.size());
      //  ArrayList<String> nombresUsuarios = primerUsuario.registroDeRed.obtenerNombresDeRouters();
        
        for (int i = 0; i < nombresUsuarios.size(); i++) {
            String s = nombresUsuarios.get(i);
            s.charAt(0);
            System.out.println("Chart at :" + s.charAt(0));
            
            aux += s.charAt(0);       
        }
        System.out.println(aux);
    
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true); 
    }
} 

 
