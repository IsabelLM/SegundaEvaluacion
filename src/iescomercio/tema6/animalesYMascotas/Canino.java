/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.animalesYMascotas;

/**
 *
 * @author VESPERTINO
 */
public class Canino extends Animal{

    public Canino(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }

    @Override
    public String rugir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean hacerRuido(){
        boolean ruido = false;
        return ruido;
    }
}
