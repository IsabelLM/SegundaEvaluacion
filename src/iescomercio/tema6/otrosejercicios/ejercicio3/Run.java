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
public class Run {
    public static void main(String[] args) {
        Ejercicio miEjercicio = new Ejercicio(-2, -3, -5);
        System.out.println(miEjercicio);
        Positivo.cambiarPositivo(miEjercicio);
        System.out.println(miEjercicio);
    }
}
