/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosejercicios.ejercicio4;

import iescomercio.tema4.aleatorio.Aleatorio;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio {
    public static Datos sumaMedia(String s){
        Datos d;
        int suma= 0, media = 0, contador = 0;
        for (int i = 0; i < s.length(); i++) {
            suma += Character.getNumericValue(s.charAt(i));
            contador ++;
        }
        media = suma / contador;
        d = new Datos(suma, media);
        return d;
    }
}
