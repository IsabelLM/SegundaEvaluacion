/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.GestionDeRecordatorios;

import java.util.ArrayList;
import java.util.Objects;

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

    public ArrayList<Carpeta> getArchiv() {
        return archiv;
    }

    public void setArchiv(ArrayList<Carpeta> archiv) {
        this.archiv = archiv;
    }

    public String getNombreArchivador() {
        return nombreArchivador;
    }

    public void setNombreArchivador(String nombreArchivador) {
        this.nombreArchivador = nombreArchivador;
    }

    public void añadirCarpeta(Carpeta carp) {
        archiv.add(carp);
    }

    public void comprobarCarpeta(Carpeta carp) {
        if (archiv.indexOf(carp) == -1) {
            System.out.println("La carpeta no existe.");
        } else {
            archiv.indexOf(carp);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nombreArchivador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archivador other = (Archivador) obj;
        if (!Objects.equals(this.nombreArchivador, other.nombreArchivador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Archivador: " + archiv + " Nombre archivador: " + nombreArchivador;
    }

}
