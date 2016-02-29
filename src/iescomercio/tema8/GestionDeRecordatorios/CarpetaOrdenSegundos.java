/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.GestionDeRecordatorios;

import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 *
 * @author Isabel
 */
public class CarpetaOrdenSegundos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Apunte ap1 = (Apunte) o1;
        Apunte ap2 = (Apunte) o2;

        int aux;

        aux = (int) (ap1.getFecha().get(GregorianCalendar.SECOND) - ap2.getFecha().get(GregorianCalendar.SECOND));
        //aux = a1.getNombre().compareTo(a2.getNombre());
        return aux;
    }
}
