/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.UsoDeHashSet1;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Alumno {

    //atributos
    private int numeroDeExpediente, numeroDeTelefono;
    private String nombre, apellidos;

    public Alumno() {

    }

    public Alumno(int pNumeroDeExpediente) {
        numeroDeExpediente = pNumeroDeExpediente;
    }

    public Alumno(int pNumeroDeExpediente, String pNombre) {
        numeroDeExpediente = pNumeroDeExpediente;
        nombre = pNombre;

    }

    public Alumno(int pNumeroDeExpediente, int pNumeroDeTelefono, String pNombre, String pApellidos) {
        numeroDeExpediente = pNumeroDeExpediente;
        nombre = pNombre;
        numeroDeTelefono = pNumeroDeTelefono;
        apellidos = pApellidos;
    }

    public void setNumeroDeExpediente(int pnumeroDeExpediente) {
        numeroDeExpediente = pnumeroDeExpediente;
    }

    public void setNumeroDeTelefono(int pNumeroDeTelefono) {
        numeroDeTelefono = pNumeroDeTelefono;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public void setApellidos(String pApellidos) {
        apellidos = pApellidos;
    }

    public int getNumeroDeExpediente() {
        return numeroDeExpediente;
    }

    public int getNumeroDeTelefono() {
        return numeroDeExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void presentate(int pNumeroDeExpediente, int pNumeroDeTelefono, String pNombre, String pApellidos) {
        numeroDeExpediente = pNumeroDeExpediente;
        nombre = pNombre;
        numeroDeTelefono = pNumeroDeTelefono;
        apellidos = pApellidos;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre +  " Apellidos: " + apellidos + " Telefono: " + numeroDeTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Alumno other = (Alumno) obj;
        if (this.numeroDeExpediente != other.numeroDeExpediente) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return true;
    }

    
    
    
}
