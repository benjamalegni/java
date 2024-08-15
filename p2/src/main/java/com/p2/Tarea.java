/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Tarea {
    protected String nombre;
    protected ArrayList<String> materiales;
    protected int costo;
    protected int cantEmpleados;
    protected int tiempoEstimado;
    
    public Tarea(String nombre, ArrayList<String> materiales, int costo, int cantEmpleados, int tiempoEstimado){
        this.nombre=nombre;
        this.materiales=materiales;
        this.costo=costo;
        this.cantEmpleados=cantEmpleados;
        this.tiempoEstimado=tiempoEstimado;
    }
    public ArrayList<String> getMateriales(){
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(materiales);
        return aux;
    }
    
    
    public boolean tieneMaterial(String m){
        return materiales.contains(m.toUpperCase());
    }
    
    public void addMaterial(String m){
        if(!materiales.contains(m.toUpperCase())){
            materiales.add(m.toUpperCase());
        }
    }
    
    public void removeMaterial(String m){
        if(!materiales.contains(m.toUpperCase())){
            materiales.remove(m.toUpperCase());
        }
    }
    
    public int getCantidadMateriales(){
        int c =0;
        
        for(String s:materiales){
            c++;
        }
        return c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
    
}
