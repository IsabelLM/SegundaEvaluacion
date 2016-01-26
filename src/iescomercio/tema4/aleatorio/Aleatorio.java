/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.aleatorio;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Aleatorio {

    private int inicial, afinal;

    public Aleatorio() {

    }

    public Aleatorio(int pInicial, int pFinal) {
        inicial = pInicial;
        afinal = pFinal;
    }

    public void setInicial(int pInicial) {
        inicial = pInicial;
    }

    public void setFinal(int pFinal) {
        afinal = pFinal;
    }

    public void indicaInicialFinal() {
        //Método para que el usuario indique entre que dos numeros quiere generar aleatorios
        Scanner sc = new Scanner(System.in);
        int i, f;
        System.out.println("Indica un numero inicial y uno final");
        i = sc.nextInt();
        f = sc.nextInt();
        inicial = i;
        afinal = f;
    }

    public int generarUnAleatorioEntero() {
        //Método para generar solo 1 aleatorio entero
        int aleatorio = 1, valorAleatorio = 0;
        for (; aleatorio != 0; aleatorio--) {

            valorAleatorio = (int) Math.floor(Math.random() * (inicial - afinal + 1) + afinal);

        }
        return valorAleatorio;
    }

    public double generarunAleatorioDouble() {
        //Método para generar 1 aleatorio con decimales
        double aleatorio = 1, valorAleatorio = 0;
        for (; aleatorio != 0; aleatorio--) {

            valorAleatorio = Math.random() * (inicial - afinal) + afinal;
        }
        return valorAleatorio;
    }

    public void muestraVariosAleatorios() {
        //Metodo que pide al usuario que indique cuántos aleatorios quiere que genere
        Scanner sc = new Scanner(System.in);
        int aleatorios, valorAleatorio;

        System.out.println("Di cuantos aleatorios quieres que se muestren:");
        aleatorios = sc.nextInt();

        for (; aleatorios != 0; aleatorios--) {
            //Para sacar enteros:
            valorAleatorio = (int) Math.floor(Math.random() * (inicial - afinal + 1) + afinal);
            //Para sacar decimales:
            // valorAleatorio = Math.random() * (inicial - afinal) + afinal;
            System.out.println(valorAleatorio);
        }
    }

    public void juegoAdivinaNumero() {
        //Metodo para adivinar un numero. Al final muestra cuantos errores se han cometido.
        Scanner sc = new Scanner(System.in);
        int n, numAleatorio = 0, error = 0;

        numAleatorio = (int) Math.floor(Math.random() * 101);

        System.out.println("Dime un número:");
        n = sc.nextInt();
        do {
            if (n < numAleatorio) {
                System.out.println("El numero es mayor, dime otro número:");
                n = sc.nextInt();
            } else {
                System.out.println("El numero es menor, dime otro número:");
                n = sc.nextInt();
            }
            error++;
        } while (n != numAleatorio);

        if (n == numAleatorio) {
            System.out.println("Has acertado.");
            System.out.println("Has cometido " + error + " errores.");
        }
    }

}
