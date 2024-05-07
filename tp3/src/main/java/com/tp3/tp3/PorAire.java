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
public class PorAire extends Congelado{
    private int porcNitrogeno;
    private int porcOxigeno;
    private int porcDioxCarb;
    private int porcAgua;

    public PorAire(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,int codigoSupervision,int porcNitrogeno, int porcOxigeno, int porcDioxCarb, int porcAgua){
        super(tipo, fechaVencimiento, nroLote, fechaEnvasado, codigoSupervision);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcDioxCarb = porcDioxCarb;
        this.porcAgua = porcAgua;       
    }

    
    public int getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public int getPorcOxigeno() {
        return porcOxigeno;
    }

    public int getPorcDioxCarb() {
        return porcDioxCarb;
    }

    public int getPorcAgua() {
        return porcAgua;
    }
    
}
