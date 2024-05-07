/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class Node {
    private String data;
    private Node sig;
    
        
    public Node(String data,Node sig){
        this.data=data;
        this.sig=null;
    }
    
    public Node getNext(){
        return sig;
    }

    public String getData(){
        return data;
    }
    
    public void setNext(Node node){
        this.sig=node;
    }
}
