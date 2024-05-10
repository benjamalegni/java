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
public class Fresco extends Producto{
    private String granjaOrigen;
    
    
    public Fresco(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,String granjaOrigen){
        super(tipo, fechaVencimiento, nroLote, fechaEnvasado);
        this.granjaOrigen=granjaOrigen;
    }
}
