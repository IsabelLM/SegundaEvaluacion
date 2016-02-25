/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.practicaGestion;

import iescomercio.utilidades.PedirValores;
import iescomercio.utilidades.UtilidadesLista;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author VESPERTINO
 */
public class Menu {
    
    private Apunte apunte;
    private Carpeta carpeta;
    private Archivador archivador;
    private int opcion;
    
    public Menu() {
        System.out.println("Nombre archivador: ");
        archivador=new Archivador(PedirValores.pedirString());
        System.out.println("Nombre carpeta: ");
        carpeta=new Carpeta(PedirValores.pedirString());  
        //apunte=new Apunte();
        archivador.addCarpeta(carpeta);
       // carpeta.add(apunte);
        
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {        
        this.opcion = opcion;
    }
     public void elegirOpcion() {        
        System.out.println("¿Qué opción quieres?");
        int num=PedirValores.pedirInt();
        setOpcion(num);
    }
    public void mostrarCarpeta(){
         System.out.println("\n 1. Crear Carpeta "
                + "\n 2. Ver Todas las carpetas"
                + " \n 3. Selecionar una carpeta, para interactuar con ella"
                 + "\n 4. Salir del programa ");
    }
     public void mostrarApuntes(){
         System.out.println("\n 1. Crear Apuntes "
                + "\n 2. "
                + "\n 2. Ver todos los apuntes"
                + "\n 3. Ver todos los apuntes ordenados por hora"
                + "\n 4. Ver todos los apuntes ordenadors por dia "
                + "\n 5. Ver todos los apuntes ordenados por fecha"
                + "\n 6. Volver"
                + "\n 7. Salir del programa");
    }
    public void ejecutarOpcionCarpeta(){
        mostrarCarpeta();
        elegirOpcion();
        switch(getOpcion()){
            case 1:
                System.out.println("Nombre de la carpeta para crear");
                Carpeta tmp=new Carpeta(PedirValores.pedirString());
                archivador.addCarpeta(tmp);
                break;
            case 2:
                archivador.showsCarpetas();
                break;
            case 3:
                archivador.showsCarpetas();
                System.out.println("Elige el numero de carpeta");
//                ArrayList arraylst=new ArrayList();
//                Carpeta tmp1=new Carpeta();
//                arraylst=archivador.getArchivador();
//                tmp1=(Carpeta)arraylst.get(PedirValores.pedirInt());                
                ejecutarOpcionApuntes((Carpeta)archivador.getArchivador().get(PedirValores.pedirInt()));  
                 break;
            case 4:
                setOpcion(10);
                
        }   
    }
     public void ejecutarOpcionApuntes(Carpeta carp){
        mostrarApuntes();
        elegirOpcion();
        switch(getOpcion()){
            case 1:
                Apunte tmpApunte=new Apunte();
                System.out.println("Escribe el asunto: ");
                tmpApunte.setAsunto(PedirValores.pedirString().toUpperCase());
                System.out.println("La descripcion del apunte");
                tmpApunte.setTexto(PedirValores.pedirString());
                carpeta.add(tmpApunte);
                break;
            case 2:               
                ArrayList tmp0ArrayList =new ArrayList();                        
                tmp0ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp0ArrayList);
                UtilidadesLista.showLista(tmp0ArrayList);   
                break;
            case 3:
                CarpetaOrdenadaHoras ordenHoras= new CarpetaOrdenadaHoras();
                ArrayList tmpArrayList =new ArrayList();                        
               tmpArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmpArrayList, ordenHoras);
                UtilidadesLista.showLista(tmpArrayList);              
                break;
            case 4:
                CarpetaOrdenadaDias ordenDia= new CarpetaOrdenadaDias();
                ArrayList tmp1ArrayList =new ArrayList();                        
                tmp1ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp1ArrayList, ordenDia);
                UtilidadesLista.showLista(tmp1ArrayList);              
                break;
            case 5:
                CarpetaOrdenadaFecha ordenFecha= new CarpetaOrdenadaFecha();
                ArrayList tmp2ArrayList =new ArrayList();                        
                tmp2ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp2ArrayList, ordenFecha);
                UtilidadesLista.showLista(tmp2ArrayList);          
                break;
            case 6:
               ejecutarOpcionCarpeta();
            case 7:
                setOpcion(10);
              
                
        }        
    } 
}