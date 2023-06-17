package practicas;

import java.util.Scanner;

/**
 * @author nacho 
 * este programa debera pedir al usuario una cantidad de dias
 * horas y minutos y todo ello se debera expresar en segundos
 */
public class Pr09_DiasHorasMin {

    public static void main(String[] args) {
        //Declaracion
        Scanner sc = new Scanner(System.in);
        int dias, hr, min;
        long seg, segm, segh, segd;
        //pedir datos
        System.out.println("Cantidad de dias: ");
        dias = sc.nextInt();
        System.out.println("Cantidad de horas: ");
        hr = sc.nextInt();
        System.out.println("Cantidad de minutos: ");
        min = sc.nextInt();
        //procedimientos
        segm = (min * 60);//convertimos los minutos
        segh = (hr * 3600);//Convierto cant de hrs a seg
        segd = (dias * 24 * 3600);//convierto dias *24 horas y eso *3600 seg
        //Salida
        System.out.println(dias + " Dias = " + segd + " segundos");
        System.out.println(hr + " horas= " + segh + " segundos");
        System.out.println(min + " minutos = " + segm + " segundos");
        seg = segd + segm + segh;
        System.out.println("El total de segundos es: " + seg);
    }
}
