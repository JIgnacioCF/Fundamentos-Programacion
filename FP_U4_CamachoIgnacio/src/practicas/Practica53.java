package practicas;
import java.util.Scanner;

/**21 octubre 2020
 * @author nacho
 */
public class Practica53 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int n1 = leer.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }
    }
}
