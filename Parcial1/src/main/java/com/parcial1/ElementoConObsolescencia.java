/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial1;
import java.time.LocalDate;
/**
 *
 * @author luka.malegni
 */
public class ElementoConObsolescencia extends Elemento {
    private Elemento elemento;
    private int mesesObsolescencia;
    private static double porcentaje;
    private int mesesAntiguedad;
    
    public ElementoConObsolescencia(double valor, int id, LocalDate fechaCreacion,String descripcion, int mesesObsolescencia, Elemento elemento){
        super(valor,id,fechaCreacion,descripcion);
        this.porcentaje=0.02;
        //por default pero puedo pasarlo como parametro en el constructor tambien
        this.mesesObsolescencia=mesesObsolescencia;
        this.elemento=elemento;
    }
    
    public void setPorcentaje(double porcentaje){
        this.porcentaje=porcentaje;
    }
    
    @Override
    public double getValor(){
        if(getAntiguedad()<mesesObsolescencia){
            return valor;
        } else{
            int dif = getAntiguedad() - mesesObsolescencia;
            double valorDescontado = elemento.getValor();
            
            for(int i=0; i<dif;i++){
                valorDescontado*=(1-porcentaje);
            }
            return valorDescontado;
        }
    }
}
