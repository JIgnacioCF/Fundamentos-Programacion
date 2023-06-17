package practicas;

import java.util.Scanner;

/**
 * @author nacho pedir una temperatura en grados centigrados y mostrarla en
 * grados farenheit
 */
public class Pr08_GradosCentigrados {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float centigrados, farenheit;
        System.out.println("Temperatura en grados Centigrados: ");
        centigrados = tec.nextFloat();
        //convertir a farenheit
        farenheit = (centigrados * 1.8f) + 32;
        System.out.println("En grados Farenheit equivale a: " + farenheit);

    }
}
