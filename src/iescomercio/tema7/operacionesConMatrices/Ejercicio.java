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
public class Ejercicio {

    private int[][][] a;
    private int[][][] b;

    public Ejercicio(int[][][] a, int[][][] b) {
        this.a = a;
        this.b = b;
    }

    public Ejercicio() {
        a = new int[3][3][3];
        b = new int[3][3][3];
        UtilidadesArray.rellenaArrayConAleatoriosTres(a, 0, 9);
        UtilidadesArray.rellenaArrayConAleatoriosTres(b, 0, 9);
    }

    public int[][][] getA() {
        return a;
    }

    public int[][][] getB() {
        return b;
    }


    @Override
    public String toString() {
        return "Ejercicio{" + "a=" + a + ", b=" + b + '}';
    }

}
