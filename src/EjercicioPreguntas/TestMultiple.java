/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPreguntas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

/**
 *
 * @author VESPERTINO
 */
public class TestMultiple extends Test {

    public TestMultiple(String enunciado, String respuesta, int numeroDeOpciones) {
        super(enunciado, respuesta, numeroDeOpciones);
    }

    @Override
    public float calculaPuntuacion(String respuesta) {
        StringTokenizer st = new StringTokenizer(respuesta);
        ArrayList<String> listaUsuario = new ArrayList();
        String aux;
        int aciertos = 0, fallos = 0;
        while (st.hasMoreElements()) {
            aux = st.nextToken();
            if (aux.indexOf(getRespuesta()) != -1) {
                aciertos++;
            }
            fallos++;
        }
        return aciertos;
    }
}
