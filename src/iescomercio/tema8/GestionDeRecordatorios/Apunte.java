/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.GestionDeRecordatorios;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Apunte {

    private String asunto, texto;
    private GregorianCalendar fechaHora;

    public Apunte() {
    }

    
    
    public Apunte(String asunto, String texto, int year, int month, int dayOfMonth, int hourOfDay, int minute) {
        this.asunto = asunto;
        this.texto = texto;
        this.fechaHora = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute);
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public GregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(GregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Asunto: " + asunto + " Texto: " + texto + " fechaHora: " + fechaHora ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.asunto);
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
        final Apunte other = (Apunte) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }


    
    
    
    public static void main(String[] args) {
        Apunte a = new Apunte("Lala", "Lala", 2005, 7, 1, 12, 13);
        
        System.out.println(a.getFechaHora());
    }



    

}
