package com.mycompany.michigan.colecciondinamica;
import java.util.ArrayList;

public class ColeccionDinamica {
    private Object[] elementos;
    private final int tamInicial = 10;

    private int cantElementos;

    public ColeccionDinamica(int cantInicial){
        //super()
        cantElementos = 0;
        if (cantInicial>0)
            elementos = new Object[cantInicial];
        else
            elementos = new Object[tamInicial];

    }

    public ColeccionDinamica(){
        cantElementos = 0;
        elementos = new Object[tamInicial];
    }

    private void crecer(){
        Object[] elementos2 = new Object[elementos.length+tamInicial];
        for (int i = 0; i < elementos.length; i++) {
            elementos2[i]=elementos[i];
        }
        elementos = elementos2;
    }

    public void add(Object elem){
        if (cantElementos<elementos.length) // si hay lugar
            elementos[cantElementos] = elem;
        else {
            crecer(); // hago lugar
            elementos[cantElementos] = elem; //agrego el elemento
        }
        cantElementos++;
    }

    public Object get(int index){
        if (index >=0 && index < cantElementos) { //si existe un elemento en ese indice
            return elementos[index];
        }
        return null;
    }

    public int size(){
        return cantElementos;
    }


    public void clear(){
        cantElementos=0;
    }

    public Object remove(int index){
        Object elem = null;
        if (index >=0 && index < cantElementos) {
            elem = elementos[index];
            for (int i=index ; i<cantElementos-1 ;i++)
                elementos[i]=elementos[i+1];
            elementos[cantElementos] = null; //No hace falta;
            cantElementos--;
        }
        return elem;
    }

    public boolean contains(Object elem){
        for (int i = 0; i < cantElementos; i++) {
            if (elementos[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

}
