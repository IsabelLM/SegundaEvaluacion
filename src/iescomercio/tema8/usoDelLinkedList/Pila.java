/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.usoDelLinkedList;

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
        if (tamañoMax == pila.size()) {
            return true;
        }
        return false;
    }

    public boolean estaVacia() {
        if (pila.isEmpty()) {
            return true;
        }
        return false;
    }

    public Object pop() {
        if (estaVacia()) {
            return null;
        } else {
            return pila.pollLast();
        }
    }

    public void push(Object o) {
        pila.addFirst(o);
    }

    public Object imprimir() {
        return pila.toArray();
    }

    public Object cima() {
        return pila.peekLast();
    }

    public int size() {
        return pila.size();
    }
}
