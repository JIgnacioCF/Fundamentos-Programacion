package practicas;

import java.util.Scanner;

/**
 * @author nacho E.U.P que pida al usuario una hora inicial, con hr y min. y
 * pida tambien una hora final, con hr y min. el programa debera calcular al
 * tiempo transcurrido de una hora a la otra
 */
public class Pr12_CalcularTiempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hren, men, hrsa, msa, hr = 0, min = 0;
        //Entrada
        System.out.println("Hora de entrada: ");
        hren = sc.nextInt();
        System.out.println("Minutos de entrada: ");
        men = sc.nextInt();
        System.out.println("Hora de salida: ");
        hrsa = sc.nextInt();
        System.out.println("Minutos de salida: ");
        msa = sc.nextInt();
        //Procesos
        //restar horas
        hr = hrsa - hren;
        //minutos
        //comparar
        if (msa > men) {
            min = msa - men;
            if (min < 10) {
                System.out.println("Tiempo estimando...");
                System.out.println(hr + ":0" + min);
            } else {
                System.out.println("Tiempo estimando...");
                System.out.println(hr + ":" + min);
            }
        } else {
            //si los min de entrada son mayor
            min = (60 + msa) - men;
            hr = hr - 1;
        }
        System.out.println("Tiempoestimado...");
        //comparando las horas
        if (hr < 10) {
            System.out.print("0" + hr + " : ");
        } else {
            System.out.print(hr + " : ");
        }
        //minutos
        if (min < 10) {
            System.out.println("0" + min);
        } else {
            System.out.println(min);
        }
    }
}
