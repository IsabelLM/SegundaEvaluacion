/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.stringtokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicios {

    // Realizar un método que pida al usuario una cadena y que muestre el nº de palabras. 
    public static void numeroDePalabras(String n) {
        String delimitador = " ";

        StringTokenizer st = new StringTokenizer(n, delimitador);
        System.out.println(st.countTokens());
    }

//Otro método que  calcule y muestre por pantalla el numero de frases.
    public static void numeroDeFrases(String n) {
        String delimitador = ".";

        StringTokenizer st = new StringTokenizer(n, delimitador);
        
        System.out.println(st.countTokens());
    }
}
