package Practicas;
import java.util.Scanner;
import java.util.Random;

/**
 * 18 nov 2020
 * @author nacho
 */
public class Practica5550 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte filas, columnas;

        System.out.print("Filas: ");
        filas = leer.nextByte();
        System.out.print("Columnas: ");
        columnas = leer.nextByte();

        //genera el arreglo con valores aleatorios
        int arreglo[][] = new int[filas][columnas];
        for (int m = 0; m < filas; m++) {
            for (int n = 0; n < columnas; n++) {
                int xx = (int) Math.floor(Math.random() * 100);
                arreglo[m][n] = xx;
            }
        }
        //Muestra el arreglo
        for (int m = 0; m < filas; m++) {
            for (int n = 0; n< columnas; n++) {
                System.out.print(arreglo[m][n] + "\t");
            }
            System.out.println("");
        }
    }
}
