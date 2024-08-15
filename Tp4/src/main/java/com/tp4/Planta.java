/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp4;
import java.time.LocalDate;
/**
 *
 * @author luka.malegni
 */
public class Planta {
    private String nombre;
    private String nombreC;
    private String paisOrigen;
    private LocalDate fechaCompra;
    private int id;

    public Planta(String nombre, String nombreC, String paisOrigen, LocalDate fechaCompra, int id) {
        this.nombre = nombre;
        this.nombreC = nombreC;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
