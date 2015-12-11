/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.gestiondelpersonal;

/**
 *
 * @author VESPERTINO
 */
public class EmpleadoPorHoras extends Empleado {

    private String nif, Nombre;
    private byte edad;
    private int horasMes;
    private float precioHora;

    public EmpleadoPorHoras(String nif, String Nombre, byte edad, int horasMes, float precioHora) {
        this.nif = nif;
        this.Nombre = Nombre;
        this.edad = edad;
        this.horasMes = horasMes;
        this.precioHora = precioHora;
    }

    //Las horas del mes se pueden cambiar.
    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    
    @Override
    public float calculaSueldo() {
        float salario;
        salario = (precioHora * horasMes) + SALARIO_MINIMO;
        return salario; 
    }

}
