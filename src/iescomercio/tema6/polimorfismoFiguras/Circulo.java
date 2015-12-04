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
public class Circulo extends Figura {

    private float pi = (float) Math.PI;
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area;
        area = pi * (radio * radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = (2 * pi) * radio;
        return perimetro;
    }

}
