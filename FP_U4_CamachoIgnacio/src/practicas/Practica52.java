package practicas;
import java.util.Scanner;

/**
 * 21 octubre 2020 *
 * @author nacho
 */
public class Practica52 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Antes " + i);
            if (i == 2) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println("Despues " + i);
        }
    }
}
