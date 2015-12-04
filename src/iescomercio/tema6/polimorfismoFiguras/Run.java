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
public class Run {

    public static void main(String[] args) {
        Figura figu = new Figura();
        Cuadrado cuadr = new Cuadrado(4);
        Triangulo trian = new Triangulo(4, 6);
        Circulo circ = new Circulo(4);
        Matematico mat = new Matematico();

        System.out.println("Area figura: " + mat.averiguaArea(figu));
        System.out.println("Perimetro figura: " +mat.averiguaPerimetro(figu));
        
        System.out.println("Area cuadrado: " + mat.averiguaArea(cuadr));
        System.out.println("Perimetro cuadrado: " + mat.averiguaPerimetro(cuadr));
        
        System.out.println("Area triangulo: " + mat.averiguaArea(trian));
        System.out.println("Perimetro triangulo: " + mat.averiguaPerimetro(trian));
        
        System.out.println("Area circulo: " + mat.averiguaArea(circ));
        System.out.println("Perimetro circulo: " + mat.averiguaPerimetro(circ));

    }
}
