package practicas;
import java.util.Scanner;

/**
 * 19 oct 2020
 * @author nacho
 */
public class Practica49 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int num = leer.nextInt();

        while (num != 0) {
            if (num > 0) {
                System.out.println(num + " es positivo");                
            } else {
                System.out.println(num + " es negativo");
            }
            System.out.println("ingrese un numero: ");
            num = leer.nextInt();
        }
    }
}
