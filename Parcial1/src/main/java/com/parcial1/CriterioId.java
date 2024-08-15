/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;

/**
 *
 * @author luka.malegni
 */
public class CriterioId extends Criterio {
    private int id;
    
    public CriterioId(int id){
        this.id=id;
    }
    
    public boolean cumple(Elemento elemento){
        return elemento.getId()==id;
    }
}
