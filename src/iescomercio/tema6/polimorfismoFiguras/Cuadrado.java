/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.polimorfismoFiguras;

/**
 *
 * @author VESPERTINO
 */
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area;
        area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = lado * 4;
        return perimetro;
    }
}
