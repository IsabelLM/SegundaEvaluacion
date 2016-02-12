/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.UsoDeHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Menu {

    public void mostrarMenu() {
        System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Mostrar listado \n 4. Salir del programa");
    }

    public void ejecutaOpcion(int x) {
        switch (x) {
            case 1:
                ingresar();
            case 2:
                borrar();
            case 3:
                mostrar();
        }
    }

    private void ingresar() {
        Alumno alum = new Alumno();
        HashSet alumnos = new HashSet();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno: ");
        alum.setNombre(sc.next());
        System.out.print("Introduce el apellido del alumno: ");
        alum.setApellidos(sc.next());
        System.out.print("Introduce el telefono del alumno: ");
        alum.setNumeroDeTelefono(sc.nextInt());

        alumnos.add(alum);
    }

    private void borrar() {

    }

    private void mostrar() {

    }

    public void salir() {

    }
}
