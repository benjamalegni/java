/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2.tp2;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Temporada extends Serie {
    private String titulo;
    
    public Temporada(String titulo){
        this.titulo=titulo;
    }
   
    
    private List<Episodio> episodios;
    
    public int getEpisodiosVistos(){
        int suma=0;
        for(int i=0; i<episodios.size();i++){
            if (episodios.get(i).getVisto()){
                suma++;
            }
        }
        return suma;
    }
    
    public float getPromedioCalificaciones(){
        int suma_calif=0;
        int cantidad=0;
        for(int i=0;i<episodios.size();i++){
            if((episodios.get(i).getCalificacion())>0){
                suma_calif+=episodios.get(i).getCalificacion();
                cantidad+=1;
            }
        }
        return (float)suma_calif/cantidad;
    }
    
    
    
}
