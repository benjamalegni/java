/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional1;

/**
 *
 * @author luka.malegni
 */
public class ClienteExigente extends Cliente {

    public ClienteExigente(String nombre, String apellido, int dni, String direccion, double descuento) {
        super(nombre, apellido, dni, direccion, descuento);
    }
    
    @Override
    public boolean leGusta(Libro l){
        boolean seguir = autoresFav.contains(l.getAutor());
        if(seguir){
            for(int i=0;i<generosFav.size();i++){
                if(l.tieneGenero(generosFav.get(i))){
                    return true;
                }
            }
        }return false;
    } 
}
