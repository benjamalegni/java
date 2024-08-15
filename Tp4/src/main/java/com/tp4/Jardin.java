/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp4;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Jardin {
    private ArrayList<Planta> coleccion;
    private int contId;
    
    public Jardin(){
        coleccion = new ArrayList<>();
        contId=0;
    }
    
    public int genId(){
        return contId++;
    }
    
    public void newPlanta(Planta planta){
        coleccion.add(planta);
    }
    
    public Planta getPlantaId(int id){
        ArrayList<Planta> aux = new ArrayList<>();
        aux.addAll(coleccion);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).getId()==id){
                return aux.get(i);
            }
        }
        return null;
    }
    
    public Planta getPlantaNombre(String nombre){
        ArrayList<Planta> aux = new ArrayList<>();
        aux.addAll(coleccion);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).getNombre()==nombre){
                return aux.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Planta> getPlantas(){
        ArrayList<Planta> aux = new ArrayList<>();
        aux.addAll(coleccion);
        return aux;
    }
   
}
