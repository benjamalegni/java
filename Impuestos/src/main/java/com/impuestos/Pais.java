/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impuestos;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author luka.malegni
 */
public class Pais extends Distrito {
    private List <Provincia> provincias = new ArrayList<>();
    private String nombre;
    private int descuento;

    public Pais(String nombre, int descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    
    public int getHabitantes(){
        int res=0;
        for(Provincia p:provincias)
            res+=p.getHabitantes();
        return res;
    }
    
    @Override
    public float getImpuestos(){
        return super.getImpuestos()*(1-descuento);
    }
    
  
    
}
