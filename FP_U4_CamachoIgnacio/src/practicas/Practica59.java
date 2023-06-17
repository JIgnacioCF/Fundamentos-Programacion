package practicas;
import java.util.Scanner;

/**
 * 04 Noviembre 2020 *
 * @author nacho
 */
public class Practica59 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3;
        int suma, mayor, menor;

        System.out.print("Ingresa un primer numero: ");
        n1 = leer.nextInt();
        System.out.print("Ingresa un segundo numero: ");
        n2 = leer.nextInt();
        System.out.print("Ingresa un tercer numero: ");
        n3 = leer.nextInt();
        suma = n1 + n2 + n3;
        System.out.println("La suma es: " + suma);

        if (n1 > n2) {
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else {
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }
        if (n1 < n2) {
            if (n1 < n3) {
                menor = n1;
            } else {
                menor = n3;
            }
        } else {
            if (n2 < n3) {
                menor = n2;
            } else {
                menor = n3;
            }
        }
        System.out.println("el mayor es: " + mayor);
        System.out.println("El menor es: "+menor);
        System.out.println(menor+", "+(suma-mayor-menor)+", "+mayor);
    }
}
