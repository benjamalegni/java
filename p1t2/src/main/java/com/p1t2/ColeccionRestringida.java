/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t2;

/**
 *
 * @author luka.malegni
 */
public class ColeccionRestringida extends Coleccion {
    
    public ColeccionRestringida(String nombre, double descuento){
        super(nombre,descuento);
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        return null;
    }
    
}
