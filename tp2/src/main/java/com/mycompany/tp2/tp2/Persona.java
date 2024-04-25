
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2.tp2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 *
 * @author luka.malegni
 */
public class Persona {
    private int dni;
    private LocalDate nacimiento;
    // genero false si es femenino
    private boolean genero;
    private String nombre;
    private int peso;
    private int altura;
    private int edad;
    private boolean mayor;
    private boolean votante;
    
    private LocalDate date = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    private String text = date.format(formatter);

    
    
    
    public Persona(int dni, String nacimiento, boolean genero, String nombre, int peso, int altura){
       this.dni=dni;
       this.nacimiento=LocalDate.parse(nacimiento,formatter);
       this.genero=genero;
       this.nombre=nombre;
       this.peso=peso;
       this.altura=altura;
       
       this.edad=getEdad();
       this.mayor=getEsMayor(edad);
       this.votante=esVotante(edad);
}
    
    
    public Persona(int dni, String nombre){
        this(dni,"01,01,2001",false,"NN",1,1);
    }
    
    public Persona(int dni, String nombre, String nacimiento){
        this(dni,nacimiento,false,nombre,1,1);
    }
    
    public boolean getEsMayor(int edad){
        if(edad>=18){
            return true;
        } else {
            return false;
        }
    }
    
    public int getEdad(){
        LocalDate now = LocalDate.now();

        Period per = Period.between(nacimiento, now);
        return per.getYears();
    }
    
    public float getMc(){
        float altura_mts =(float) altura/100;
        float alt_square=altura_mts*altura_mts;

        return (float) peso/alt_square;
    }
    
    public boolean getEnForma(){
        float mc = getMc();
        if(mc>18.5&&mc<25){
            return true;
        } else{
            return false;} 
    }
    
    public boolean esCumple(){
        return nacimiento.equals(date.format(formatter));
    }
    
    public boolean esVotante(int edad){
        return edad > 16;
    }
    
    public void getInfo(){
        System.out.println("DNI: "+this.dni);
        System.out.println("NACIMIENTO: "+this.nacimiento);
        System.out.println("GENERO: "+ (this.genero?"Masculino":"Femenino"));
        System.out.println("Nombre: "+this.nombre);
        System.out.println("PESO: "+this.peso);
        System.out.println("ALTURA: "+this.altura);
        System.out.println("EDAD: "+this.edad);
        System.out.println("MAYOR: "+ (this.mayor?"Si":"No"));
        System.out.println("ES VOTANTE: "+(this.votante?"Si":"No"));
    }
    
}
