package Practicas;
import java.util.Random;

/**
 * 18 nov 2020
 * @author nacho
 */
public class Practica5530 {

    public static void main(String[] args) {
        int arr[][] = new int[9][8];

        //para agregar valores aleatorios entre 1 y 100
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 8; n++) {
                int num = (int) Math.floor(Math.random() * 100);
                arr[m][n] = num;
            }
        }
        //para mostar el contenido
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 8; n++) {
                System.out.print(arr[m][n] + " ");
            }
            System.out.println("");
        }
    }
}
