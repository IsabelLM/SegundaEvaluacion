/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosejercicios.ejercicio3;

/**
 *
 * @author VESPERTINO
 */
public class Positivo {
    
    public static void cambiarPositivo(Ejercicio a){
        a.setA(Math.abs(a.getA()));
        a.setB(Math.abs(a.getB()));
        a.setC(Math.abs(a.getC()));
    }
}
