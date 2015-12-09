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
public class EmpleadoTemporal extends Empleado {

    private String nif, Nombre;
    private byte edad;
    private GregorianCalendar fAlta, fBaja;

    public EmpleadoTemporal(String nif, String Nombre, byte edad, int diaAlta, int mesAlta, int añoAlta, int diaBaja, int mesBaja, int añoBaja) {
        this.nif = nif;
        this.Nombre = Nombre;
        this.edad = edad;
        this.fAlta = new GregorianCalendar(diaAlta, mesAlta, añoAlta);
        this.fBaja = new GregorianCalendar(diaBaja, mesBaja, añoBaja);

    }

    public EmpleadoTemporal() {
    }

    @Override
    public float calculaSueldo() {
       float sueldo;
       sueldo = SALARIO_MINIMO;
       return sueldo;
    }

}
