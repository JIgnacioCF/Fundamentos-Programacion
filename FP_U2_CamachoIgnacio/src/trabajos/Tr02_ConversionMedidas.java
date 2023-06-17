package trabajos;

import java.util.Scanner;

/**
 * @author nacho
 *E.U.P que Pida una cantidad expresada en metros y
 * convertirla a cm, km, pies, pulgadas y yardas.
 */
public class Tr02_ConversionMedidas {

    public static void main(String[] args) {
        Scanner conver = new Scanner(System.in);
        double m = 0, cm = 0, km = 0, ft = 0, in = 0, yd = 0;

        System.out.println("Ingresa la cantidad en Metros a convertir:");
        m = conver.nextDouble();

        cm = m * 100;
        km = m / 1000;
        in = (m * 39.37) / 1;
        ft = (m * 3.281) / 1;
        yd = (m * 1.0936) / 1;

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println(m + " metros equivalen a " + cm + " Centimetros");
        System.out.println(m + " metros equivalen a " + km + " Kilometros");
        System.out.println(m + " metros equivalen a " + in + " Pulgadas");
        System.out.println(m + " metros equivalen a " + ft + " Pies");
        System.out.println(m + " metros equivalen a " + yd + " Yardas");
    }
}
