/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa;

/**
 *
 * @author luka.malegni
 */
public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected int salario;

    public Empleado(int id, String nombre, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract float getSalarioSemanal();
    public String getNombre(){
        return nombre;
    }
}
