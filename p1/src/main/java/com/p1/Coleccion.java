/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p1;
import java.util.ArrayList;

/**
 *
 * @author luka.malegni
 */
public class Coleccion extends ElementoColeccion {
    private ArrayList<ElementoColeccion> els;
    private static double tope=75;
    private double extra;
    
    public Coleccion(String nombre, double ex){
        super(nombre);
        extra=ex;
        
        els = new ArrayList<>();
    }
    
    public void addElemento(ElementoColeccion e){
        if(!els.contains(e)){
            els.add(e);
        }
    }
    
    public ElementoColeccion getCopia(Condicion c){
        Coleccion aux = new Coleccion(getNombre(),extra);
        boolean tieneElemento=false;
        for(ElementoColeccion ee:els){
            ElementoColeccion copiaAux = ee.getCopia(c);
            if(copiaAux!=null){
                aux.addElemento(copiaAux);
                tieneElemento=true;
            }
            
        }
        if(tieneElemento){
            return aux;
        } else{
            return null;
        }
    }
    
    public Articulo articuloMayorvalor(){
        Articulo mayor =null;
        
        for(ElementoColeccion ee:els){
            Articulo aux = ee.articuloMayorValor();
            if(mayor==null || mayor.getPrecio()<aux.getPrecio()){
                mayor=aux;
            }
        }
        return mayor;
    }
    
    public double getPrecio(){
        double contador=0.0;
        
        for(int i=0;i<els.size();i++){
            ElementoColeccion aux = els.get(i);
            contador+=aux.getPrecio();
        }
        
        double extraC = extra*this.cantidadArticulos();
        
        if(extraC>tope){
            extraC=tope;
        }
        
        return contador+(contador*extraC/100);

    }
   
    
        public int cantidadArticulos(){
            int suma =0;
            for(ElementoColeccion e:els){
                suma+=e.cantidadArticulos();
            }
            return suma;
        }
}   
