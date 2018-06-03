package Clases;

import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randald Villegas
 */
public class Usuario {

    /* Clase que contiene el hijo de izquierda y derecha del nodo actual y valor de valor */
 /*Variables*/
    private String nombre;
    public int valor;
    public Usuario izquierda;
    public Usuario derecha;
    public Red registroDeRed;
    public int contadorScreen;
    

    public Usuario( int valor, String nombre) {
        this.nombre = nombre;
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
        this.registroDeRed = null;
        this.contadorScreen = 0;
        
    }

    

    

    public int getContadorScreen() {
        return contadorScreen;
    }

    public void setContadorScreen(int contadorScreen) {
        this.contadorScreen = contadorScreen;
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

    public Red getRegistroDeRed() {
        return registroDeRed;
    }

    public void setRegistroDeRed(Red registroDeRed) {
        this.registroDeRed = registroDeRed;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", valor=" + valor + ", izquierda=" + izquierda + ", derecha=" + derecha + '}';
    }
    
    
}

