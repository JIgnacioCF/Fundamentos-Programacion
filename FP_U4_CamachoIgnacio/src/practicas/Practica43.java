package practicas;
import java.util.Scanner;

/**
 * 14 octubre 2020
 * @author nacho
 */
public class Practica43 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor1: ");
        byte n1 = leer.nextByte();
        System.out.println("ingrese un valor2: ");
        byte n2 = leer.nextByte();
        if (n1 % 2==0 || n2 >= 10) {
            System.out.println("Se cumple condicion");
        } else {
            System.out.println("No se cumple condicion");
        }
    }
}
