/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.UsoDeHashSet1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    HashSet alumnos = new HashSet();

    public void mostrarMenu() {
        System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Mostrar listado \n 4. Salir del programa");
    }

    public void ejecutaOpcion(int x) {
        switch (x) {
            case 1:
                ingresar();
                System.out.println("El alumno ha sido añadido.");
                break;
            case 2:
                borrar();
                System.out.println("El alumno ha sido eliminado.");
                break;
            case 3:
                mostrar();
                break;
        }
    }

    private void ingresar() {
        Alumno alum = new Alumno();
        System.out.print("Introduce el nombre del alumno: ");
        alum.setNombre(sc.next());
        System.out.print("Introduce el apellido del alumno: ");
        alum.setApellidos(sc.next());
        System.out.print("Introduce el telefono del alumno: ");
        alum.setNumeroDeTelefono(sc.nextInt());
        alumnos.add(alum);
    }

    private void borrar() {
        int numero, count = 0;
        System.out.println("¿Qué elemento quieres borrar?");
        numero = sc.nextInt();
        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
        do {
            
        } while (count != numero);
    }

    private void mostrar() {
        Iterator it = alumnos.iterator();
        int count = 1;
        while (it.hasNext()) {
            System.out.println(count + ".-" + it.next());
            count++;
        }
    }
}
