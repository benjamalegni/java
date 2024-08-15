/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional2;

/**
 *
 * @author luka.malegni
 */
public class CriterioOr extends Criterio{
     
    private Criterio c1;
    private Criterio c2;
    
    public CriterioOr(Criterio c1, Criterio c2){
        this.c1=c1;
        this.c2=c2;
    }
    
    public boolean cumple(Medicamento medicamento){
        return c1.cumple(medicamento) || c2.cumple(medicamento);
    }
    
}
