/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author luka.malegni
 */
public class Elemento {
    protected double valor;
    protected int id;
    protected LocalDate fechaCreacion;
    protected String descripcion;
    private int antiguedad;
    
    public Elemento(double valor,int id, LocalDate fechaCreacion, String descripcion){
        this.valor=valor;
        this.id=id;
        this.fechaCreacion=fechaCreacion;
        this.descripcion=descripcion;
        this.antiguedad=getAntiguedad();
    }
    
    public LocalDate getFechaCreacion(){
        return fechaCreacion;
    }
    
    public int getAntiguedad(){
        LocalDate now= LocalDate.now();
        return Period.between(fechaCreacion, now).getMonths();
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public double getValor(){
        return valor;
    }
}
