/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;

/**
 *
 * @author Fabián
 */
public class Router {
    private String id;
    private int x;
    private int y;
    public static final int d = 60;
    private Router sigRouter;
    private Coneccion SigConeccion;
    private boolean marca;
    
    
    public Router(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.sigRouter = null;
        this.SigConeccion = null;
        this.marca = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Router getSigRouter() {
        return sigRouter;
    }

    public void setSigRouter(Router sigRouter) {
        this.sigRouter = sigRouter;
    }

    public Coneccion getSigConeccion() {
        return SigConeccion;
    }

    public void setSigConeccion(Coneccion SigConeccion) {
        this.SigConeccion = SigConeccion;
    }

    public boolean isMarca() {
        return marca;
    }

    public void setMarca(boolean marca) {
        this.marca = marca;
    }
    
    
    @Override
    public String toString() {
        return "Router{" + "id=" + id + ", sigRouter=" + sigRouter + ", SigConeccion=" + SigConeccion + ", marca=" + marca + '}';
    }
    

    
}
