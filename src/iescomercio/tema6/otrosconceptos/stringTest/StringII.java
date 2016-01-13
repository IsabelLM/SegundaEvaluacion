/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest;

/**
 *
 * @author VESPERTINO
 */
public class StringII {

    public static boolean esPalindromo(String cadena) {
        String c1, c2;
        int indiceMitad = (cadena.length() / 2);
        c1 = cadena.substring(0, indiceMitad);
        if (cadena.length() % 2 == 0) {
            c2 = cadena.substring(indiceMitad, cadena.length());
        } else {
            c2 = cadena.substring(indiceMitad + 1, cadena.length());
        }

        c2 = reverse(c2);
        return c1.equals(c2);

    }

    public static String reverse(String a) {
        String aux = "";

        for (int inicio = 0; inicio < a.length(); inicio++) {
            aux = a.charAt(inicio) + aux;
        }
        return aux;
    }

    public static String contraseña(String s) {
        s = s.replace('a', '@');
        s = s.replace('e', '3');
        s = s.replace('i', '1');
        s = s.replace('o', '0');
        s = s.replaceAll("u", "\\");

        return s;
    }

    public static void desordenar(String s) {

        if (s.charAt(0) == '-') {
            System.out.println("El numero es negativo");
        } else if ((s.length()) % 2 != 0) {
            System.out.println("Tiene que ser par");
        } else {
            
        }

    }
}
