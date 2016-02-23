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
public class Archivador {

    private ArrayList<Carpeta> archiv;
    private String nombreArchivador;

    public Archivador(String nombreArchivador) {
        this.archiv = new ArrayList();
        this.nombreArchivador = nombreArchivador;
    }
    
    public void añadirCarpeta(Carpeta carp){
        archiv.add(carp);
    }

}
