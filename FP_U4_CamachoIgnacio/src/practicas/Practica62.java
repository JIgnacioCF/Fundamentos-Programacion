package practicas;
import java.util.Scanner;

/**
 * 28 octubre 2020
 * @author nacho
 */
public class Practica62 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int t1, t2;

        System.out.print("ingrese un numero: ");
        t1 = leer.nextInt();
        System.out.print("Indique el exponente: ");
        t2 = leer.nextInt();

        System.out.println("El resultado es " + Exponente(t1, t2));

    }

    public static long Exponente(int a1, int b1) {
        //a1 es el numero y b1 será el exponente
        long resultado = a1;
        for (int z = 1; z < b1; z++) {
            resultado = resultado * a1;
        }
        return resultado;
    }
}
