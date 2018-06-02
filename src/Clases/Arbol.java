package Clases;

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
    //Raiz del Arbol binario 
    Nodo raiz;
    /*Constructor*/
    private Arbol() {
        raiz = null;
    }
    /*Metodo para singleton*/
    public static Arbol getInstance() {
        if(instance == null){
            return instance = new Arbol();
        }
        return instance;
    }
    
    // Este método principalmente llama a eliminarNodo()
    public void eliminarValor(int valor) {
        raiz = eliminarNodo(raiz, valor);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda binaria */
    public Nodo eliminarNodo(Nodo raiz, int valor) {
        /* Caso base: si el árbol está vacío */
        if (raiz == null) {
            return raiz;
        }

        /* De lo contrario, repita por el Arbol*/
        if (valor < raiz.valor) {
            raiz.izquierda = eliminarNodo(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = eliminarNodo(raiz.derecha, valor);
        } //si el valor es igual que el valor de raiz, entonces este es el nodo
        // que se va a eliminar
        else {
            //nodo con un solo hijo o sin hijo
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }

            // nodo con dos hijos: obtenga el sucesor en orden (el más pequeño en el subárbol de derecha)
            raiz.valor = valorMinimo(raiz.derecha);

            // Eliminar el sucesor en orden
            raiz.derecha = eliminarNodo(raiz.derecha, raiz.valor);
        }

        return raiz;
    }

    public  int valorMinimo(Nodo raiz) {
        int menorValor = raiz.valor;
        while (raiz.izquierda != null) {
            menorValor = raiz.izquierda.valor;
            raiz = raiz.izquierda;
        }
        return menorValor;
    }

    // Este método principalmente llama a insertarValorRecibido()
    public void insertar(int valor) {
        raiz = insertarValorRecibido(raiz, valor);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda Binaria */
    public Nodo insertarValorRecibido(Nodo raiz, int valor) {

        /* Si el árbol está vacío, devuelve un nuevo nodo*/
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        /* De lo contrario, repita por el Arbol */
        if (valor < raiz.valor) {
            raiz.izquierda = insertarValorRecibido(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertarValorRecibido(raiz.derecha, valor);
        }

        /* devolver el puntero del nodo (sin modificar) */
        return raiz;
    }

    // Este método principalmente llama a recorridoPreOrden()
    public void preOrden() {
        recorridoPreOrden(raiz);
    }

    // Una función de utilidad para hacer el recorrido inorden de Arbol de busqueda binaria
    public void recorridoPreOrden(Nodo raiz) {
        if (raiz != null) {
            recorridoPreOrden(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            recorridoPreOrden(raiz.derecha);
        }
    }
    
    
    
}
