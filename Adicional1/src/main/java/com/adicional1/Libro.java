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
public class Libro {
    private String nombre;
    private String autor;
    private int precio;
    private int cantPag;
    private ArrayList<String> generos;
    private String resumen;
    
    public void removeGenero(String genero){
        if(this.tieneGenero(genero)){
            generos.remove(genero);
        }
    }
    
    public void addGenero(String genero){
        if(!generos.contains(genero.toUpperCase()))
            generos.add(genero.toUpperCase());
    }
    
    public void addGeneros(ArrayList<String> generos){
        for(int i=0;i<generos.size();i++){
            this.addGenero(generos.get(i));
        }
    }
    
    public ArrayList<String> getGeneros(){
        ArrayList aux = new ArrayList<String>();
        aux.addAll(generos);
        return aux;
    }
    
    public boolean tieneGenero(String genero){
        return generos.contains(genero.toUpperCase());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    
}
