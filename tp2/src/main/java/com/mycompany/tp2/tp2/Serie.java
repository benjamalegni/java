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
public class Serie {
    private String titulo;
    private String descripcion;
    private String genero;
    private String creador;
    
    private List<Temporada> temporadas;
    
    public int getEpisodiosVistosTotal(){
        int suma =0;
        
        for(int i=0;i<=temporadas.size();i++){
            suma+=temporadas.get(i).getEpisodioVisto();
        }
        return suma;
    }
    
    public float getPromedioCalifTotal(){
        int suma=0;
        for (int i=0;i<temporadas.size();i++){
            suma+=temporadas.get(i).getPromedioCalificaciones();
        }
    }
}
