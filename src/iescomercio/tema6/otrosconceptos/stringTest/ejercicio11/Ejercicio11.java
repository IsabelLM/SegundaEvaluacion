/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.ejercicio11;

import iescomercio.utilidades.Utilidades;

/**
 *
 * @author VESPERTINO
 */

/*11.Realizar un método que recibe un String con números pares e impares 
 de una cifra y retorna dos Strings con los números pares por un lado
 y los impares por otro.*/
public class Ejercicio11 {

    public static DosString ejercicio(String s1) {
        DosString ds = new DosString();

        //Comprobar si es un numero positivo o 0.
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < '0' || s1.charAt(i) > '9') {
                System.out.println("Solo se permiten numeros enteros o el cero.");
                return null;
            }
        }
        //Comprueba si un número es par o impar y lo va metiendo a dónde corresponde
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) % 2 == 0) {
                ds.setPar(ds.getPar().append(s1.charAt(i)));
            } else {
                ds.setImpar(ds.getImpar().append(s1.charAt(i)));
            }
        }
        return ds;
    }
}
