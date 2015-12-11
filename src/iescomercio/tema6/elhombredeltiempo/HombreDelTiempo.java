/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema6.elhombredeltiempo;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class HombreDelTiempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, temperatura, contadorEnero = 0, contadorFebrero = 0, contadorMarzo = 0,
                contadorAbril = 0, contadorMayo = 0, contadorJunio = 0, contadorJulio = 0, contadorAgosto = 0,
                contadorSeptiembre = 0, contadorOctubre = 0, contadorNoviembre = 0, contadorDiciembre = 0;

        float mediaEnero = 0, mediaFebrero = 0, mediaMarzo = 0,
                mediaAbril = 0, mediaMayo = 0, mediaJunio = 0, mediaJulio = 0, mediaAgosto = 0, mediaSeptiembre = 0,
                mediaOctubre = 0, mediaNoviembre = 0, mediaDiciembre = 0;

        //pide los datos 10 veces
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Introduce día, més, año y temperatura");
                dia = sc.nextInt();
                mes = sc.nextInt();
                año = sc.nextInt();
                temperatura = sc.nextInt();
                if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
                    System.out.println("La fecha no es correcta.");
                }
                switch (mes) {
                    case 1:
                        mediaEnero += temperatura;
                        contadorEnero++;
                        break;
                    case 2:
                        mediaFebrero += temperatura;
                        contadorFebrero++;
                        break;
                    case 3:
                        mediaMarzo += temperatura;
                        contadorMarzo++;
                        break;
                    case 4:
                        mediaAbril += temperatura;
                        contadorAbril++;
                        break;
                    case 5:
                        mediaMayo += temperatura;
                        contadorMayo++;
                        break;
                    case 6:
                        mediaJunio += temperatura;
                        contadorJunio++;
                        break;
                    case 7:
                        mediaJulio += temperatura;
                        contadorJulio++;
                        break;
                    case 8:
                        mediaAgosto += temperatura;
                        contadorAgosto++;
                        break;
                    case 9:
                        mediaSeptiembre += temperatura;
                        contadorSeptiembre++;
                        break;
                    case 10:
                        mediaOctubre += temperatura;
                        contadorOctubre++;
                        break;
                    case 11:
                        mediaNoviembre += temperatura;
                        contadorNoviembre++;
                        break;
                    case 12:
                        mediaDiciembre += temperatura;
                        contadorDiciembre++;
                        break;
                }
            } while (dia <= 0 || dia > 31 || mes <= 0 || mes > 12);
        }
        mediaEnero = mediaEnero / contadorEnero;
        mediaFebrero = mediaFebrero / contadorFebrero;
        mediaMarzo = mediaMarzo / contadorMarzo;
        mediaAbril = mediaAbril / contadorAbril;
        mediaMayo = mediaMayo / contadorMayo;
        mediaJunio = mediaJunio / contadorJunio;
        mediaJulio = mediaJulio / contadorJulio;
        mediaAgosto = mediaAgosto / contadorJulio;
        mediaSeptiembre = mediaSeptiembre / contadorSeptiembre;
        mediaOctubre = mediaOctubre / contadorOctubre;
        mediaNoviembre = mediaNoviembre / contadorNoviembre;
        mediaDiciembre = mediaDiciembre / contadorDiciembre;

        System.out.println("Enero " + mediaEnero
                + "\nFebrero " + mediaFebrero
                + "\nMarzo " + mediaMarzo
                + "\nAbril " + mediaAbril
                + "\nMayo " + mediaMayo
                + "\nJunio " + mediaJunio
                + "\nJulio " + mediaJulio
                + "\nAgosto " + mediaAgosto
                + "\nSeptiembre " + mediaSeptiembre
                + "\nOctubre" + mediaOctubre
                + "\nNoviembre " + mediaNoviembre
                + "\nDiciembre " + mediaDiciembre);
    }
}
