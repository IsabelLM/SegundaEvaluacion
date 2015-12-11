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
public class Perro extends Canino implements Mascota{

    public Perro(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }

    @Override
    public boolean equals(Object obj) {
        
        
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vacunar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
