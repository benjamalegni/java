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
public class PorNitrogeno extends Congelado {
    private String metodoCongelacion;
    private int tiempoExposicion;
    
    public PorNitrogeno(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,int codigoSupervision, String metodoCongelacion, int tiempoExposicion){
        super(tipo, fechaVencimiento, nroLote, fechaEnvasado, codigoSupervision);
        this.metodoCongelacion=metodoCongelacion;
        this.tiempoExposicion=tiempoExposicion;
    }
}
