/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import iescomercio.tema8.usoDelLinkedList.Pila;

/**
 *
 * @author VESPERTINO
 */
public class PilaTest {
    private Pila pila1, pila2;
    
    public PilaTest() {
        pila1 = new Pila();
        pila2 = new Pila(3);
        pila2.push("o1");
        pila2.push("o2");
        pila2.push("o3");
    }
    // Pruebas con pila1
    @Test
    public void casoVacio() {
        assertEquals(null, pila1.pop());
    }
    
    @Test
    public void casoEstaVacia() {        
        assertEquals(true, pila1.estaVacia());
    }
    
    // Pruebas con pila2
    @Test
    public void casoTamaño() {        
        assertEquals(3, pila2.size());
    }
    
    @Test
    public void casoCima() {        
        assertEquals("o3", pila2.cima());
    }
    
    @Test
    public void casoPetado() {       
        assertEquals(false, pila2.push("o4"));
    }
    
    
    
    @Test
    public void casoEstaLlena() {        
        assertEquals(true, pila2.estaLlena());
    }
    
    
}
