/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impuestos;

/**
 *
 * @author luka.malegni
 */
public abstract class Lugar {
    private String name;
    
    public abstract int getHabitantes();
    public abstract float getImpuestos();
    public float impPorHab(){
        return getImpuestos()/getHabitantes();
    }
}
