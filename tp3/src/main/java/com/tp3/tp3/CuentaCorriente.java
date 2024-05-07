/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class CuentaCorriente extends Cuenta{
    private int descubierto;
    
    public CuentaCorriente(String nombre, int cvu, int saldo){
        super(nombre, cvu, saldo);
        descubierto=0;
        type=false;
    }
    
    public CuentaCorriente(String nombre, int cvu){
        this(nombre, cvu, 0);
    }

    public int getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(int descubierto) {
        this.descubierto = descubierto;
    }
    
    @Override
    public void extraer(int monto){
        if((saldo+descubierto)<monto){
            System.out.println("su saldo es de: "+saldo+" y el monto ingresado es: "+monto);
        }else{
            saldo-=monto;
        }
            
    }
    
}
