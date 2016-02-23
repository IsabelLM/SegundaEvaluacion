/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.GestionDeRecordatorios;

import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class Carpeta {

    private ArrayList<Apunte> list;
    private String NombreCarpeta;

    public Carpeta(String NombreCarpeta) {
        this.list = new ArrayList();
        this.NombreCarpeta = NombreCarpeta;
    }

    public void añadirNota(Apunte ap) {
        list.add(ap);

    }

    public void borrarNota(Apunte ap) {
        list.remove(list.indexOf(ap));
    }

    public void ver(Apunte ap) {
        Apunte aux = new Apunte();
        int indice = 0;

        do {
            indice ++;
        } while (!ap.equals(aux));
        if(ap.equals(aux)){
            
        }
    }

    public void modificar(Apunte original, Apunte nuevo) {
        list.add(list.indexOf(original), nuevo);
    }

    public void listadoHoras() {

    }

    public void listadoFecha() {

    }
}
