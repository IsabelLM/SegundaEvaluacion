/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPreguntas;

import java.util.Collection;

/**
 *
 * @author VESPERTINO
 */
public abstract class Pregunta {
        private String enunciado, respuesta;
        private int dificultad;

    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.dificultad = 0;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    
    public abstract Collection opcionesValidad();
        
    public abstract float calculaPuntuacion(String respuesta);
    
        
}
