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

    public String getNombreCarpeta() {
        return NombreCarpeta;
    }

    public void setNombreCarpeta(String NombreCarpeta) {
        this.NombreCarpeta = NombreCarpeta;
    }

    public ArrayList<Apunte> getList() {
        return list;
    }

    public void setList(ArrayList<Apunte> list) {
        this.list = list;
    }

        
    public void añadirNota(Apunte ap) {
        list.add(ap);
    }

    public void borrarNota(Apunte ap) {
        list.remove(list.indexOf(ap));
    }

    public void ver(String ap) {
        Apunte aux=new Apunte(ap.toUpperCase(), "");
        list.get(list.indexOf(aux)).toString();
    }

    public void modificar(Apunte original, Apunte nuevo) {
        list.add(list.indexOf(original), nuevo);
    }
   
}
