package ejercicios;
import java.util.Scanner;

/**
 * 27 octubre 2020
 * @author nacho
 */
public class Ejercicio60 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte menu = 1;

        System.out.println("Ingresa el primer numero(1-100)");
        int n1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero(1-100)");
        int n2 = leer.nextInt();

        if (n1 > 0 && n2 > 0 && n1 <= 100 && n2 <= 100) {
            do {
                System.out.println("°°°°°°°°°°°°Menu°°°°°°°°°°°°");
                System.out.println("Presione 1.-Suma");
                System.out.println("Presione 2.-Resta");
                System.out.println("Presione 3.-Multiplicación");
                System.out.println("Presione 4.-División");
                System.out.println("Presione 0.-Terminar");
                System.out.println("-*-*-*-*-*-*-*-");
                System.out.print("Su opcion es: ");
                menu = leer.nextByte();
                if (menu == 0) {
                    System.out.println("¡PROGRAMA TERMINADO!");
                } else {
                    switch (menu) {
                        case 1: {
                            System.out.println("La suma es: " + (n1 + n2));
                            break;
                        }
                        case 2: {
                            System.out.println("La resta es: " + (n1 - n2));
                            break;
                        }
                        case 3: {
                            System.out.println("La multiplicacion es: " + (n1 * n2));
                            break;
                        }
                        case 4: {
                            System.out.println("La división es: " + (n1 / n2));
                            break;
                        }
                        default:
                            System.out.println("Opción incorrecta");
                    }
                }
            } while (menu != 0);
        } else {
            System.out.println("¡¡Error!! los numeros deben de ser mayor a 0 y menor igual a 100");
        }
    }
}
