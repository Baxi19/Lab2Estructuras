/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Fabián
 */
public class Red {
    private Router grafo;
    private ImageIcon imagen;
    
    // constructor
    public Red() {
        this.grafo = null;
        this.imagen = null;
        
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
       
            // metodo para insertar Vertice al inicio
    public String insertarRouter(String codigo, int x, int y) { // recibe por parámetros la información del nuevo vértice 
        Router nuevoRouter = new Router(codigo, x, y);       // crea el nuevo Vertice con los parametros recibidos
        if (grafo == null) {                              // si el grafo está vacío...
            grafo = nuevoRouter;                                // nuevo grafo apunta a la variable grafo
            return "Red creada";                      // retorna true luego de insertar
        }
        if (buscarRouter(codigo) == null) {                     // si el grafo no está vacío y el vértice creado no existe...
            nuevoRouter.setSigRouter(grafo);              // el nuevo inicio será el nuevo vértice
            grafo = nuevoRouter;
            return "Router " +  codigo + ", insertado al inicio";                 // retorna true luego de insertar
        }
        return "Repetido";                                // si no cumple ninguna condición retorna false
    }
    
    
    // metodo para insertar los arcos al inicio
    public String insertarConeccion(Router origen, Router destino, int tiempo) { // se reciben los dos arcos donde se insertara el arco de por medio
        if (buscarConeccion(origen, destino) == null) {                     // si el arco no existe...
            Coneccion nuevaConeccion = new Coneccion(tiempo);                               // crea el nuevo arco con el peso recibido por parámetros
            nuevaConeccion.setDestino(destino);                                   // le asigna el destino al nuevo arco
            if (origen.getSigConeccion() == null) {                              // si el origen no tiene ningon arco "saliendo" de él...
                origen.setSigConeccion(nuevaConeccion);                               // el vertice origen apunta al nuevo arco
            } 
            else {                                                   // si ya posee algún arco entonces inserta el nuevo arco al inicio y mueve el puntero
                nuevaConeccion.setSigConeccion(origen.getSigConeccion());                        // nuevo arco apunta al siguiente arco del origen
                origen.setSigConeccion(nuevaConeccion);                               // el nuevo "inicio" es el nuevo arco
            }
            return "Inserición entre: Router " + origen.getId() + " y Router " + destino.getId() + " correctamente establecida";                                        // retorna true en señal que se insertó el nuevo vértice
        }                                                              // si el arco ya existe...
        return "Inserición denegada: conección ya existente entre Route " + origen.getId() + " y Router " + destino.getId();                                  // retorna false en señal de que no fue insertado por motivo de no repetirse ningún arco
    }

    
     // Método para buscar un vértice por su nombre en el grafo
    public Router buscarRouter(String codigo) { // recibe el nombre del vértice a buscar
        Router temp = grafo; // variable temporal de tipo Vertice
        while (temp != null) { // ciclo para recorrer los vértices del grafo           
            if (temp.getId().equals(codigo)) { // si el nombre del grafo actual es igual al nombre buscado
                return temp; // retorna el grafo actual
            } // de lo contrario...
            temp = temp.getSigRouter(); // apunta al siguiente vértice para continuar la búsqueda
        } // si temp llega a ser null
        return null; // se retorna null en señal que el vértice no fue encontrado en el grafo
    }
    
    // método para buscar un Arco en el grafo
    public Coneccion buscarConeccion(Router origen, Router destino) {  // recibe por parámetros el Vertice origen y destino del Arco a buscar
        Coneccion temp = origen.getSigConeccion();                         // obtiene el arco del vertice origen
        while (temp != null) {                                 // ciclo para recorrer la sub lista de arcos
            if (temp.getDestino() == destino) {                     // si el destino del arco actual es igual al destino recibido por parametros
                return temp;                                   // retorna el arco actualmencontrado
            }                                                  // si no...
            temp = temp.getSigConeccion();                               // avanza al siguiente arco para hacer la búsqueda
        }                                                      //si se sale del ciclo...
        return null;                                           // retorna null en señal de que no se encontro el arco
    }

}
