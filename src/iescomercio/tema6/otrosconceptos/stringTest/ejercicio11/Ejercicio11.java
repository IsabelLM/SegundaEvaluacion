/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.ejercicio11;

/**
 *
 * @author Isabel
 */

/*11.Realizar un método que recibe un String con números pares e impares 
 de una cifra y retorna dos Strings con los números pares por un lado
 y los impares por otro.*/
public class Ejercicio11 {

    public static String ejercicio(String s1) {
        StringBuilder par = new StringBuilder();
        StringBuilder impar = new StringBuilder();

        //Comprueba si un numero es par o impar
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) % 2 == 0) {
                par.append(s1.charAt(i));
            } else {
                impar.append(s1.charAt(i));
            }
        }
        //Se devuelven dos Strings.
        //Se muestran seguidos en una misma línea, 1º los pares y luego los impares.
        return par.toString() + impar.toString();
    }
}
