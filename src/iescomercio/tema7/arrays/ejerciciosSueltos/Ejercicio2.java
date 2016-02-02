/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.arrays.ejerciciosSueltos;

import iescomercio.utilidadesArray.UtilidadesArray;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
 //Pedir x,y,n x
//Rellenar array x
//CalcularMinimo
//CalcularMáximo
//CalcularMedia x
public class Ejercicio2 {

    public static void main(String[] args) {
        int x, y, n;
        float[] datos;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el tamaño del array: ");
        x = sc.nextInt();
        datos = new float[x];
        System.out.print("Indica el mínimo: ");
        y = sc.nextInt();
        System.out.print("Indica el máximo: ");
        n = sc.nextInt();

        UtilidadesArray.rellenaArrayConAleatorios(datos, y, n);
        
        System.out.println("La media es: " + UtilidadesArray.calculaMedia(datos));
        System.out.println("El número máximo es: " + UtilidadesArray.calcularMaximo(datos));
        System.out.println("El número mínimo es: " + UtilidadesArray.calcularMinimo(datos));
    }
}
