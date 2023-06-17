package practicas;

/**
 * @author nacho el programa debe imprimir el mayor de 3 numeros
 */
import java.util.Scanner;

public class Pr04_Pedir3Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Tercer numero: ");
        num3 = sc.nextInt();
        //iniciamos comparaciones
        //vamos a compara si el primero es el mayor
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es el número " + num1);
        } else {//si el primero no fue el mayor, pregunto si es el segundo
            if (num2 > num1 && num2 > num3) {
                System.out.println("El mayor es el numero " + num2);
            } else {//si el mayor no fue el primero ni el segundo, entonces es el 3
                System.out.println("El mayor es el numero " + num3);
            }
        }
    }
}
