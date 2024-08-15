/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1t1;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Coleccion extends ElementoColeccion {
    private ArrayList<ElementoColeccion> els;
    private static double tope = 75;
    private static double extra;
    
    public Coleccion(String nombre, double extra){
        super(nombre);
        this.extra=extra;
        
        els = new ArrayList<>();
    }
    
    public void addElemento(ElementoColeccion ee){
        if(!els.contains(ee)){
            els.add(ee);
        }
    }
    
    public ElementoColeccion getCopia(Condicion cc){
        Coleccion aux = new Coleccion(getNombre(),extra);
        boolean tieneElemento = false;
        for(ElementoColeccion ee:els){
            ElementoColeccion copiaAux = ee.getCopia(cc);
            if(copiaAux!=null){
                aux.addElemento(ee);
                tieneElemento=true;
            }
        }
        if(tieneElemento){
            return aux;
        } else{
            return null;
        }
        
    }
    
    public Articulo articuloValorMayor(){
        Articulo mayor = null;
        
        for(ElementoColeccion ee:els){
            Articulo aux = ee.articuloValorMayor();
            
            if(mayor==null||mayor.getPrecio()<aux.getPrecio()){
                mayor=aux;
            }
        }
        return mayor;
    }
    
    public int cantidadArticulos(){
        int suma =0;
        for(ElementoColeccion ee:els){
            suma+=ee.cantidadArticulos();
        }
        return suma;
    }
    
    public double getPrecio(){
        double suma = 0;
        
        for(int i=0;i<els.size();i++){
            ElementoColeccion aux = els.get(i);
            suma+=aux.getPrecio();
        }
        
        double extraC = extra*(this.cantidadArticulos());
        
        if(extraC>tope){
            extraC=tope;
        }
        return suma+suma*(extraC/100);
    }

}
