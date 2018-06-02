package Clases;

import Ventanas.VentanaInicio;
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
    Usuario usuario;
    Usuario usuarioAux;
    boolean encontrado ;
    /*Constructor*/
    private Arbol() {
        usuario = null;
        this.encontrado = false;
        this.usuarioAux = usuarioAux;
    }
    /*Metodo para singleton*/
    public static Arbol getInstance() {
        if(instance == null){
            return instance = new Arbol();
        }
        return instance;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public Usuario getUsuarioAux() {
        return usuarioAux;
    }

    public void setUsuarioAux(Usuario usuarioAux) {
        this.usuarioAux = usuarioAux;
    }
    
    
    
    /******************************************************************************/
    // Este método principalmente llama a eliminarNodo()
    /******************************************************************************/
    public void eliminarValor(int valor) {
        usuario = eliminarNodo(usuario, valor);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda binaria */
    public Usuario eliminarNodo(Usuario usuario, int valor) {
        /* Caso base: si el árbol está vacío */
        if (usuario == null) {
            return usuario;
        }

        /* De lo contrario, repita por el Arbol*/
        if (valor < usuario.valor) {
            usuario.izquierda = eliminarNodo(usuario.izquierda, valor);
        } else if (valor > usuario.valor) {
            usuario.derecha = eliminarNodo(usuario.derecha, valor);
        } //si el valor es igual que el valor de usuario, entonces este es el usuario
        
        else {
            //nodo con un solo hijo o sin hijo
            if (usuario.izquierda == null) {
                return usuario.derecha;
            } else if (usuario.derecha == null) {
                return usuario.izquierda;
            }

            // usuario con dos hijos: obtenga el sucesor en orden (el más pequeño en el subárbol de derecha)
            usuario.valor = valorMinimo(usuario.derecha);

            // Eliminar el sucesor en orden
            usuario.derecha = eliminarNodo(usuario.derecha, usuario.valor);
        }

        return usuario;
    }
    
    public  int valorMinimo(Usuario usuario) {
        int menorValor = usuario.valor;
        while (usuario.izquierda != null) {
            menorValor = usuario.izquierda.valor;
            usuario = usuario.izquierda;
        }
        return menorValor;
    }
    /******************************************************************************/
    // Este método principalmente llama a insertarValorRecibido()
    /******************************************************************************/
    public void insertar(int valor, String nombre) {
        usuario = insertarValorRecibido(usuario, valor, nombre);
    }

    /* Una función recursiva para insertar un nuevo valor en Arbol de busqueda Binaria */
    public Usuario insertarValorRecibido(Usuario usuario, int valor, String nombre) {

        /* Si el árbol está vacío, devuelve un nuevo usuario*/
        if (usuario == null) {
            usuario = new Usuario(valor, nombre);
            return usuario;
        }
        /*Si el numero de cedula existe, no lo deja registrarse*/
        if (valor == usuario.getValor()) {
            JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado");
            encontrado = true;
            return usuario; 
        }
        /* De lo contrario, repita por el Arbol */
        if (valor < usuario.valor) {
            usuario.izquierda = insertarValorRecibido(usuario.izquierda, valor,nombre);
        } else if (valor > usuario.valor) {
            usuario.derecha = insertarValorRecibido(usuario.derecha, valor, nombre );
        }

        /* devolver el puntero del usuario (sin modificar) */
        return usuario;
    }
    /******************************************************************************/
    // Este método principalmente llama a recorridoPreOrden()
    /******************************************************************************/
    public void preOrden() {
        recorridoPreOrden(usuario);
    }

    // Una función de utilidad para hacer el recorrido en preorden de Arbol de busqueda binaria
    public void recorridoPreOrden(Usuario usuario) {
        if (usuario != null) {
            
            recorridoPreOrden(usuario.izquierda);
            System.out.print("Nombre :"+ usuario.getNombre() + " "+ usuario.valor + " | ");
            recorridoPreOrden(usuario.derecha);
            
        }
    }
    /******************************************************************************/
    // Este método es para salir del sistema
    /******************************************************************************/
    public void cerrarSistema(){
    
        try {
            int dialoButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Deseas salir del sistema?", "Salir", dialoButton);
            if (result == 0) {
                System.exit(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /******************************************************************************/
    // Este método es para verificar los datos y ingresar al juego
    /******************************************************************************/
    public void verificarUsuario(int valor, String nombre) {
        usuario = verificarValorRecibido(usuario, valor, nombre);
    }
    
    public Usuario verificarValorRecibido(Usuario usuario, int valor, String nombre){
        /* Si el árbol está vacío, devuelve un mensaje*/
        if (usuario == null) {
             JOptionPane.showMessageDialog(null, "No existen Usuarios Registrados");
            return usuario;
        }
        /*Si el numero de cedula existe, no lo deja registrarse*/
        if (valor == usuario.getValor()) {
            Arbol.getInstance().setUsuarioAux(usuario); 
            VentanaInicio vn = new VentanaInicio();
            vn.setVisible(true);
            return usuario; 
        }
        /* De lo contrario, repita por el Arbol */
        if (valor < usuario.valor) {
            usuario.izquierda = insertarValorRecibido(usuario.izquierda, valor,nombre);
        } else if (valor > usuario.valor) {
            usuario.derecha = insertarValorRecibido(usuario.derecha, valor, nombre );
        }

        /* devolver el puntero del usuario (sin modificar) */
        return usuario;
    }

}
