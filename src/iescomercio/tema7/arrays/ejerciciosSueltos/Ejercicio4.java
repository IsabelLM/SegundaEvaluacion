/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.arrays.ejerciciosSueltos;

import iescomercio.utilidadesArray.UtilidadesArray;
import java.util.Arrays;

/**
 *
 * @author VESPERTINO
 */

/*Realizar un metodo que reciba un vector y retorne dicho vector ordenado. Utilizando los metodos ya creados calculaMax y calculaMin*/
public class Ejercicio4 {

    public static void main(String[] args) {
        float[] datos = new float[10];
        float[] aux = new float[10];
        UtilidadesArray.rellenaArrayConAleatorios(datos, 1, 20);

        for (int i = 0; i < datos.length; i++) {

            aux[i] +=  UtilidadesArray.calcularMinimo(datos);
            UtilidadesArray.borrar(datos, i);
        }
        System.out.println(Arrays.toString(aux));
    }
}
