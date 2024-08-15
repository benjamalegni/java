/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t2;

/**
 *
 * @author luka.malegni
 */
public class FiguritaDorada extends Figurita {
    private int unidades;
    private Condicion cc;
    private double precioDorado;
    
    public FiguritaDorada(String nombre, String marca, String album,int numero, double precio, double precioDorado,int unidades,Condicion cc){
        super(nombre,marca,album,numero,precio);
        this.unidades=unidades;
        this.cc=cc;
        this.precioDorado=precioDorado;
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        if (cc.cumple(this)){
            return new FiguritaDorada(getNombre(),getMarca(),getAlbum(),getNumero(),getPrecio(),precioDorado,unidades,cc);
        } else{
            return null;
        }
    } 
    
    public double getPrecio(){
        if(cc.cumple(this)){
            return precioDorado;
        } else{
            return super.getPrecio();
        }
            
    }
    
}
