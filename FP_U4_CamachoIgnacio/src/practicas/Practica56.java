package practicas;
import java.util.Scanner;

/**
 * 26 octubre 2020
 * @author nacho
 */
public class Practica56 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte num = 1;
        boolean bandera = true;
        do {
            System.out.println("Ingrese un numero(1-10): ");
            num = leer.nextByte();
            if (num == 0) {
                bandera = false;
                System.out.println("Programa terminado");
            } else {
                if (num > 0 && num <= 10) {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + "x" + i + "=" + (num * i));
                    }
                    bandera = true;
                } else {
                    System.out.println("numero invalido");
                }
            }
        } while (bandera);
    }
}
