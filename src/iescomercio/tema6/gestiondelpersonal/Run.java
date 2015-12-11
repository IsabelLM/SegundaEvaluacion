/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.gestiondelpersonal;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        EmpleadoTemporal aitor = new EmpleadoTemporal("1616", "Aitor",(byte) 32, 7, 10, 1993, 8, 7, 1995);
        EmpleadoFijo angel = new EmpleadoFijo("16161", "Angel", (byte) 16, 50);
        EmpleadoPorHoras gerardo = new EmpleadoPorHoras("215", "Gerardo", (byte) 22, 30, 8);
        
        System.out.println(aitor.calculaSueldo());
        System.out.println(angel.calculaSueldo());
        System.out.println(gerardo.calculaSueldo());
        
    }
    
    
}
