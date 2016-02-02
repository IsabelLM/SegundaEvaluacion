/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.utilidadesArray;

import java.util.Random;

/**
 *
 * @author VESPERTINO
 */
public class UtilidadesArray {

    public static void rellenaArrayConAleatorios(float[] datos, float inicio, float fin) {
        Random r = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (float)Math.floor(Math.random()*(fin-inicio+1)+inicio);
        }
    }

    public static double calculaMedia(float[] datos) {
        double suma = 0;
        for (float i : datos) {
            suma = suma + i;
        }
        return suma/datos.length;
    }
    
    public static double calcularMaximo(float[] datos){
        float max = Float.MIN_VALUE;
        for (float i: datos) {
            if(max<i){
                max = i;
            }
        }
        return max;
    }
    public static double calcularMinimo(float[] datos){
        float min = Float.MAX_VALUE;
        for (float i: datos) {
            if(min>i){
                min = i;
            }
        }
        return min;
    }
}
