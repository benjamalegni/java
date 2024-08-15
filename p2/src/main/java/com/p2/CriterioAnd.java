/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2;

/**
 *
 * @author luka.malegni
 */
public class CriterioAnd implements Criterio {
    private Criterio c1;
    private Criterio c2;
    
    public CriterioAnd(Criterio c1, Criterio c2){
        this.c1=c1;
        this.c2=c2;
    }
    
    public boolean cumple(Tarea t){
        return c1.cumple(t) && c2.cumple(t);
    }
}