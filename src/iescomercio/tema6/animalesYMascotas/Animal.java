/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.animalesYMascotas;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public abstract class Animal {

    private String foto, tipo_comida, localizacion, tamaño;

    public Animal(String foto, String tipo_comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.tipo_comida = tipo_comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void dormir() {
        System.out.println("zzzzz");
    }

    @Override
    public String toString() {
        return "Animal{" + "foto=" + foto + ", tipo_comida=" + tipo_comida + ", localizacion=" + localizacion + ", tama\u00f1o=" + tamaño + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.localizacion, other.localizacion)) {
            return false;
        }
        if (!Objects.equals(this.tamaño, other.tamaño)) {
            return false;
        }
        return true;
    }

    public abstract String rugir();

    public abstract String comer();

}
