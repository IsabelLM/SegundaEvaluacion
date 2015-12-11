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

    private String nif, nombre;
    private byte edad;
    public static final float SALARIO_MINIMO = 645;

    public Empleado(String nif, String nombre, byte edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", Nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public abstract float calculaSueldo();


}
