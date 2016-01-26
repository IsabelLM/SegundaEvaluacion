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

/*11.Realizar un método que recibe un String con números pares e impares 
 de una cifra y retorna dos Strings con los números pares por un lado
 y los impares por otro.*/
public class Ejercicio11 {

    public static DosString ejercicio(String s1) {
        StringBuilder par = new StringBuilder();
        StringBuilder impar = new StringBuilder();
        String s = "\n";

        //Comprueba si un número es par o impar y lo va añadiendo
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) % 2 == 0) {
                par.append(s1.charAt(i)); 
            } else {
                impar.append(s1.charAt(i));
            }
        }
        return par.toString() + s + impar.toString();
    }
}
