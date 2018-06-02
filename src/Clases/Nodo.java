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
    String nombre;
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int valor, String nombre) {
        this.nombre = nombre;
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", valor=" + valor + ", izquierda=" + izquierda + ", derecha=" + derecha + '}';
    }

      
}

