/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema7.ahorcado;

/**
 *
 * @author VESPERTINO
 */
public class Ahorcado {
    public void jugar(){
       Jugador jugador=new Jugador(null);
       Palabra palabra=new Palabra(null);
       Horca horca=new Horca();
       Ahorcado ahoracado=new Ahorcado();
       ListaFallos listaFallos=new ListaFallos(null);
       
       jugador.pedirNombre();
       palabra.getPalabraEscondida();
       horca.getNumeroFallos();
       horca.getNumeroMaximo();
       listaFallos.getLista();
        do {            
            jugador.pedirLetra(); //Tengo que limitar la entrada de un solo caracter etc...
           // palabra.comprobarLetra(jugador.getLetra());
            
        } while (true);
       
        //do {            
        //pedir nombre al Jugador
        //palabra.mostrar();
        //horca.mostrar();
        //lista.mostrar();
        //jugador.pedirletra(),
        //if(!Palabra.comprobar){
        //horca.poner item
        // lista.metePlabra
        //}
        //} while (horca.noEstasMuerto or Palabra.noCompleta);

        
        
    }
}
