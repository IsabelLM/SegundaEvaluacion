/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.ahorcado;

import iescomercio.utilidades.PedirValores;

/**
 *
 * @author VESPERTINO
 */
class Jugador {

    private String nombre;
    private char letra;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void pedirNombre() {
        setNombre(PedirValores.pedirString());
    }

    public void pedirLetra() {
        char charAt = PedirValores.pedirString().charAt(0);
        setLetra(charAt);
    }
}
