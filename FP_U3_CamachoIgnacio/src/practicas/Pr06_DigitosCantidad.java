package practicas;

import java.util.Scanner;

/**
 * @author nacho 
 * en este programa debera imprimir cuantos digitos tiene una
 * cantidad que el usuario ingrese desde teclado la cantidad puede ser desde 1
 * hasta 99,999
 */
public class Pr06_DigitosCantidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad: ");
        int num = sc.nextInt();
        //iniciamos el proceso
        if (num < 10) {
            System.out.println("Tiene un digito");
        } else if (num < 100) {
            System.out.println("Tiene 2 digitos");
        } else if (num < 1000) {
            System.out.println("Tiene 3 digitos");
        } else if (num < 10000) {
            System.out.println("Tiene 4 digitos");
        } else if (num < 100000) {
            System.out.println("Tiene 5 digitos");
        }
    }
}
