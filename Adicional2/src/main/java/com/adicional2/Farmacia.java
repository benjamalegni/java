/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adicional2;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Farmacia {
    private String nombre;
    private ArrayList<Medicamento> medicamentos;
    
    public Farmacia(String nombre){
        this.nombre=nombre;
        medicamentos = new ArrayList<>();
    }
}
