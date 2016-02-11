/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.ahorcado;

import iescomercio.utilidades.PedirValores;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
class Jugador {

    private String nombre;
    private char letra;
    private Scanner sc;

    public Jugador() {
        sc = new Scanner(System.in);
    }

    public void pedirNombre() {
        System.out.println("Introduce tu nombre: ");
        nombre = sc.next();
    }

    public char dimeLetra() {
        System.out.println("Dime la letra que quieres probar " + nombre);
        letra = sc.next().toUpperCase().charAt(0);
        return letra;
    }

}
