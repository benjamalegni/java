/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class Sensor extends Alarma {
    private String zona;
    
    public Sensor(String zona){
    this.zona=zona;
    }
    
    public String getZona(){
        return zona;
    }
}
