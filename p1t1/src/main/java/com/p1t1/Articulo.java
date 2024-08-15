/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;

/**
 *
 * @author luka.malegni
 */
public class Articulo extends ElementoColeccion {
    private String descripcion;
    private double precio;
    private double peso;
    
    public Articulo(String nombre, String descripcion, double precio, double peso){
        super(nombre);
        this.descripcion=descripcion;
        this.precio=precio;
        this.peso=peso;
    }
    
    public Articulo articuloValorMayor(){
        return this;
    }
    
    public int cantidadArticulos(){
        return 1;
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        if(cc.cumple(this)){
            return new Articulo(getNombre(),descripcion,precio,peso);
        } else{
            return null;
        }
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
