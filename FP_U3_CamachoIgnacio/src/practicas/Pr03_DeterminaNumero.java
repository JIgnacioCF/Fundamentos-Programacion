package practicas;

/**
 *
 * @author nacho
 */
import java.util.Scanner;

public class Pr03_DeterminaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingresa un Numero: ");
        num = sc.nextInt();
        if (num > 0) {//pregunta si es mayor a 0
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {//si no fue positivo ni negativo, entonces es neutro
            System.out.println("El numero es neutro");
        }
    }
}
