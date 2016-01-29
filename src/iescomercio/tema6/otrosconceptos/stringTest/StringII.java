/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest;

import iescomercio.tema4.aleatorio.Aleatorio;

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
        for (int i = 0; i < s1.length(); i = i + 2) {
            //sin terminar
        }

        return sb.toString();

    }

    public static String ejercicio8(int n, int m) {
//        int bucle, anado;
//        StringBuilder destino = new StringBuilder("");
//        StringBuilder origen;
//        Aleatorio s = new Aleatorio(0, 10);
//
//        long numeroAleatorio;
//
//        // Comprobamos entrada
//        if (n < 0 || m < 0) {
//            System.out.println("No se permiten numeros negativos");
//            return null;
//        }
//        if (m > 9) {
//            System.out.println("M no puede ser mayor de 9");
//            return null;
//        }
//        // Rellenar el String con numeros aleatorios        
//        //origen = new StringBuilder(s.muestraVariosAleatorios(10));
//
//        // Primera parte
//        for (int i = 0; i <= m; i++) {
//            destino.append(origen.charAt(i));
//        }
//        // Segunda parte
//        for (int i = 0; i < n; i++) {
//            destino.append('*');
//        }
//        // tercera parte
//        for (int i = m + 1; i < origen.length(); i++) {
//            destino.append(origen.charAt(i));
//        }
//        return destino.toString();
        return null;
    }

    public static String ejercicio9(int n) {
        StringBuilder origen = new StringBuilder("");

        if (n < 0 || n > 9) {
            System.out.println("No se permiten numeros negativos");
            return null;
        }

        for (int i = 0; i < 10; i++) {
            origen.append(i);
            if (i == n) {
                origen.append(n);
            }

        }
        return origen.toString();
    }

    public static String ejercicio10(int n) {
        StringBuilder cadena = new StringBuilder();
        StringBuilder numero = new StringBuilder();
        String aux, aux2;

        numero.append(n);
        String nS = numero.toString();

        if (n < 0 || n > 9) {
            System.out.println("No se permiten numeros negativos");
            return null;
        }

        for (int i = 1; i <= 100; i++) {
            cadena.append(i);
        }
        aux = cadena.toString();
        aux2 = aux.replaceAll(nS, "");
        return aux2;
    }

    public static String ejercicio12(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int indiceS1, indiceS2;

        indiceS1 = indiceS2 = 0;

        do {
            //Ponemos el mas pequeño de las cadenas
            if (s1.charAt(indiceS1) < s2.charAt(indiceS2)) {
                sb.append(s1.charAt(indiceS1));
                indiceS1++;
            } else {
                sb.append(s2.charAt(indiceS2));
            }
        } while (indiceS1 != s1.length() && indiceS2 != s2.length());
        //Comprobamos cual de los dos strings ha acabado
        if (indiceS1 == s1.length()) {
            sb.append(s2.substring(indiceS2, s2.length()));
        } else {
            sb.append(s1.substring(indiceS1, s1.length()));
        }
        return sb.toString();
    }

    
}
