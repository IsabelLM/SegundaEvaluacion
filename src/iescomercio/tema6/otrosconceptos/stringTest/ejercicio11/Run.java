/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.ejercicio11;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        // Caso 1 buena
        System.out.println("Prueba 1:\n" +Ejercicio11.ejercicio("123456789").toString());
        // Caso 2 malo
        System.out.println("Prueba 2: " +Ejercicio11.ejercicio("26-52147"));
    }
}
