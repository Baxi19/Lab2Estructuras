package Clases;

import Ventanas.VentanaRegistro;


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
        VentanaRegistro ventana  = new VentanaRegistro();
        ventana.setVisible(true);
        
        
        // TODO code application logic here
        //Arbol arbol = new Arbol();

        /*se crea un  arbol de busqueda binaria
                    50
                    /\
		  30  70
		  / \  / \
		 20 40 60 80 
         */
        //El primero es la raiz
        
       /* Arbol.getInstance().insertar(50);
        //
        Arbol.getInstance().insertar(30);
        Arbol.getInstance().insertar(70);
        Arbol.getInstance().insertar(20);
        Arbol.getInstance().insertar(40);
        Arbol.getInstance().insertar(60);
        Arbol.getInstance().insertar(80);

        System.out.println("Recorrido del árbol creado");
        Arbol.getInstance().preOrden();

        System.out.println("\n Eliminamos el 20");
        Arbol.getInstance().eliminarValor(20);
        System.out.println("Recorrido del árbol al modificado");
        Arbol.getInstance().preOrden();

        System.out.println("\n Eliminamos el 30");
        Arbol.getInstance().eliminarValor(30);
        System.out.println("Recorrido del árbol al modificado");
        Arbol.getInstance().preOrden();

        System.out.println("\n Eliminamos el 50");
        Arbol.getInstance().eliminarValor(50);
        System.out.println("Recorrido del árbol al modificado");
        Arbol.getInstance().preOrden();   */
    }
    
}
