package Clases;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randald Villegas 
 */
public class Arbol {
    /* Variables*/
    public static Arbol instance = null;
    //raiz del Arbol binario 
    Nodo nodo;
    boolean encontrado = false;
    /*Constructor*/
    private Arbol() {
        nodo = null;
    }
    /*Metodo para singleton*/
    public static Arbol getInstance() {
        if(instance == null){
            return instance = new Arbol();
        }
        return instance;
    }
    
    /******************************************************************************/
    // Este método principalmente llama a eliminarNodo()
    /******************************************************************************/
    public void eliminarValor(int valor) {
        nodo = eliminarNodo(nodo, valor);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda binaria */
    public Nodo eliminarNodo(Nodo nodo, int valor) {
        /* Caso base: si el árbol está vacío */
        if (nodo == null) {
            return nodo;
        }

        /* De lo contrario, repita por el Arbol*/
        if (valor < nodo.valor) {
            nodo.izquierda = eliminarNodo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminarNodo(nodo.derecha, valor);
        } //si el valor es igual que el valor de nodo, entonces este es el nodo
        
        else {
            //nodo con un solo hijo o sin hijo
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            // nodo con dos hijos: obtenga el sucesor en orden (el más pequeño en el subárbol de derecha)
            nodo.valor = valorMinimo(nodo.derecha);

            // Eliminar el sucesor en orden
            nodo.derecha = eliminarNodo(nodo.derecha, nodo.valor);
        }

        return nodo;
    }
    
    public  int valorMinimo(Nodo nodo) {
        int menorValor = nodo.valor;
        while (nodo.izquierda != null) {
            menorValor = nodo.izquierda.valor;
            nodo = nodo.izquierda;
        }
        return menorValor;
    }
    /******************************************************************************/
    // Este método principalmente llama a insertarValorRecibido()
    /******************************************************************************/
    public void insertar(int valor, String nombre) {
        nodo = insertarValorRecibido(nodo, valor, nombre);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda Binaria */
    public Nodo insertarValorRecibido(Nodo nodo, int valor, String nombre) {

        /* Si el árbol está vacío, devuelve un nuevo nodo*/
        if (nodo == null) {
            nodo = new Nodo(valor, nombre);
            return nodo;
        }
        /*Si el numero de cedula existe, no lo deja registrarse*/
        if (valor == nodo.getValor()) {
            JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado");
            return nodo; 
        }
        /* De lo contrario, repita por el Arbol */
        if (valor < nodo.valor) {
            nodo.izquierda = insertarValorRecibido(nodo.izquierda, valor,nombre);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarValorRecibido(nodo.derecha, valor, nombre );
        }

        /* devolver el puntero del nodo (sin modificar) */
        return nodo;
    }
    /******************************************************************************/
    // Este método principalmente llama a recorridoPreOrden()
    /******************************************************************************/
    public void preOrden() {
        recorridoPreOrden(nodo);
    }

    // Una función de utilidad para hacer el recorrido en preorden de Arbol de busqueda binaria
    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            
            recorridoPreOrden(nodo.izquierda);
            System.out.print("Nombre :"+ nodo.getNombre() + " "+ nodo.valor + " | ");
            recorridoPreOrden(nodo.derecha);
            
        }
    }
    
}
