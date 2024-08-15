/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;

/**
 *
 * @author luka.malegni
 */
public class CriterioDescripcion extends Criterio {
    private String descripcion;
    
    public CriterioDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public boolean cumple(Elemento elemento){
        return elemento.getDescripcion().equals(descripcion);
    }
}
