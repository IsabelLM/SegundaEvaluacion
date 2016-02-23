/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.usoDelLinkedList;

import iescomercio.utilidades.UtilidadesLista;
import java.util.LinkedList;

/**
 *
 * @author VESPERTINO
 */
public class Pila {

    private LinkedList pila;
    private int tamañoMax;

    public Pila() {
        this.pila = new LinkedList();
    }

    public Pila(int tamañoMax) {
        this.tamañoMax = tamañoMax;
        this.pila = new LinkedList();

    }

    public boolean estaLlena() {
        boolean respuesta = false;
        if (tamañoMax > 0) {
            if (tamañoMax == pila.size()) {
                System.out.println("La lista esta llena");
                respuesta = true;
            }
        }
        return respuesta;
    }

    public boolean estaVacia() {
        boolean respuesta = false;
        if (pila.size() == 0) {
            System.out.println("La lista esta vacia");
            respuesta = true;
        }
        return respuesta;
    }

    public boolean push(Object obj) {
        boolean resultado = false;
        if (!estaLlena()) {
            pila.addFirst(obj);
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public Object pop() {
        return pila.removeFirst();
    }

    public void imprimir() {

        UtilidadesLista.showLista(pila);
    }

    public Object cima() {
        //System.out.println( "Pimer elemento de la cola"+list.getLast());
        return pila.getFirst();
    }

    public int size() {
        //System.out.println("La cantidad de elementos son: "+list.size());
        return pila.size();
    }
}
