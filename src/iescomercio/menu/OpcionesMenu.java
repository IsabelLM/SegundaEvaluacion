/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.menu;

import iescomercio.tema8.GestionDeRecordatorios.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

/**
 *
 * @author PROF_VESPERTINO
 */
public class OpcionesMenu {

    private Scanner sc;
    private Apunte apun;
    private Carpeta carp;
    private Archivador arch;

    public OpcionesMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del apunte:");
        this.apun = new Apunte(sc.next());
        System.out.println("Nombre de la carpeta: ");
        this.carp = new Carpeta(sc.next());
        System.out.println("Nombre del archivador: ");
        this.arch = new Archivador(sc.next());
    }
    

    public void añadirApunte() {
        arch.comprobarCarpeta(carp);
        Apunte aux = new Apunte();
        System.out.println("Dime el asunto del apunte:");
        aux.setAsunto(sc.next());
        System.out.println("Dime la descripcion del apunte");
        aux.setTexto(sc.next());
        
        carp.añadirNota(aux);
    }

    public void borrarApunte() {
        
        
    }

    public void salirApunte() {
        System.out.println("salir apunte");
    }

    public void añadirCarpeta() {
        System.out.println("Añadir una carpeta al archivador");
    }

}
