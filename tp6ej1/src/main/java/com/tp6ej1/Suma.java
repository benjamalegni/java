/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp6ej1;

/**
 *
 * @author luka.malegni
 */
public class Suma extends Operacion {
    public Suma(Expresion e1, Expresion e2){
        super(e1,e2);
    }
    
    @Override
    public double calcular(){
        return e1.calcular()+e2.calcular();
    }
    
    @Override
    public String getOperador(){
        return "+";
    }
    
    public String toString() {
        return "(" + e1.toString() + "+" + e2.toString() + ")";
    }
}
