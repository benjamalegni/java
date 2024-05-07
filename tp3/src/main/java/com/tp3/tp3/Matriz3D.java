/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp3.tp3;

/**
 *
 * @author luka.malegni
 */
public class Matriz3D {
    private Object[][][] obj;
    private int x;
    private int y;
    private int z;

    public Matriz3D(int x, int y, int z){
        obj = new Object[x][y][z];
        
        this.x=x;
        this.y=y;
        this.z=z;
        
    }
    
    public Matriz3D(){
        //default size 10x10x10
        this(10,10,10);
    }
    
    public void setObj(int x, int y, int z,Object object){
        obj[x][y][z]=object;
    }
    
    public Object getObject(int x, int y, int z){
        return obj[x][y][z];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    
}
