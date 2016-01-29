/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.otrosconceptos.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE 'a' dd 'de' MMMM 'de' yyyy "
                + "'y son las' HH 'horas y' mm 'minutos y' s 'segundos'");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
    }
}
