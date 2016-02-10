/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.ahorcado;

/**
 *
 * @author VESPERTINO
 */
class Horca {
    private int numeroFallos=0,numeroMaximo=8;

    public Horca() {
      
    }

    public int getNumeroFallos() {
        return numeroFallos;
    }

    public void setNumeroFallos(int numeroFallos) {
        this.numeroFallos = numeroFallos;
    }

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }
    
}
