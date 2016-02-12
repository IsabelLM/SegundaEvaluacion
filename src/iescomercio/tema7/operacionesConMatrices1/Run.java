/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.operacionesConMatrices1;

/**
 *
 * @author Isabel
 */
public class Run {

    public static void main(String[] args) {
        int[][] a = {{2, 0, 1}, {3, 0, 0}, {5, 1, 1}};
        int[][] b = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
        int[][] aux = new int[3][3];

        aux = Operaciones.suma(a, b);
        Operaciones.mostrar(aux);

        System.out.println("-----------");
        aux = Operaciones.resta(a, b);
        Operaciones.mostrar(aux);

        System.out.println("--------");

        aux = Operaciones.multiplicacion(a, b);
        Operaciones.mostrar(aux);

    }

}
