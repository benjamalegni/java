/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;

    private AlarmaLuminosa al;
    private ArrayList<Sensor> sensores;
    
    private int zonas;
    private String zonas_str;
    
    public Alarma() {
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.ventanaAbierta = false;
        
        zonas=1;
        
        this.sensores=new ArrayList<>();
        sensores.add(new Sensor("zona 1"));
        this.al=new AlarmaLuminosa();
    }
    
    public void newSensor(){
        zonas_str="zona: "+zonas;
        sensores.add(new Sensor(zonas_str));
    }
    
    public Sensor buscarSensor(int zona){
        String zona_str="zona: "+zona;
        for(int i=0;i<sensores.size();i++){
           Sensor s = sensores.get(i);
           if(s.getZona()==zona_str){
               return s;
           };
        }
        return null;
    }
    
    public void comprobar(){
        if (vidrioRoto||puertaAbierta||ventanaAbierta){
            //timbre.sonar
            //sensores.get().getZona();
        }
    }
    
    
}
