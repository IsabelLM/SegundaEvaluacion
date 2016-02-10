/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.barcos;

import iescomercio.utilidades.PedirValores;

/**
 *
 * @author VESPERTINO
 */
public class Barcos {

    public static void main(String[] args) {
        char agua = '-', barco = '*';
        char[][] mar = new char[8][8];
        int columnaMenor = 0, columna, fila, columnaMayor = 0;
        for (int i = 0; i < mar.length; i++) {
            for (int j = 0; j < mar[i].length; j++) {
                mar[i][j] = agua;
            }
        }

        for (int i = 0; i < 8; i++) {

            fila = PedirValores.pedirAleatorioInt(0, 7);
            columna = PedirValores.pedirAleatorioInt(0, 7);
            if (columna > 1) {
                columnaMenor = columna - 1;
            }
            if (columna < 7) {
                columnaMayor = columna + 1;
            }
            if ((mar[fila][columnaMenor] == agua) && (mar[fila][columna] == agua) && (mar[fila][columnaMayor] == agua)) {
                mar[fila][columna] = barco;
            } else {
                i--;
            }
        }
        // Mostrar la matriz

        for (int i = 0; i < mar.length; i++) {
            for (int j = 0; j < mar[i].length; j++) {
                System.out.print(mar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
