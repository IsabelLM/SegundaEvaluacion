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

    private String nif, nombre;
    private byte edad;
    private GregorianCalendar fAlta, fBaja;

    public EmpleadoTemporal(String nif, String nombre, byte edad, int diaAlta, int mesAlta, int añoAlta, int diaBaja, int mesBaja, int añoBaja) {
        super(nif, nombre, edad);
        this.fAlta = new GregorianCalendar(diaAlta, mesAlta, añoAlta);
        this.fBaja = new GregorianCalendar(diaBaja, mesBaja, añoBaja);

    }

    

    @Override
    public float calculaSueldo() {
        return SALARIO_MINIMO;
    }

}
