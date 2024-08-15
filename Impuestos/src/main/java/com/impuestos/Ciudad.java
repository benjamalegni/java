/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impuestos;

/**
 *
 * @author luka.malegni
 */
public class Ciudad extends Lugar{
    private String nombre;
    private int habitantes;
    private float impuestos;

    public Ciudad(String nombre, int habitantes, float impuestos) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.impuestos = impuestos;
    }
    
    
    @Override
    public int getHabitantes(){
        return habitantes;
    }
    
    
    @Override
    public float getImpuestos(){
        return impuestos;
    }
    
}
