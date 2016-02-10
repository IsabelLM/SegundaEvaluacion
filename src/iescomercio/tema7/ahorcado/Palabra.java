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
class Palabra {

    private String palabra, palabraEscondida;
    private StringBuilder cadenaAux;

    public Palabra(String palabra) {
        this.palabra = palabra;
        StringBuilder cadenaAux = new StringBuilder(palabra);
        for (int i = 0; i < palabra.length(); i++) {
            cadenaAux.setCharAt(i, ' ');
            cadenaAux.setCharAt(i, '-');
        }

    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabraEscondida() {
        return palabraEscondida;
    }

    public void setPalabraEscondida(String palabraEscondida) {
        this.palabraEscondida = palabraEscondida;
    }

    public boolean comprobarLetra(String s1) {
        int errores = 0;
        boolean error;
        if (palabra.indexOf(s1) == -1) {
            errores++;
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public String mostrar() {
        return cadenaAux.toString();
    }

    public static void main(String[] args) {
        Palabra miPala = new Palabra("Isabel");
        System.out.println(miPala.mostrar());
    }
}
