/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa;

/**
 *
 * @author luka.malegni
 */
public class EmpleadoHorasExtra extends Empleado {
private int horasExtra;
private int monto;
    
    public EmpleadoHorasExtra(int id, String nombre, int salario, int horasExtra, int monto) {
            super(id,nombre,salario);
            this.horasExtra=horasExtra;
            this.monto=monto;
    }
    
    public float getSalarioSemanal(){
        return (float) salario+horasExtra*monto;
    }
    
}
