/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosejercicios.ejercicio4;

/**
 *
 * @author VESPERTINO
 */
public class Datos {
    private int suma, media;

    public Datos(int suma, int media) {
        this.suma = suma;
        this.media = media;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Datos{" + "suma=" + suma + ", media=" + media + '}';
    }
    
    
}
