/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1;

/**
 *
 * @author luka.malegni
 */
public class Articulo extends ElementoColeccion {
    private String descripcion;
    private double peso;
    private double precio;
    
    public Articulo(String nombre,String descripcion, double peso, double precio){
        super(nombre);
        this.descripcion=descripcion;
        this.peso=peso;
        this.precio=precio;
    }
    
    public ElementoColeccion getCopia(Condicion c){
        if(c.cumple(this)){
            return null;
        }else {
            return new Articulo(getNombre(),descripcion,peso,precio);
        }
    }

    public Articulo articuloMayorValor(){
        return this;
    }
    
    public int cantidadArticulos(){
        return 1;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
