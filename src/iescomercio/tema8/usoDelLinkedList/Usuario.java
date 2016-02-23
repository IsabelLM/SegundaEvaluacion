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
public class Usuario {
    private String nombre;
    private int opcion;
    
    public Usuario() {
        
    }
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void pedirOpcion(){
        System.out.println("Por favor "+this.nombre+" escoja un opcion");
        setOpcion(PedirValores.pedirInt());
    }
    public static void main(String[] args) {
        Usuario usu=new Usuario(PedirValores.pedirString());
        usu.pedirOpcion();
        System.out.println(usu.getOpcion());
    }
}