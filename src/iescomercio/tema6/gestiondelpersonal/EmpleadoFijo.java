/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.gestiondelpersonal;

import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class EmpleadoFijo extends Empleado {

    private String nif, Nombre;
    private byte edad;
    private int complemento;
    private GregorianCalendar añoAlta, añoActual;

    public EmpleadoFijo(String nif, String Nombre, byte edad, int complemento, int diaAlta, int mesAlta, int añoAlta, int diaActual, int mesActual, int añoActual) {
        this.nif = nif;
        this.Nombre = Nombre;
        this.edad = edad;
        this.complemento = complemento;
        this.añoAlta = new GregorianCalendar(diaAlta, mesAlta, añoAlta);
        this.añoActual = new GregorianCalendar(diaActual, mesActual, añoActual);
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    //Falta método para saber cuántos años de antigüedad tiene.
    
    @Override
    public float calculaSueldo() {
        float salario;
        salario = SALARIO_MINIMO + (complemento); //falta saber los años 

        return salario;
    }

}
