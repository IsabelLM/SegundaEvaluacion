/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.gestiondelpersonal;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class EmpleadoFijo extends Empleado {

    private String nif, nombre;
    private byte edad;
    private int complemento, añoIngreso, añoActual;
    //private GregorianCalendar añoAlta, añoActual;

    public EmpleadoFijo(String nif, String nombre, byte edad, int complemento) {
        super(nif, nombre, edad);
        this.complemento = complemento;
        Calendar today = Calendar.getInstance();
        this.añoIngreso = today.getTime().getYear() + 1900;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    public int getComplemento() {
        return complemento;
    }

    @Override
    public float calculaSueldo() {
        int diferenciaAños;
        float salario;

        Calendar aux = Calendar.getInstance();

        añoActual = aux.getTime().getYear() + 1900;
        diferenciaAños = getAñoIngreso() - getAñoActual();

        salario = SALARIO_MINIMO + (complemento * diferenciaAños);

        return salario;
    }

}
