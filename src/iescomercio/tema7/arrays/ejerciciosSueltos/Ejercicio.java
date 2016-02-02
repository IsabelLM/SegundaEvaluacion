/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.arrays.ejerciciosSueltos;

import iescomercio.tema4.aleatorio.Aleatorio;
import iescomercio.utilidadesArray.UtilidadesArray;

/**
 *
 * @author Isabel
 */
/*Implementar un programa en Java que cree e inicialice en instrucciones 
 separadas un array de tipo float de tamaño 20.
 Rellene dicho array con numeros aletatorios entre 0 y 10.
 Y calcule y muestre por pantalla posteriormente la nota media de los elementos del array*/
public class Ejercicio {

    public static void main(String[] args) {
        float datos[];
        datos = new float[20];
        double media;

        UtilidadesArray.rellenaArrayConAleatorios(datos, 0, 10);
        media = UtilidadesArray.calculaMedia(datos);
        System.out.println(media);

    }
}

