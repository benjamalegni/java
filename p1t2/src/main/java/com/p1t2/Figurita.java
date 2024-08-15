/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t2;

/**
 *
 * @author luka.malegni
 */
public class Figurita extends ElementoColeccion {
    private String marca;
    private String album;
    private int numero;
    private double precio;
    
    public Figurita(String nombre, String marca, String album, int numero, double precio){
        super(nombre);
        this.marca=marca;
        this.album=album;
        this.numero=numero;
        this.precio=precio;
    }
    
    public int cantidadFiguritas(){
        return 1;
    }
    
    public Figurita figuritaMayorValor(){
        return this;
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        if(cc.cumple(this)){
            return new Figurita(getNombre(),marca,album,numero,precio);
        } else{
            return null;
        }
    }   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
