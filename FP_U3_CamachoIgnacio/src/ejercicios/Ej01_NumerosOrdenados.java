package ejercicios;

import java.util.Scanner;

/**
 * @author nacho 
 * E.U.P que pida 3 numeros al usuario y los imprima en orden
 * creciente
 */
public class Ej01_NumerosOrdenados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Tercer numero: ");
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n2 > n3) {
                System.out.println("El orden es: " + n3 + " " + n2 + " " + n1);
            } else {
                if (n1 > n3) {
                    System.out.println("El orden es: " + n2 + " " + n3 + " " + n1);
                } else {
                    System.out.println("El orden es: " + n2 + " " + n1 + " " + n3);
                }
            }
        } else {
            if (n1 > n3) {
                System.out.println("el orden es: " + n3 + " " + n1 + " " + n2);
            } else {
                if (n2 > n3) {
                    System.out.println("El orden es: " + n1 + " " + n3 + " " + n2);
                } else {
                    System.out.println("El orden es: " + n1 + " " + n2 + " " + n3);
                }
            }
        }
    }
}
