/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional2;

/**
 *
 * @author luka.malegni
 */
public class CriterioContienePalabra extends Criterio {
    private String palabra;
    
    public CriterioContienePalabra(String palabra){
        this.palabra=palabra;
    }
    
    public boolean cumple(Medicamento medicamento){
        return medicamento.getNombre().contains(palabra);
    }
}
