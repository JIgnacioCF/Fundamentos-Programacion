package trabajos;

/**
 * @author nacho E.U.P que calcule el área y perímetro de un triangulo, para lo
 * cual se deben pedir los datos al usuario.
 */
import java.util.Scanner;

public class Tr02_AreayPerimetroTriangulo {

    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        double alt = 0, base = 0, area = 0, peri = 0, lado1 = 0, lado2 = 0, lado3 = 0;
        System.out.println("+-+-+-+-+-DATOS DEL AREA+-+-+-+-+-+-+-+");
        System.out.println("Ingresa la altura del triangulo:");
        alt = triangulo.nextDouble();
        System.out.println("Ingresa la base del triangulo:");
        base = triangulo.nextDouble();
        System.out.println("+-+-+-+-+-DATOS DEL PERIMETRO+-+-+-+-+-+");
        System.out.println("Dame el lado 1 del triangulo");
        lado1 = triangulo.nextDouble();
        System.out.println("Dame el lado 2 del triangulo");
        lado2 = triangulo.nextDouble();
        System.out.println("Dame el lado 3 del triangulo");
        lado3 = triangulo.nextDouble();

        area = (base * alt) / 2;
        peri = lado1 + lado2 + lado3;

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + peri);

    }
}
