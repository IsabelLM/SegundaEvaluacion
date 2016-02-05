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
/*Dado un array de 10.000 
 rellenado con aleatorio entre 0 y 25.000 
 calcular tiempo con el metodo 
 y calcular tiempo con el sort*/
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] datos = new int[30];

        UtilidadesArray.rellenaArrayConAleatorios(datos, 0, 300);
        UtilidadesArray.ordenarArrayMenorMayor(datos);
        System.out.println(Arrays.toString(datos));
    }
}
