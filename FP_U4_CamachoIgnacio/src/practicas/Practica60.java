package practicas;
import java.util.Scanner;

/**
 * 28 octubre 2020
 * @author nacho
 */
public class Practica60 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        byte n1, n2, opcion = 1;
        boolean salir1 = true;
        do {
            System.out.println("Dame el primer numero: ");
            n1 = leer.nextByte();
            if (n1 < 1 || n1 > 100) {
                System.out.println("Numero invalido");
                //salir1=false;
                break;
            }
            System.out.println("Dame el segundo numero: ");
            n2 = leer.nextByte();
            if (n2 < 1 || n2 > 100) {
                System.out.println("Numero invalido");
                break;
            }
            System.out.println("1. Sumar n1+n2");
            System.out.println("2. Restar n1-n2");
            System.out.println("3. Multiplicación n1*n2");
            System.out.println("4. División  n1/n2");
            System.out.println("0. Terminar");
            System.out.print("opcion: ");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1: {
                    System.out.println("La suma de n1+n2= " + (n1 + n2));
                    break;
                }
                case 2: {
                    System.out.println("La resta de n1-n2= " + (n1 - n2));
                    break;
                }
                case 3: {
                    System.out.println("La multiplicación de n1xn2= " + (n1 * n2));
                    break;
                }
                case 4: {
                    System.out.println("La división de n1/n2= " + (n1 / n2));
                    break;
                }
                case 0: {
                    salir1 = false;
                    break;
                }
                default:
                    System.out.println("Opción invalida!!");
            }

        } while (salir1 == true);
        System.out.println("Programa finalizado!!");
    }
}
