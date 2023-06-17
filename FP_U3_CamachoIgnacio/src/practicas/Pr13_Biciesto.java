package practicas;

import java.util.Scanner;

/**
 *
 * @author nacho pedir un año. evaluar si el año es bisiesto son bisiestos si es
 * multiplo de 4
 */
public class Pr13_Biciesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int anio = 0;
        //entrada
        System.out.println("Año: ");
        anio = sc.nextInt();
        //proceso
        if (anio % 100 == 0 && anio % 400 == 00) {
            System.out.println("si es biciesto");
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            System.out.println("Si es bisiesto");
        } else {
            System.out.println("No es biciesto");
        }
    }
}
