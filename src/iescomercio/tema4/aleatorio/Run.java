/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.aleatorio;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Aleatorio ale = new Aleatorio();
        Aleatorio juego = new Aleatorio();
        
        ale.indicaInicialFinal();
        ale.muestraVariosAleatorios();
        
        System.out.println("_____Juego aleatorio____");
        juego.juegoAdivinaNumero();
    }
}
