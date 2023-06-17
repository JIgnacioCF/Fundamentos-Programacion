package Practicas;
import java.util.Scanner;
/**
 *11 nov 2020
 * @author nacho
 */
public class Practica5510 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int arreglo[]= new int[10];
        //muestra los calores del arreglo
        for (int m = 0; m < 10; m++) {
            System.out.print("Ingrese un valor "+ m+ ": ");
            arreglo[m]=leer.nextInt();
        }
        //muestra el contenido del arreglo
        for (int t = 0; t < 10; t++) {
            System.out.print(arreglo[t]+"   ");
        }
        System.out.println("");
    }
}
