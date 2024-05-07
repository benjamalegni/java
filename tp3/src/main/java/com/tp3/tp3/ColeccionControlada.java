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
public class ColeccionControlada {
    private ArrayList<Object> coleccion;
    private int lecturas;
    private int escrituras;
    
    
    public ColeccionControlada(){
        coleccion = new ArrayList<>();
        this.lecturas=0;
        this.escrituras=0;
    }
    
    public void add(Object data){
        escrituras++;
        coleccion.add(data);
    }
    
    public Object get(int i){
        lecturas++;
        Object colec = coleccion.get(i);
        return colec;
    }
    
    public void set(int i, Object data){
        escrituras++;
        coleccion.set(i,data);
    }
    
    public void remove(int i){
        escrituras++;
        coleccion.remove(i);
    }
    
    public int size(){
        lecturas++;
        return coleccion.size();
    }
    
    
    public int getLecturas() {
        return lecturas;
    }

    public int getEscrituras() {
        return escrituras;
    }
    
}
