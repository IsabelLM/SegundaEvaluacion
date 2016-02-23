
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.usoDelLinkedList;

import iescomercio.utilidades.UtilidadesLista;
import java.util.LinkedList;

/**
 *
 * @author VESPERTINO
 */
public class Cola {

    private LinkedList cola;
    private int tamañoMax;

    public Cola(int tamañoMax) {
        this.tamañoMax = tamañoMax;
        this.cola = new LinkedList();
    }

    public Cola() {
        this.cola = new LinkedList();
    }

     public LinkedList getList() {
        return cola;
    }

    public void setList(LinkedList list) {
        this.cola = list;
    }
    
    public boolean estaLlena(){
        boolean respuesta=false;
        if(tamañoMax>0){
            if(tamañoMax==cola.size()){
                System.out.println("La lista esta llena");
                respuesta=true;
            }
        }
       return respuesta;
    }
    
    public boolean estaVacia(){
        boolean respuesta=false;
        if(cola.size()==0){
            System.out.println("La lista esta vacia");
            respuesta=true;
        }
       return respuesta;
    }
    
    public boolean push(Object obj){
        boolean resultado=false;
        if(!estaLlena()){
           cola.addLast(obj); 
           resultado=true;
        }else{
            resultado=false;
        }
       return resultado;
    }
    
    public Object pop(){        
        return cola.removeLast();
    }
    
    public void imprimir(){
        
        UtilidadesLista.showLista(cola);
    }
    
    public Object cima(){
        //System.out.println( "Pimer elemento de la cola"+list.getFirst());
        return cola.getLast();
    }
    
    public int  size(){
       // System.out.println("La cantidad de elementos son: "+list.size());
        return cola.size();
    }
}
