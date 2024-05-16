/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional1;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    protected ArrayList<String> autoresFav;
    protected ArrayList<String> generosFav;
    private ArrayList<Libro> compras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni, String direccion, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.autoresFav = new ArrayList<>();
        this.generosFav = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.descuento = descuento;
    }

    public boolean leGusta(Libro l){
        return autoresFav.contains(l.getAutor());
    }
    
    public boolean yaCompro(Libro libro){
        return compras.contains(libro.getNombre().toUpperCase());
    }
    
    public ArrayList<String> getAutoresFav(){
        ArrayList aux = new ArrayList<String>();
        aux.addAll(autoresFav);
        return aux;
    }
    
    public ArrayList<String> getGenerosFav(){
        ArrayList aux = new ArrayList<String>();
        aux.addAll(generosFav);
        return aux;
    }
    
    public ArrayList<String> getCompras(){
        ArrayList aux = new ArrayList<String>();
        aux.addAll(compras);
        return aux;
    }
    
    public double getDescuento() {
        return descuento;
    }

    private void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
