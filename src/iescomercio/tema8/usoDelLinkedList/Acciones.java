/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.usoDelLinkedList;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Acciones {

    private Scanner sc;
    private Pila pila;
    private Cola cola;
    private int maximo;

    public Acciones() {
        sc = new Scanner(System.in);
        cola = new Cola();
        pila = new Pila();
    }

    public Acciones(int maximo) {
        sc = new Scanner(System.in);
        this.maximo = maximo;
        cola = new Cola(maximo);
        pila = new Pila(maximo);
    }

    public void addAlumno() {
        Alumno alum = new Alumno();

        System.out.print("Introduce el nombre del alumno: ");
        alum.setNombre(sc.next());
        System.out.print("Introduce el expediente del alumno: ");
        alum.setNumeroDeExpediente(sc.nextInt());
        System.out.print("Introduce la nota del alumno: ");
        alum.setNota(sc.nextInt());
        System.out.print("Introduce el telefono del alumno: ");
        alum.setNumeroDeTelefono(sc.nextInt());

        if (!cola.estaLlena()) {
            cola.push(alum);
        }
        if (!pila.estaLlena()) {
            pila.push(alum);
        }

    }

    public void imprimirCola() {
        cola.imprimir();
    }

    public void imprimirLista() {
        pila.imprimir();
    }
}
