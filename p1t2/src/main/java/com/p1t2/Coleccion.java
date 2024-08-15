/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t2;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Coleccion extends ElementoColeccion {
    private ArrayList<ElementoColeccion> els;
    private static double tope = 50;
    private double descuento;
    
    public Coleccion(String nombre, double descuento){
        super(nombre);
        this.descuento=descuento;
        
        els=new ArrayList<>();
    }
    
    public int cantidadFiguritas(){
        int suma=0;
        for(ElementoColeccion ee:els){
            suma+=ee.cantidadFiguritas();
        }
        return suma;
    }
    
    public void addElemento(ElementoColeccion ee){
        if(!els.contains(ee)){
            els.add(ee);
        }
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        Coleccion aux = new Coleccion(getNombre(),descuento);
        boolean tieneElemento=false;
        for(ElementoColeccion ee:els){
            ElementoColeccion auxCopia = ee.getCopia(cc);
            if(auxCopia!=null){
                aux.addElemento(auxCopia);
                tieneElemento=true;
            }
        }
        return tieneElemento?aux:null;
    }
    
    public double getPrecio(){
        double suma =0;
        for(ElementoColeccion ee:els){
            suma+=ee.getPrecio();
        }
        
        double descuentoPrecio = descuento*cantidadFiguritas();
        
        if(descuentoPrecio>tope){
            descuentoPrecio=tope;
        }
        
        return suma*(1-descuentoPrecio/100);
    }
    
    
    public Figurita figuritaMayorValor(){
        Figurita mayor = null;
        for(ElementoColeccion ee:els){
            Figurita aux = ee.figuritaMayorValor();
            if(mayor==null || mayor.getPrecio()<aux.getPrecio()){
                mayor=aux;
            }
        }
        return mayor;
    }
}
