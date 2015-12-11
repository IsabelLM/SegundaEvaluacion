/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.gestiondelpersonal;

/**
 *
 * @author VESPERO
 */
public abstract class Empleado {

    private String nif, Nombre;
    private byte edad;
    public static final float SALARIO_MINIMO = 645;

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", Nombre=" + Nombre + ", edad=" + edad + '}';
    }

    public abstract float calculaSueldo();


}
