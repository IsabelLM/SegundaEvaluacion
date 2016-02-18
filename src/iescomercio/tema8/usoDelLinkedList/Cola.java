
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
public class Cola {

    private LinkedList cola;
    private int tamañoMax;

    public Cola(int tamañoMax) {
        this.tamañoMax = tamañoMax;
        this.cola = new LinkedList();
    }

    public Cola() {
        this.cola = new LinkedList();
    }

    public boolean estaLlena() {
        if (tamañoMax == cola.size()) {
            return true;
        }
        return false;
    }

    public boolean estaVacia() {
        if (cola.isEmpty()) {
            return true;
        }
        return false;
    }

    public Object pop() {
        if (estaVacia()) {
            return null;
        } else {
            return cola.pollFirst();
        }
    }

    public void push(Object o) {
        cola.addLast(o);
    }

    public Object imprimir() {
        return cola.toArray();
    }

    public Object cima() {
        return cola.peek();
    }

    public int size() {
        return cola.size();
    }
}
