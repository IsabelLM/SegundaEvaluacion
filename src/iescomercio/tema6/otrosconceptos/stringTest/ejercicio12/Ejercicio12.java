/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.ejercicio12;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio12 {

    public static String ejercicio12(String s1, String s2) {
        StringBuilder sb = new StringBuilder("");
        int indiceS1=0, indiceS2=0;


        do {
            //Ponemos el mas pequeño de las cadenas
            if (s1.charAt(indiceS1) < s2.charAt(indiceS2)) {
                sb.append(s1.charAt(indiceS1));
                indiceS1++;
            } else {
                sb.append(s2.charAt(indiceS2));
                indiceS2++;
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
