package ejercicios;
import java.util.Scanner;

/**
 * 25/11/2020
 * @author nacho
 */
public class Ejercicio5551 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arr1[] = new int[10];
        int num, suma = 0, media=0;

        for (int i = 0; i < 10; i++) {
            System.out.print("ingresa el valor " + i + " del arreglo: ");
            num = leer.nextInt();
            arr1[i] = num;
            suma = suma + arr1[i];
            media = suma / 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("");
        System.out.println("la suma total del arreglo es: " + suma);
        System.out.println("La media es: " + media);
    }
}
