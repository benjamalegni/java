/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;

/**
 *
 * @author luka.malegni
 */
public abstract class ElementoColeccion {
    private String nombre;
    
    public ElementoColeccion(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double getPrecio();
    public abstract ElementoColeccion getCopia(Condicion cc);
    public abstract Articulo articuloValorMayor();
    public abstract int cantidadArticulos();
}