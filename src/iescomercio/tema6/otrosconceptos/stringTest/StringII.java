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

    //EJERCICIO 5
    public static void desordenar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                System.out.println("Solo se permiten numeros enteros o el cero.");
            }
        }
        if ((s.length()) % 2 != 0) {
            System.out.println("Tiene que ser par");
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length() / 2; i++) {
            System.out.print(sb.charAt(i) + "" + sb.charAt(sb.length() - 1 - i));

        }
//        int i = (s.length() / 2);
//        StringBuilder a = new StringBuilder();
//        StringBuilder b = new StringBuilder();
//        StringBuilder ab = new StringBuilder();
//        a.append(s.substring(0, i));
//        b.append(s.substring(i, s.length()));
//        b.reverse();
//
//        for (int j = 0; j < a.length(); j++) {
//            ab.append(a.charAt(j));
//            ab.append(b.charAt(j));
//        }
//        System.out.println("El resultado es: " + ab);        
    }

    //EJERCICIO 6
    public static String ejercicio6(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        if (s1.length() != s2.length()) {
            System.out.println("Tienen que tener el mismo tamaño.");
            return null;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < '0' || s1.charAt(i) > '9' || s2.charAt(i) < '0' || s2.charAt(i) > '9') {
                System.out.println("Solo se permiten numeros enteros o el cero.");
                return null;
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        return sb.toString();
    }

    public static String ejercicio7(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        if (s1.length() % 3 != 0 || s2.length() % 3 != 0) {
            System.out.println("El tamaño no es multiplo de 3");
            return null;
        }
        if (s1.length() != s2.length()) {
            System.out.println("Tienen que tener el mismo tamaño.");
            return null;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < '0' || s1.charAt(i) > '9' || s2.charAt(i) < '0' || s2.charAt(i) > '9') {
                System.out.println("Solo se permiten numeros enteros o el cero.");
                return null;
            }
        }
        for (int i = 0; i < s1.length(); i = i+2) {
               
            }

        
        return sb.toString();

    }
}
