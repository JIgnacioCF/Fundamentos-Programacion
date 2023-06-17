package practicas;
import java.util.Scanner;

/**
 * 19 octubre 2020
 * @author nacho
 */
public class Practica47 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 1;//variable contador
        System.out.println("Ingrese un numero entero positivo: ");
        int n1 = leer.nextInt();
        while (c <= n1) {
            if (c < n1) {
                System.out.print(c + ", ");
            } else {
                System.out.print(c + " ");
            }
            c++;
        }
    }
}
