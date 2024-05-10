/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Avicola {
    private String nombre;
    private ArrayList<Producto> productos;
    private int idCounter;
    
    public Avicola(String nombre){
        this.nombre=nombre;
        productos = new ArrayList<>();
        idCounter =1;
    }    
    
    public int genID(){
        idCounter++;
        return idCounter;
    }
}
