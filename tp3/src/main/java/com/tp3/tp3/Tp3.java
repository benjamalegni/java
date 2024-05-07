/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tp3.tp3;
import java.time.LocalDate;

/**
 *
 * @author luka.malegni
 */
public class Tp3 {

    public static void main(String[] args) {
        ColeccionControlada c = new ColeccionControlada();
        c.add("hola");
        c.add("el pepe");
        System.out.println(c.size());
        
        //ListaVinculada lista = new ListaVinculada("hola");
        //lista.addNode("amigos");
        //lista.addNode("de youtube");
        //lista.printList();
        
        Banco b = new Banco();
        Cuenta ccuenta;
        ccuenta = b.newCuenta("benja", 1500, Boolean.TRUE);
        ccuenta.deposito(10000);
        System.out.println(ccuenta.getSaldo());
        
        }
}
