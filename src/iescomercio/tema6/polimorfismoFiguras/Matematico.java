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
public class Matematico {

    public Matematico() {
    }
    //Metodo polimorfico
    public double averiguaPerimetro(Figura fig){
        return fig.calcularArea();
    }
    //metodo polimorfico. Ya que recibe cualquier figura
    public double averiguaArea(Figura fig){
        return fig.calcularPerimetro();
    }
}
