package practicas;
import java.util.Scanner;

/**
 *14 octubre 2020
 * @author nacho
 */
public class Practica41 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        byte edad = leer.nextByte();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, felicidades!");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
