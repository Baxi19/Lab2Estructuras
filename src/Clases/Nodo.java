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
public class Nodo {

    /* Clase que contiene el hijo de izquierda y derecha del nodo actual y valor de valor */
 /*Variables*/
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}

