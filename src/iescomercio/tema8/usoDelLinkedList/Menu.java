/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.usoDelLinkedList;

import iescomercio.utilidades.PedirValores;

/**
 *
 * @author Isabel
 */
public class Menu {
 
    private Usuario usu;
    private Acciones acciones;
    
    public Menu() {
       System.out.println("Digame si quiere un maximo en la coleccion,(Si no pon -1)");
       acciones=new Acciones(PedirValores.pedirInt());       
       System.out.println("Digame su nombre");
       usu= new Usuario(PedirValores.pedirString());                    
    }

    public int getOpcion() {
        return usu.getOpcion();
    }
       
    public void mostrartMenu(){
         System.out.println("\n 1. Añadir alumno \n 2. Mostrar ordenacin FIFO "
                + " \n 3. Mostrar ordenacion LIFO  "
                 + "\n 4. Sacar el objeto correspondiente de la lista "
                 + "\n 5. Enseñar el objeto ultimo incorporado "
                 +"\n 6. Numero de elementos de la lista \n 7. Salir");
    }

    public void ejecutarOpcion(){
        usu.getNombre();
        usu.getOpcion();
        usu.pedirOpcion(); 
        switch(usu.getOpcion()){
            case 1:
                acciones.addAlumno();
                break;
            case 2:
                System.out.println("Posicion \t nExpediente \t Nombre \t Nota \t Telefono");
                acciones.imprimirCola();
                break;
            case 3:
                System.out.println("Posicion \t nExpediente \t Nombre \t Nota \t Telefono");
                acciones.imprimirPila();
                break;
            case 4:   
                System.out.println("Objeto de cola");
                System.out.println(acciones.colaPasar().pop().toString());
                System.out.println("Objeto de Pila");
                System.out.println(acciones.pilaPasar().pop().toString());
                break;
            case 5:
                System.out.println("Objeto de cola");
                System.out.println( acciones.colaPasar().cima());
                System.out.println("Objeto de Pila");
                System.out.println( acciones.pilaPasar().cima());
                break;
            case 6:
                System.out.println("Size de cola");
                System.out.println(acciones.colaPasar().size());
                System.out.println("Size de Pila");
                System.out.println(acciones.pilaPasar().size());
        }                        
    }   
}
