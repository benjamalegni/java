/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class EmpleadoXComision extends Empleado{
    private int porcentajeComision;
    private int montoTotalVentas;
    
    public EmpleadoXComision(int id,String nombre, int salario, int porcentajeComision, int montoTotalVentas){
        super(id,nombre,salario);
        this.porcentajeComision=porcentajeComision;
        this.montoTotalVentas=montoTotalVentas;
    }
    
    public float getSalarioSemanal(){
        float adicional = montoTotalVentas*porcentajeComision;
        return salario+adicional;
    }
}
