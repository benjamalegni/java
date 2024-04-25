/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2.tp2;

/**
 *
 * @author luka.malegni
 */
public class Electrodomestico {
    private String nombre;
    private int precio;
    private String color;
    private int consumo;
    private int peso;
    
    public Electrodomestico(String nombre, int precio, String color, int consumo, int peso){
        this.nombre=nombre;
        this.precio=precio;
        this.color=color;
        this.consumo=consumo;
        this.peso=peso;
}
    public Electrodomestico(String nombre){
        this(nombre,100,"Gris Plata",10,2);
    }
    
    public Electrodomestico(String nombre, int precio){
        this(nombre,precio,"Gris Plata",10,2);
    }
    
    public Electrodomestico(String nombre, int precio, String color){
        this(nombre,precio,color,10,2);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return "$"+precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo+" Kw";
    }

    public String getPeso() {
        return peso+" Kg";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        return consumo<45;
    }
    
    public float getBalance(){
        return precio/peso;
    }
    
    public boolean esAltaGama(){
        return getBalance()>3;
    }
    
}
