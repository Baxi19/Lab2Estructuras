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
    
    
    // Método para eliminar un arco de un grafo
   public boolean eliminarConeccion(Router origen, Router destino){ // recibe por parametros el origen y el destino que conforman el arco
        if(origen.getSigConeccion()==null){   // si el origen no tiene arcos...
            System.out.println("No hay arcos"); // imprime no hay arcos en consola
            return false;}  // retorna false en señal que no se eliminó
        if(origen.getSigConeccion().getDestino() == destino){ // si el primer arco de la sublista es el arco a borrar...
            origen.setSigConeccion(origen.getSigConeccion().getSigConeccion()); // desenlaza el arco de los 
            System.out.println("Arco " + origen.getId() + " --> " + destino.getId() + " eliminado."); // imprime mensaje de borrado en consola
            return true;  // retorna true en señal que fue eliminado
        } // si no cumple ninguna de estas dos condiciones...
         Coneccion aux = origen.getSigConeccion().getSigConeccion();  // aux guarda la posición siguiente del inicio
         Coneccion anterior = origen.getSigConeccion(); // anterior sería el inicio de la lista
         while(aux != null){ // recorre la sublista de arcos en un ciclo sin contar el inicio de la sublista
            if(aux.getDestino() == destino){ // si el destino del actual aux es igual al destino del arco a borrar
                anterior.setSigConeccion(aux.getSigConeccion()); // la posicion anterior apunta al siguiente del que se va a eliminar
                System.out.println("Arco " + origen.getId() + " --> " + destino.getId() + " eliminado."); // imprime mensaje de borrado en consola
                return true; // retorna true en señal que se elimino el arco
            } 
            anterior=aux; // actualiza aux y anterior para continuar el ciclo
            aux =aux.getSigConeccion();
         }
         return false;
    }

    public boolean eliminarRouter(String nombre) {
        Router vertice = grafo;
        limpiarArcos(vertice);
        if(vertice == null){
            return false;
        }
        if(vertice.getId().equals(nombre)){
            grafo = vertice.getSigRouter();
            return true;
        }
        Router aux = grafo.getSigRouter();
        Router ant = grafo.getSigRouter().getSigRouter();
        while (aux != null) {
            if (aux.getId().equals(nombre)) {
                ant.setSigRouter(aux.getSigRouter());
                System.out.println("borrado"); // imprime en consola mensaje de borrado
                return true; // retorna true en señal que se elimino el arco
            }
            aux = aux.getSigRouter();
            ant = aux;
        }
        return false;

    }
    
    public void limpiarArcos(Router vertice){
        Router aux = grafo;
        while(aux != null){
            Coneccion temp = aux.getSigConeccion();
            while(temp != null){
                if(temp.getDestino() == vertice){
                    eliminarConeccion(aux, vertice);
                }
                temp = temp.getSigConeccion();
            }
            aux = aux.getSigRouter();
        }
    }
}
