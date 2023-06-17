package practicas;
import java.util.Scanner;

/**
 * 26 octubre 2020
 * @author nacho
 */
public class Practica55 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte opc = 1;
        do {
            System.out.println("1 opciín 1");
            System.out.println("2 opción 2");
            System.out.println("3 opción 3");
            System.out.println("0 Terminar");
            System.out.println("Su opcion es: ");
            opc = leer.nextByte();
            if (opc == 0) {
                System.out.println("gracias por su tiempo");
            } else {
                switch (opc) {
                    case 1: {
                        System.out.println("opcion 1 seleccionada");
                        break;
                    }
                    case 2: {
                        System.out.println("opcion 2 seleccionada");
                        break;
                    }
                    case 3: {
                        System.out.println("opcion 3 seleccionada");
                        break;
                    }
                    default:
                        System.out.println("opcion no disponible");
                }
            }
        } while (opc != 0);
    }
}
