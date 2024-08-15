/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional2;

/**
 *
 * @author luka.malegni
 */
public class CriterioLaboratorio extends Criterio {
    private String laboratorio;
    
    public CriterioLaboratorio(String laboratorio){
        this.laboratorio=laboratorio;
    }
    
    public boolean cumple(Medicamento medicamento){
        return medicamento.getLaboratorio().equals(laboratorio);
    }
}
