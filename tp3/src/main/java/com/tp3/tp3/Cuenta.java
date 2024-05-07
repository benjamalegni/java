/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public abstract class Cuenta {
    private String nombre;
    private int cvu;
    protected int saldo;
    protected boolean type;

    public Cuenta(String nombre, int cvu, int saldo) {
        this.nombre = nombre;
        this.cvu = cvu;
        this.saldo = saldo;
    }
    
    public void deposito(int monto){
        saldo+=monto;
    }
    
    public abstract void extraer(int monto);
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean getType(){
        return type;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public int getCvu(){
        return cvu;
    }
    
}
