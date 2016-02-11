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

//    private String ;
    private StringBuilder palabraMostrar, palabraEscondida;

    public Palabra(String palabra) {
        palabraEscondida = new StringBuilder("Ahorcado");
        palabraMostrar = new StringBuilder();
        for (int i = 0; i < palabraEscondida.length(); i++) {
            palabraMostrar.append("#");
        }
    }

    public boolean comprueba(char v) {
        int pos = 0;
        boolean sw = false;
        do {
            pos = palabraEscondida.indexOf(v + "");
            if (pos != -1) {
                sw = true;
                palabraMostrar.replace(pos, pos + 1, v + "");
                palabraEscondida.replace(pos, pos + 1, "-");
            }
        } while (pos != -1);
        return sw;
    }

    public boolean noEstaCompleta() {
        return (palabraMostrar.indexOf("#") != -1);

    }

    public void mostrar() {
        System.out.println(palabraMostrar.toString());

    }

}
