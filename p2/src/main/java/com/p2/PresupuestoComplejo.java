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
public class PresupuestoComplejo extends Presupuesto {
    private double descuento;

    public PresupuestoComplejo(String nombre, ArrayList<String> materiales, int costo, int cantEmpleados, int tiempoEstimado, double descuento) {
        super(nombre, materiales, costo, cantEmpleados, tiempoEstimado);
        this.descuento=descuento;
    }
    
    public ArrayList<String> getMateriales(){ 
        ArrayList<String> materialesComplejos = new ArrayList<>();
        for(Tarea t:tareas){
            for(int i=0;i<t.getMateriales().size();i++)
            if(materialesComplejos.contains(t.getMateriales().get(i).toUpperCase()));
        }
        return materialesComplejos;
    }
    
    public int getCantEmpleados(){
        int cantMax=0;
        for(Tarea t:tareas){
            if(t.getCantEmpleados()>cantMax){
                cantMax=t.getCantEmpleados();
            }
        }
        return cantMax;
    }
    
    public int getCantMateriales(){
        return getMateriales().size();
    }
    
    @Override
    public int getTiempoEstimado(){
        int tiempoSumado=0;
        for(Tarea t:tareas){
            tiempoSumado+=t.getTiempoEstimado();
        }
        return tiempoSumado;
    }
    
    @Override
    public int getCosto(){
        int costoTotal=0;
        
        for(Tarea t:tareas){
            costoTotal+=t.getCosto();
        }
        return (int) (costoTotal*(descuento/100));
    }
    
    
}
