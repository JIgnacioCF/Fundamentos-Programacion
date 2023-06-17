package ejercicios;
import java.util.Random;

/**
 * 25/11/2020
 * @author nacho
 */
public class Ejercicio5552 {

    public static void main(String[] args) {
        int arr1[][] = new int[4][4];
        int arr2[][] = new int[4][4];
        int arr3[][] = new int[4][4];

        //arreglo 1
        System.out.println("°°Valores de mi primer arreglo°°");
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                int num = (int) Math.floor(Math.random() * 100);
                arr1[a][b] = num;
            }
        }
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(arr1[a][b] + "\t");
            }
            System.out.println("");
        }
        //arreglo 2
        System.out.println("");
        System.out.println("°°Valores de mi segundo arreglo°°");
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                int num = (int) Math.floor(Math.random() * 100);
                arr2[a][b] = num;
            }
        }
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(arr2[a][b] + "\t");
            }
            System.out.println("");
        }
        // arreglo 3 suma
        System.out.println("");
        System.out.println("Suma resultante de mis dos arreglos");
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                arr3[a][b] = arr1[a][b] + arr2[a][b];
            }
        }
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(arr3[a][b] + "\t");
            }
            System.out.println("");
        }
    }
}
