/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema8.practicaGestion;

import java.util.Comparator;

/**
 *
 * @author VESPERTINO
 */
public class CarpetaOrdenadaDias implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Apunte ap1 = (Apunte) o1;
        Apunte ap2 = (Apunte) o2;

        int aux;

        aux = (int) (ap1.getDias() - ap2.getDias());
        return aux;
    }

}
