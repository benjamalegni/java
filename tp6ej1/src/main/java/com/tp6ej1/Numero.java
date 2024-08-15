/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp6ej1;

import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Numero implements Expresion {
    private double valor;
    
    public Numero(double numero){
        this.valor=numero;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double calcular(){
        return valor;
    }
    
    public String toString(){
        return Double.toString(valor);
    }
    
    @Override
    public ArrayList<Double> getNumeros(){
        ArrayList<Double> aux = new ArrayList<>();
        aux.add(valor);
        return aux;
    }
    
    public ArrayList<String> getOperadores(){
        return new ArrayList<>();
    }
   
    
    
}
