/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.UsoDeHashSet;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Usuario miUsuario = new Usuario("Isabel");
        Menu miMenu = new Menu();
        int x;
        do {
            miMenu.mostrarMenu();
            x = miUsuario.pedirOpcion();
            if (x != 4) {
                miMenu.ejecutaOpcion(x);
            }
        } while (x != 4);

    }

}
