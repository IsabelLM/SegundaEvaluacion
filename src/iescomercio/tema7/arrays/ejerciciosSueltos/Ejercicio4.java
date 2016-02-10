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
        float[] datos = {10, 1, 8, 7, 6, 5, 4, 3, 2, 3};
        float[] aux = new float[10];
        float indice = 0;
        //UtilidadesArray.rellenaArrayConAleatorios(datos, 1, 30);

        System.out.println("Sin ordenar: " + Arrays.toString(datos));

        for (int i = 0; i < datos.length; i++) {
            aux[i] += UtilidadesArray.calcularMinimo(datos);
            UtilidadesArray.borrar(datos, (int) UtilidadesArray.calculaIndiceMin(datos));
        }
        System.out.println("Indice minimo: "+UtilidadesArray.calculaIndiceMin(datos));
        System.out.println("Array original: " + Arrays.toString(datos));
        System.out.println("Ordenados: " + Arrays.toString(aux));

    }
}
