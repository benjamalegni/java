
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegodados;
import java.lang.Math;

/**
 *
 * @author luka.malegni
 */
public class Dice {
    private int ultimovalor;
    private int caras;
            
    public Dice(){
        this(6);
    }
    
    public Dice(int nro_caras){
        caras=nro_caras;
        tirar();
    }
    
    public int tirar(){
        ultimovalor=(int)(Math.random()*caras)+1;
        return (int)(Math.random()*caras)+1;
    }
    
    public int getUltimoValor(){
        return ultimovalor;
    }
    
}
