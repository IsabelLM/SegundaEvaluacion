/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.treeSet;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Menu miMenu = new Menu();
        int x;
        do {
            miMenu.mostrarMenu();
            x = miMenu.pedirOpcion();

            if (x < 1 || x > 8) {
                System.out.println("Introduce una opción valida.");
            }

            if (x != 8) {
                miMenu.ejecutaOpcion(x);
                System.out.println("________________________");
            }
        } while (x != 8);
    }
}
