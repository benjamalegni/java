/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1;

/**
 *
 * @author luka.malegni
 */
public class CondicionNombre implements Condicion {
    private Articulo aa;
    
    public CondicionNombre(Articulo aa){
        this.aa=aa;
    }
    
    public boolean cumple(Articulo aa){
        return this.aa.getNombre().equals(aa);
    }
}
