package Practicas;
import java.util.Scanner;

/**
 * 11 nov 2020
 * @author nacho
 */
public class Practica5520 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String dias[] = {"lunes", "Martes", "miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.print("Ingrese un numero 1-7: ");
        byte num = leer.nextByte();

        System.out.println(dias[num - 1]);
    }
}
