/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional2;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Medicamento {
    private String nombre;
    private String laboratorio;
    private ArrayList<String> sintomas;
    private double precio;
    
    public Medicamento(String nombre, String laboratorio, ArrayList<String> sintomas, double precio){
        this.nombre=nombre;
        this.laboratorio=laboratorio;
        this.sintomas=sintomas;
        this.precio=precio;
    }

    public void addSintoma(String s){
        if(!sintomas.contains(s.toUpperCase())){
            sintomas.add(s.toUpperCase());
        }
    }
    
    public  void removeSintoma(String s){
        if(!sintomas.contains(s.toUpperCase())){
            sintomas.remove(s.toUpperCase());
        }
    }
    
    public boolean containsSintoma(String s){
        return sintomas.contains(s.toUpperCase());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
          
}
