/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;

/**
 *
 * @author luka.malegni
 */
public class ArticuloEspecial extends Articulo {
    private Condicion cc;
    private double precioEspecial;
    private int numeroUnidades;
    
    public ArticuloEspecial(String nombre,String descripcion, double precio, double peso, Condicion cc,int numeroUnidades, double precioEspecial){
        super(nombre,descripcion,precio,peso);
        this.cc=cc;
        this.precioEspecial=precioEspecial;
        this.numeroUnidades = numeroUnidades;
    }
    
    @Override
    
    public Articulo getCopia(Condicion cc){
        if(cc.cumple(this)){
            return new ArticuloEspecial(getNombre(),getDescripcion(),super.getPrecio(),getPeso(),cc,numeroUnidades,precioEspecial);
        } else{
            return null;
        }
    }
    
    
    public double getPrecio(){
        if(cc.cumple(this)){
            return super.getPrecio();
        } else{
            return precioEspecial;
        }
    }
}
