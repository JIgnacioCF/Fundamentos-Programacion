package practicas;
import java.util.Scanner;

/**
 * 26 octubre 2020
 * @author nacho
 */
public class Practica54 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 1;

        System.out.print("¿Cuántos numeros deseas generar?: ");
        int num = leer.nextInt();

        do {
            System.out.print(c + " ");
            c++;
        } while (c <= num);
        System.out.println("");
    }
}
