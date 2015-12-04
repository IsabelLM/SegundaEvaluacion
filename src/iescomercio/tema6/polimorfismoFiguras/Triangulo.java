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
public class Triangulo extends Figura {

    private int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = base * 3;
        return perimetro;
    }

}
