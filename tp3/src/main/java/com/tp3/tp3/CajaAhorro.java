/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class CajaAhorro extends Cuenta{
    
    public CajaAhorro(String nombre, int cvu, int saldo){
          super(nombre,cvu,saldo);
          type=true;
    }
    
    public CajaAhorro(String nombre, int cvu){
          this(nombre,cvu,0);
    }
    
    @Override
    public void extraer(int monto){
        if(saldo<monto){
            System.out.println("su saldo es de: "+saldo+" y el monto ingresado es: "+monto);
        }else{
            saldo-=monto;
        }
            
    }
    
}
