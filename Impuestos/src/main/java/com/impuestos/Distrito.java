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
public class Distrito extends Lugar {
    private List<Lugar> lugares=new ArrayList<>();

    public Distrito() {
    }

    
    @Override
    public int getHabitantes(){
        int res=0;
        for(Lugar l:lugares){
            res+=l.getHabitantes();
        }
        return res;
    }
    
    @Override
    public float getImpuestos(){
        float res=0;
        for(Lugar l:lugares){
            res+=l.getImpuestos();
        }
        return res;
    }
    
    public float impPorHab(){
        return getImpuestos()/getHabitantes();
    }
}
