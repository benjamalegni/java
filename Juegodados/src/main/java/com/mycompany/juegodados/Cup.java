package com.mycompany.juegodados;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luka.malegni
 */
public class Cup {
    private Dice dados[];
    
    public Cup(){
        this(2);
    }
    
    public Cup(int cantdados){
        dados=new Dice[cantdados];
        for(int i=0;i<dados.length;i++){
            dados[i]= new Dice(6);
        }
    }
    
    public int tirar(){
        int suma =0;
        for(int i=0;i<dados.length;i++){
            suma+=dados[i].tirar();
        }
        return suma;
    }
    
}

