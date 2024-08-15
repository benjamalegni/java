/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp6ej1;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public interface Expresion {
    public double calcular();
    public ArrayList<Double> getNumeros();
    public ArrayList<String> getOperadores();
    public String toString();
}
