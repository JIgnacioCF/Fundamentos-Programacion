package ejercicios;
import java.util.Scanner;

/**
 * 08 Noviembre 2020
 * @author nacho
 */
public class Ejercicio57 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Tamaño del cuadrado: ");
        int cuadro = leer.nextInt();
        if (cuadro > 0) {
            for (int i = 0; i < cuadro; i++) {
                for (int j = 0; j < cuadro; j++) {
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("El numero debe ser mayor a cero!!");
        }
    }
}
