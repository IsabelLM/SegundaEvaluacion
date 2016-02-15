/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.UsoDeHashSet1;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Usuario {

    private String nombre;
    private Scanner sc;

    public Usuario(String nombre) {
        sc = new Scanner(System.in);
        this.nombre = nombre;
    }
    
    public int  pedirOpcion(){
        int x = 0;
        System.out.println(nombre +", introduce la opción que quieras:");
        x = sc.nextInt();
        return x;
    }

    
}
