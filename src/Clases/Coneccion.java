/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Fabián
 */
public class Coneccion {
    private Router origen;
    private Router destino;
    private Coneccion sigConeccion;
    private int tiempo;
    
    public Coneccion(int tiempo) {
        this.origen = null;
        this.destino = null;
        this.sigConeccion = null;
        this.tiempo = tiempo;

    }

    public Router getOrigen() {
        return origen;
    }

    public void setOrigen(Router origen) {
        this.origen = origen;
    }

    public Router getDestino() {
        return destino;
    }

    public void setDestino(Router destino) {
        this.destino = destino;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Coneccion getSigConeccion() {
        return sigConeccion;
    }

    public void setSigConeccion(Coneccion sigConeccion) {
        this.sigConeccion = sigConeccion;
    }

    @Override
    public String toString() {
        return "Coneccion{" + "origen=" + origen + ", destino=" + destino + ", tiempo=" + tiempo + '}';
    }
    
}
