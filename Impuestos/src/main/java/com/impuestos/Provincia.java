/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impuestos;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author luka.malegni
 */
public class Provincia extends Distrito {
    private List ciudades = new ArrayList();
    private Iterator e;
    private float adicional;

    public Provincia(float adicional) {
        this.adicional = adicional;
    }
    
    public Provincia(){
        this(0);
    }
    
    
    @Override
    public int getHabitantes(){
        int res=0;
        for(Iterator i=ciudades.iterator();e.hasNext();)
            res+=((Ciudad)i.next()).getHabitantes();
        return res;
        }
  
    @Override
    public float getImpuestos(){
        return super.getImpuestos()+adicional;
    }
    
 }
