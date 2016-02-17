/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.treeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author VESPERTINO
 */
public class Menu {

    private Scanner sc;
    private ListaAlumnos lista;
    private TreeSet alumnos;
//    Iterator it = alumnos.iterator();
    private Alumno Alumno;

    public Menu() {
        sc = new Scanner(System.in);
        alumnos = new TreeSet();
        lista = new ListaAlumnos();
    }

    public int pedirOpcion() {
        int x = 0;
        System.out.println("Introduce la opción que quieras:");
        x = sc.nextInt();
        return x;
    }

    public void mostrarMenu() {
        System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Mostrar listado \n 4. Muestra por numero de expediente"
                + "\n 5.Muestra por numero de telefono \n 6. Muestra por nombre "
                + "\n 7. Muestra por nota \n 8. Cerrar");
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
            case 4:
                lista.muestraPorNumeroDeExpeciente();
                break;
            case 5:
                lista.muestraPorTelefono();
                break;
            case 6:
                lista.muestraPorNombre();
                break;
            case 7:
                lista.muestraPorNota();
                break;

        }
    }

    private void ingresar() {
        Alumno alum = new Alumno();
        System.out.print("Introduce el nombre del alumno: ");
        alum.setNombre(sc.next());
        System.out.print("Introduce la nota del alumno: ");
        alum.setNota(sc.nextInt());
        System.out.print("Introduce el telefono del alumno: ");
        alum.setTelefono(sc.nextLong());
        System.out.print("Introduce el numero de expediente del alumno: ");
        alum.setnExpediente(sc.nextInt());
        if (alumnos.add(alum) == false) {
            System.out.println("El alumno ya esta introducido");
        }
    }

    private void borrar() {
        Iterator it = alumnos.iterator();
        int numero, count = 0;
        Alumno aux;
        System.out.println("¿Qué elemento quieres borrar?");
        numero = sc.nextInt();

        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
        while (it.hasNext()) {
            aux = (Alumno) it.next();
            if (count == numero) {
                alumnos.remove(aux);
                break;
            }
            count++;
        }
    }

    private void mostrar() {
        Iterator it = alumnos.iterator();
        int count = 0;
        Alumno aux;
        while (it.hasNext()) {
            aux = (Alumno) it.next();
            System.out.println(count + ".-" + aux.toString());
            count++;
        }
    }
}
