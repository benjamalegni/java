/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.parcial1;
import java.util.ArrayList;


/**
 *
 * @author luka.malegni
 */
public class Parcial1 {
    private static int id;
    private ArrayList<Elemento> elementos;
    
    public Parcial1(){
        id=1;
        elementos=new ArrayList<>();
    }
    
    public ArrayList<Elemento> buscar(Criterio criterio){
        ArrayList<Elemento> aux = new ArrayList<>();
        for(Elemento e:elementos){
            if(criterio.cumple(e)){
                aux.add(e);
            }
        }
        return aux;
        
    }
    
    public static void main(String[] args) {
        CriterioDescripcion cd = new CriterioDescripcion("nuevo");
        ArrayList<Elemento> e = new ArrayList<>();
        

        
    }
}
