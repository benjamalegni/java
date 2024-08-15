/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Presupuesto extends Tarea {
    protected ArrayList<Tarea> tareas;

    public Presupuesto(String nombre, ArrayList<String> materiales, int costo, int cantEmpleados, int tiempoEstimado) {
        super(nombre, materiales, costo, cantEmpleados, tiempoEstimado);
    }
    
}
