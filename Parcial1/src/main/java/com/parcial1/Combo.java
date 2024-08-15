/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Combo extends Elemento{
    private ArrayList<Elemento> elementos;
    
    
    public Combo(double valor, int id, LocalDate fechaCreacion, String descripcion, ArrayList<Elemento> elementos) {
        super(valor, id, fechaCreacion, descripcion);
        
        this.elementos = elementos;
    }
    
    public void removeElemento(Elemento elem){
        if(elementos.contains(elem)){
            elementos.remove(elem);
        }
    }
    
    public void addElemento(Elemento elem){
        if(!elementos.contains(elem)){
            elementos.add(elem);
        }
    }   
    
    public boolean containsElemento(Elemento elem){
        return elementos.contains(elem);
    }
    
    public double getValorTotal(){
        double v=0;
        for(Elemento e:elementos){
            v+=e.getValor();
        }
        return v;
    }
    
    public int getAntiguedadMaxima(){
        int antiguedadMax=0;
        
        for(Elemento e:elementos){
            if(e.getAntiguedad()>antiguedadMax){
                antiguedadMax=e.getAntiguedad();
            }
        }
        return antiguedadMax;
    }
    
}
