/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adicional1;
import java.util.ArrayList;
/**
 *
 * @author luka.malegni
 */
public class Adicional1 {
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;
    
    public double getPrecio(Libro l, Cliente cc){
        return l.getPrecio()- l.getPrecio()*cc.getDescuento()/100;
    }
    
    public boolean yaCompro(Libro l, Cliente cc){
        return cc.yaCompro(l);
    }
    
    public ArrayList<Cliente> getClientes(Libro l){
        ArrayList aux = new ArrayList<Cliente>();
        for(int i=0;i<clientes.size();i++){
            Cliente cc = clientes.get(i);
            if(cc.leGusta(l)){
                aux.add(l);
            }
        } return aux;
    }
    
    public static void main(String[] args) {
    }
}
