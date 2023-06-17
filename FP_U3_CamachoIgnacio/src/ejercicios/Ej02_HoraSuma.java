package ejercicios;

import java.util.Scanner;

/**
 * @author nacho pedir una cantida de horas, pedir una cantidad de minutos
 * expresarlo en formato de hh:mm pedir al usuario la cantidad de horas y
 * minutos que se le desea agregar imprimir la hora final h=3 min=15 03:15 h2= 5
 * min2=50 hr=8 m=65 hr=9 m=5 09:05
 */
public class Ej02_HoraSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = 0, m = 0, hora = 0, min = 0, hrsa = 0, minsa = 0;
        //entrada
        System.out.println("Que hora es?:");
        hr = sc.nextInt();
        System.out.println("Con cuantos minutos?: ");
        m = sc.nextInt();
        System.out.println("Cuantas horas deseas agregar?: ");
        hora = sc.nextInt();
        System.out.println("Con cuantos minutos?: ");
        min = sc.nextInt();
        //proceso
        hrsa = ((hr * 60 + m) + (hora * 60 + min)) / 60;
        minsa = m + min;
        if (minsa > 60) {
            minsa = minsa % 60;
            if (minsa<10) {
                System.out.println("la hora es: "+hrsa+":0"+minsa);
            }else{
                System.out.println("la hora es: "+hrsa+":"+minsa);
            }
        }else{
          System.out.println("serian las: " + hrsa + ":" + minsa);  
        }
        
        

    }
}
