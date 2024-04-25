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
public class Episodio extends Temporada {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
   

    public void setCalificacion(int calificacion) {
        if (calificacion<6&&calificacion>0){
                this.calificacion = calificacion;
        } else{
        System.out.println("ingresa el valor bien huevon");
        }
            
    }

    public int getCalificacion() {
        return calificacion;
    }

    public boolean getEpisodioVisto() {
        return visto;
    }
    
    
    public void setVisto(){
        this.visto=true;
    }
    
    public void noVisto(){
        this.calificacion=-1;
}

    boolean getVisto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
