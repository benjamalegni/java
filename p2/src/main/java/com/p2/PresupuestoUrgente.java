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
public class PresupuestoUrgente extends Presupuesto {
    private double adicional;
    
    public PresupuestoUrgente(String nombre, ArrayList<String> materiales, int costo, int cantEmpleados, int tiempoEstimado, double adicional) {
        super(nombre, materiales, costo, cantEmpleados, tiempoEstimado);
        this.adicional=adicional;
    }
    
    @Override
    public ArrayList<String> getMateriales(){
        ArrayList<String> aux = new ArrayList<>();
        
        for(Tarea t:tareas){
            for(int i=0;i<t.getMateriales().size();i++)
            aux.add(t.getMateriales().get(i).toUpperCase());
        }
        return aux;
    }
    
    @Override
    public int getCantidadMateriales(){
        return getMateriales().size();
    }
    
    @Override
    public int getCosto(){
        int costoTotal=0;
        
        for(Tarea t:tareas){
            costoTotal+=t.getCosto();
        }
        return (int) (costoTotal*((100+adicional)/100));
    }
    
    @Override
    public int getTiempoEstimado(){
        int maxTiempo=0;
        
        for(Tarea t:tareas){
            if(t.getTiempoEstimado()>maxTiempo){
                maxTiempo=t.getTiempoEstimado();
            }
        }
        return maxTiempo;
    }
    
    
    public double getAdicional(){
        return adicional;
    }
    
}
