/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.operacionesConMatrices;

/**
 *
 * @author Isabel
 */
public class Operaciones {

    public static int[][] suma(int[][] a, int[][] b) {
        int[][] suma = new int[3][3];
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                suma[x][y] = a[x][y] + b[x][y];
            }
        }
        return suma;
    }

    public static int[][] resta(int[][] a, int[][] b) {
        int[][] resta = new int[3][3];
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                resta[x][y] = a[x][y] - b[x][y];
            }
        }
        return resta;
    }

    public static int[][] multiplicacion(int[][] a, int[][] b) {
        int[][] aux = new int[3][3];
        int[][] aux2 = new int[3][3];

        for (int x = 0; x < a.length; x++) {

            for (int f = 0; f < a.length; f++) {
                for (int c = 0; c < a[f].length; c++) {
                    aux[f][c] += a[f][c] * b[c][f];
                }                
            }
        }
        return aux;
    }

    public static void mostrar(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y] + "\t");
            }
            System.out.println("");
        }
    }

}
