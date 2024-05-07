/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.michigan.colecciondinamica;

/**
 *
 * @author luka.malegni
 */
public class ArrayDinamico {

    private int cantElementos;
    private final int tamInicial = 10;
    private Object[] elementos;
    
    public ArrayDinamico(int cantElem){
        if(cantElem>0){
            elementos = new Object[cantElem];
        } else{
            elementos = new Object[tamInicial];
        }
    }
    
    public ArrayDinamico(){
        elementos = new Object[tamInicial];
    }
    
    public int size(){
        return cantElementos;
    }
    
    private void crecer(){
        Object[] elemAux = new Object[elementos.length+tamInicial];
        
        for(int i=0; i<elementos.length;i++){
            elemAux[i]=elementos[i];
        }
        elementos=elemAux;
    
    }
    
    public void add(Object elem){
        if (cantElementos<elementos.length){
            elementos[cantElementos]=elem;
        } else{
            crecer();
            elementos[cantElementos]=elem;
        }
        cantElementos++;
    }
    
    public Object remove(int index){
        Object elem = null;
        if(index>0 && index<elementos.length){
            elem = elementos[index];
            for(int i=0;i<elementos.length;i++){
                elementos[i]=elementos[i+1];
            }
        }
        cantElementos--;
        return elem;
        
    }
    
    public static void main(String[] args) {
        ArrayDinamico ad1 = new ArrayDinamico();
        ad1.add(ad1);
    }
}
