/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.michigan.michigan;

/**
 *
 * @author luka.malegni
 */
public class Mano {
    private Dado d1;
    private Dado d2;
    
    private int resultado1;
    private int resultado2;
   
    
    public Mano(){
        d1 = new Dado();
        d2 = new Dado();
        
    }
    
    public String tirar(){
        resultado1 = d1.tirar();
        resultado2 = d2.tirar();
        
        if ((resultado1==1 && resultado2==2)||(resultado1==2 && resultado2==1)){
            esmichigan();
        }
        
         if ((resultado1==1 && resultado2==3)||(resultado1==3 && resultado2==1)){
            esmaldicion();
        }      
    }
    
    public String esmichigan(){
        System.out.println("MICHIGAN");
    }
    
    public String esmaldicion(){
        System.out.println("MALDICION");
    }
}
