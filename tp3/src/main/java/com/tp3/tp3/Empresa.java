/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private int id;
    
    public Empresa(String nombre){
        this.nombre=nombre;
        empleados = new ArrayList<>();
    }

    public Empresa(){
        this("default");
    }
    
    public int idGen(){
        id++;
        return id;
    }
    
    public void newEmpleado(int type, String nombre, int salario ){
        Empleado e;
        switch(type){
            case 1: {
                e = new EmpleadoContratado(idGen(),nombre,salario);
            }
            case 2: {
                //ingresar horasextras y monto;
                int horasExtra = 8;
                int monto = 20;
                e = new EmpleadoHorasExtra(idGen(),nombre,salario,horasExtra,monto);
            }
            case 3: {
                e = new EmpleadoXComision();
            }   
        }
            
    }
    
    public void getEmpleados(){
        for(int i=0;i<empleados.size();i++){
            System.out.println(empleados.get(i).getNombre());
        }
    }
}
