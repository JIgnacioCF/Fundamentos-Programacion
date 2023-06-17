package trabajos;

import java.util.Scanner;

/**
 * @author nacho E.U.P que Calcule el área y perímetro de un circulo, para lo
 * cual se deben pedir los datos al usuario.
 */
public class Tr02_AreayPerimetroCirculo {

    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        double rad = 0, area = 0, peri = 0;

        System.out.println("Ingresa el radio del circulo: ");
        rad = circulo.nextDouble();

        area = 3.1416 * (rad * rad);
        peri = (2 * 3.1416) * rad;

        System.out.println("El area del Circulo es " + area);
        System.out.println("El perimetro del circulo es " + peri);
    }
}
