/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.operacionesConMatrices;

import iescomercio.utilidadesArray.UtilidadesArray;

/**
 *
 * @author Isabel
 */
public class Operaciones {

    private int[][] a;
    private int[][] b;

    public Operaciones(int[][] a, int[][] b) {
        this.a = a;
        this.b = b;
    }

    public Operaciones() {
        a = new int[3][3];
        b = new int[3][3];
        UtilidadesArray.rellenaArrayConAleatoriosDosI(a, 1, 9);
        UtilidadesArray.rellenaArrayConAleatoriosDosI(b, 1, 9);
    }

    public void mostrarA() {
        for (int x = 0; x < a.length; x++) {
            System.out.print("|");
            for (int y = 0; y < a[x].length; y++) {
                System.out.print(a[x][y]);
                if (y != a[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "a=" + a + ", b=" + b + '}';
    }

}
