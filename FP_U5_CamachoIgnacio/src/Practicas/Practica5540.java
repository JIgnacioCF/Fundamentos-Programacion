package Practicas;
import java.util.Random;

/**
 * 18 nov 2020
 * @author nacho
 */
public class Practica5540 {

    public static void main(String[] args) {
        int arr1[][] = new int[4][4];
        int arr2[] = new int[4];
        int suma;

        //generar el arreglo con los numeros aleatorios
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                int num = (int) Math.floor(Math.random() * 10);
                arr1[j][k] = num;
            }
        }

        //muestra el contenido del arreglo
        for (int j = 0; j < 4; j++) {
            suma = 0;
            for (int k = 0; k < 4; k++) {
                System.out.print(arr1[j][k] + "\t");
                suma = suma + arr1[j][k];
            }
            arr2[j] = suma;
            System.out.print("\t total: " + arr2[j]);
            System.out.println("");
        }
    }
}
