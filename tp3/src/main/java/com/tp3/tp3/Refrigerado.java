/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

import java.time.LocalDate;

/**
 *
 * @author luka.malegni
 */
public class Refrigerado extends Fresco{
    private int codigoSupervision;
    private int temperaturaRecomendada;
    
    public Refrigerado(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,String granjaOrigen, int codigoSupervision, int temperaturaRecomendada){
        super(tipo, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
        this.codigoSupervision=codigoSupervision;
        this.temperaturaRecomendada=temperaturaRecomendada;
    }
}
