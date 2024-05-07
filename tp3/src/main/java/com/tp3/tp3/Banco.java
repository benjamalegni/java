/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class Banco {
    private int cvu;
    private ColeccionControlada cuentas;
    
    public Banco(){
        cvu=000000;
        cuentas = new ColeccionControlada();
    }
    
    public int genCvu(){
        cvu++;
        return cvu;
}
    
    public Object getCuenta(String nombre, boolean type){
        for(int i=0;i<cuentas.size();i++){
            Cuenta cuenta = (Cuenta)cuentas.get(i);
            if(cuenta.getNombre().equals(nombre) && cuenta.getType()==type){
                return cuenta;
            }
        }
        return null;
    }
    
     //true if CajaAhorro
    public Cuenta newCuenta(String nombre,int saldo, Boolean type){
        if(type){
            CajaAhorro ca = new CajaAhorro(nombre,genCvu(),saldo);
            cuentas.add(ca);
            return ca;
        } else{
            CuentaCorriente cc = new CuentaCorriente(nombre,genCvu(),saldo);
            cuentas.add(cc);
            return cc;
        }
    
    }
    
    //true if CajaAhorro
    public void removeCuenta(String nombre, boolean type){
        for(int i=0;i<cuentas.size();i++){
            Cuenta cuenta = (Cuenta)cuentas.get(i);
            if(cuenta.getNombre().equals(nombre) && cuenta.getType()==type){
                cuentas.remove(i);
            }
        }
    }
}

