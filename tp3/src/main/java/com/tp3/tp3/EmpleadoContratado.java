/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class EmpleadoContratado extends Empleado {
    public EmpleadoContratado(int id, String nombre, int salario){
        super(id,nombre,salario);
    }
    
    public float getSalarioSemanal(){
        return (float) salario;
    }
}
