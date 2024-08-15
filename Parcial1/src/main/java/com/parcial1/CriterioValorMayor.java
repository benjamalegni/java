/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;

/**
 *
 * @author luka.malegni
 */
public class CriterioValorMayor extends Criterio {
    private int valor;
    
    public CriterioValorMayor(int valor){
        this.valor=valor;
    }
    
    public boolean cumple(Elemento elemento){
        return elemento.getValor()>valor;
    }
}
