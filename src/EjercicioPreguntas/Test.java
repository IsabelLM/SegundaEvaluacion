/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPreguntas;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author VESPERTINO
 */
public class Test extends Pregunta {

    private int numeroOpciones;

    public Test(String enunciado, String respuesta, int numeroDeOpciones) {
        super(enunciado, respuesta);
        this.numeroOpciones = numeroDeOpciones;
    }

    @Override
    public Collection opcionesValidad() {
        ArrayList<String> lista = new ArrayList();
        for (int i = 0; i < this.numeroOpciones; i++) {
            lista.add("" + (char) ('a' + i));
        }
        return lista;
    }

    @Override
    public float calculaPuntuacion(String respuesta) {
        if (getRespuesta().equalsIgnoreCase(respuesta)) {
            return 1;
        } else {
            return 1 / this.numeroOpciones;
        }
    }

}
