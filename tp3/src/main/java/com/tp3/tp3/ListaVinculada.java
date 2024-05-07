/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class ListaVinculada {
    private Node cursor;
    private Node primero;
    private int size;
    
    public ListaVinculada(String dato){
        cursor = new Node(dato,null);
        
        primero = cursor;
        this.cursor=cursor;
        this.size=1;
    }
    
    public void addNode(String data){
        Node aux = new Node(data,null);
        if(cursor!=null){
            cursor=aux;
        } else{
            
            //copia de cursor para llegar hasta el ultimo nodo
            Node actual = cursor;
            while(actual.getNext()!=null){
                actual = actual.getNext();
            }
            actual.setNext(aux);
        }
    }
    
    public void printList(){
        Node aux = primero;
        while(aux!=null){
            System.out.println(aux.getData());
            aux=aux.getNext();
        }
    }

    
}
