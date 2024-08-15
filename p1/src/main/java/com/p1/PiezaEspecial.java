/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1;

/**
 *
 * @author luka.malegni
 */
public class PiezaEspecial extends Articulo {
    private int numeroUnidades;
    private Condicion control;
    private boolean otroPrecio;
    
    public PiezaEspecial(String nombre,String descripcion, double peso, double precio, int numeroUnidades,double otroPrecio; Condicion control){
        super(nombre,descripcion,peso,precio);
        this.numeroUnidades=numeroUnidades;
        this.control=control;
        this.otroPrecio=otroPrecio;
    }
    
    
    
    public int getNumeroUnidades(){
        return numeroUnidades;
    }
    
    public void setNumeroUnidades(int u){
        numeroUnidades=u;
    }
}
