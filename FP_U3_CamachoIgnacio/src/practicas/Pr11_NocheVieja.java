package practicas;

import java.util.Scanner;

/**
 * @author nacho En este programa el usuario debera ingresar una hora,
 * considerando que estamos en el 31 de Diciembre. 
 * El programa debera indicar
 * cuantos minutos faltan por el año nuevo. 
 * considera un formato de 24 hrs
 * ejemplo: 
 * entrada: h=23 min=45 
 * salida=15 min     ->>0:15
 * entrada: h=22 min:30 
 * salida=90 min    ->> 1:30
 */
public class Pr11_NocheVieja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int h = 0, m = 0, min = 0, hr, minu = 0;
        //pedir datos
        System.out.println("hora: ");
        h = sc.nextInt();
        System.out.println("Minutos: ");
        m = sc.nextInt();
        //proceso
        hr = 23 - h;
        min = (hr * 60) + (60 - m);
        minu = 60 - m;
        System.out.println("Quedan " + min + " minutos del año viejo");
        System.out.println( "Formato hora: "+hr+":"+minu );
    }
}
