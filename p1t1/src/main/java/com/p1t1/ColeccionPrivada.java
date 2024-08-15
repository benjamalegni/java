/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;

/**
 *
 * @author luka.malegni
 */
public class ColeccionPrivada extends Coleccion {
    
    public ColeccionPrivada(String nombre, double extra){
        super(nombre,extra);
    }
    
    @Override
    public ElementoColeccion getCopia(Condicion cc){
        return null;
    }
}
