/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.stringTest.ejercicio11;

/**
 *
 * @author VESPERTINO
 */
public class DosString {

    private StringBuilder par = new StringBuilder();
    private StringBuilder impar = new StringBuilder();

    public DosString() {
    }

    public StringBuilder getPar() {
        return par;
    }

    public void setPar(StringBuilder par) {
        this.par = par;
    }

    public StringBuilder getImpar() {
        return impar;
    }

    public void setImpar(StringBuilder impar) {
        this.impar = impar;
    }

    @Override
    public String toString() {
        return "par: " + par.toString() + "\nimpar: " + impar.toString();
    }

}
