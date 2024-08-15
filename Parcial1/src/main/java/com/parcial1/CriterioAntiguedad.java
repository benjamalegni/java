/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;

/**
 *
 * @author luka.malegni
 */
public class CriterioAntiguedad extends Criterio {
    private int antiguedad;
    
    public CriterioAntiguedad(int a){
        antiguedad=a;
    }
    
    public boolean cumple(Elemento elemento){
        return elemento.getAntiguedad() == antiguedad;
    }
}
