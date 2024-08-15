/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t2;

/**
 *
 * @author luka.malegni
 */
public class CondicionNombre implements Condicion {
    private String nombre;
    
    public CondicionNombre(String nombre){
        this.nombre=nombre;
    }
    
    public boolean cumple(ElementoColeccion ee){
        return ee.getNombre().equals(nombre);
    }
}
