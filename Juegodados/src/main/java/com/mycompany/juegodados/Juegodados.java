package com.mycompany.juegodados;
/**
 *
 * @author luka.malegni
 */

public class Juegodados {

    private Cup cup;
    private Player j1;
    private Player j2;
    private Dice d1;
    private Dice d2;
    
    public Juegodados(String nombre1, String nombre2, int caras1, int caras2,int cantdados){
    j1 = new Player(nombre1);
    j2 = new Player(nombre2);
 
    d1 = new Dice(caras1);
    d2 = new Dice(caras2);
    
    cup = new Cup(cantdados);
    }
    
    public Juegodados(int caras1, int caras2){
    this("jugador1", "jugador2", 6, 6,2);
    }
    
    
    
    public void jugar(){
        for(int i=0; i<10;i++){
            int sum1 = cup.tirar();
            int sum2 = cup.tirar();
            
            System.out.println(j1.getName()+": suma: "+sum1);
            System.out.println(j2.getName()+": suma: "+sum2);
            
            if(sum1>7 && sum1>sum2){
                j1.incrementScore();
            }
            else if(sum2>7 && sum2>sum1){
                j2.incrementScore();
            }
            }
         System.out.println(ganador(j1,j2));
    }
        
    public String ganador(Player j1,Player j2){
        if(j1.getScore()>j2.getScore()){
            return j1.getName();
        }
        else
            if(j2.getScore()>j1.getScore()){
            return j2.getName();
            }
else 
    return j1.getName() + " Y " + j2.getName() + "estan empatados";
    }
    
    
    public static void main(String[] args){
        Juegodados juego = new Juegodados(6,6);
        juego.jugar();
    }
    
}

