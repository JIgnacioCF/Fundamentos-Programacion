package practicas;

import java.util.Scanner;

/**
 * @author nacho
 */
public class Pr07_Par_Impar {

    public static void main(String[] args) {
        //Declaracion
        Scanner sc = new Scanner(System.in);
        int num;
        //Pedir datos
        System.out.println("Numero: ");
        num = sc.nextInt();
        //Procedimiento
        //Realizar la divicion modular entre 2, y si el residuo es 0
        //significa que si es par, por que no hay residuo
        //si no entonces es impar
        if (num % 2 == 0) {
            System.out.println("Numero es par");
        } else {
            System.out.println("Numero es impar");
        }
    }
}
