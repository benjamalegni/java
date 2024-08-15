/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;

/**
 *
 * @author luka.malegni
 */
public class ColeccionNombre implements Condicion {
    private String nombre;
    
    public ColeccionNombre(String nombre){
        this.nombre=nombre;
    }
    
    public boolean cumple(ElementoColeccion e){
        return e.getNombre().equals(nombre);
    }
}
