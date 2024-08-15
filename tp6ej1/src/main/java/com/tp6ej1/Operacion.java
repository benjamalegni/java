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
public abstract class Operacion implements Expresion {
    protected Expresion e1;
    protected Expresion e2;
    
    public Operacion(Expresion e1, Expresion e2){
        this.e1=e1;
        this.e2=e2;
    }
    
    public ArrayList<Double> getNumeros(){
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.addAll(e1.getNumeros());
        numeros.addAll(e1.getNumeros());
        
        return numeros;
    }
    
    public ArrayList<String> getOperadores(){
        ArrayList<String> operadores = new ArrayList<>();
        operadores.addAll(e1.getOperadores());
        operadores.add(this.getOperador());
        operadores.addAll(e2.getOperadores());
        
        return operadores;
    }
    
    public abstract String getOperador();
}
