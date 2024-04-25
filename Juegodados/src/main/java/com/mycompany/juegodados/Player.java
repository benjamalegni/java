/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegodados;

/**
 *
 * @author luka.malegni
 */
public class Player {
    private String name;
    private int score;
    
    public Player(){
        this("Anonymous");
    }
    
    public Player(String n){
        name=n;
        score=0;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore (){
        return score;
    }
    
    public void incrementScore(){
        score++;
    }
    
    public void setName(String n){
        name=n;
    }
}
