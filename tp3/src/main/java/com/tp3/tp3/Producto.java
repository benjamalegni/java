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
public class Producto {
    private String tipo;
    private LocalDate fechaVencimiento;
    private int nroLote;
    private LocalDate fechaEnvasado;

    public Producto(String tipo, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado) {
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
        this.fechaEnvasado = fechaEnvasado;

     
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    
    public String getData(){
        return "Tipo: "+getTipo()+". Fecha Vencimiento:"+getFechaVencimiento()+" Nro lote:"+getNroLote()+". Fecha de envasado:"+getFechaEnvasado();
    }
        
    
 }
