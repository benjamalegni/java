/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1;

/**
 *
 * @author luka.malegni
 */
public abstract class ElementoColeccion {
    private String nombre;
    
    public ElementoColeccion(String nombre){
        this.nombre=nombre;
    }
    
    public abstract Articulo articuloMayorValor();
    
    public abstract ElementoColeccion getCopia(Condicion c);
    
    public abstract double getPrecio();
    
    public abstract int cantidadArticulos();
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
}
