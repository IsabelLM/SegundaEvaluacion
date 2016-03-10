/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPreguntas;

import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class Examen {

    private String nombre;
    private ArrayList<Pregunta> preguntas;
    private int npreguntas;

    public Examen(String nombre) {
        this.nombre = nombre;
        preguntas = new ArrayList();
        this.npreguntas = 0;
    }

    public int getNpreguntas() {
        return preguntas.size();
    }

    public void añadir(Pregunta p) {
        if (!preguntas.contains(p)) {
            preguntas.add(p);
        }
    }

    public Pregunta obtenerPregunta(int n) {
        return preguntas.get(n);
    }

    public void borrarPregunta(Pregunta p) {
        if (preguntas.contains(p)) {
            preguntas.remove(p);
        }
    }

    public void moverPregunta(int viejo, int nuevo) {
        Pregunta aux = preguntas.get(viejo);
        preguntas.set(viejo, preguntas.get(nuevo));
        preguntas.set(nuevo, aux);
    }
}
