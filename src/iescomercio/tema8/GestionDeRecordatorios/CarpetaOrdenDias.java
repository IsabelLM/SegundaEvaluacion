/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.GestionDeRecordatorios;

import java.util.Comparator;

/**
 *
 * @author VESPERTINO
 */
public class CarpetaOrdenDias implements Comparator{
    
     @Override
    public int compare(Object o1, Object o2) {
        int aux;        
        Apunte ap1 = (Apunte) o1;
        Apunte ap2 = (Apunte) o2;
        
        aux = ap1.getFecha().DAY_OF_WEEK - ap2.getFecha().DAY_OF_WEEK;
        
        return aux;
        
    }
}
