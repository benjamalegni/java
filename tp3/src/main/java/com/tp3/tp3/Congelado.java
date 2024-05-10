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
public class Congelado extends Producto{
    private int codigoSupervision;
    
    public Congelado(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,int codigoSupervision){
        super(tipo,fechaVencimiento,nroLote,fechaEnvasado);
        this.codigoSupervision=codigoSupervision;
    }
}
