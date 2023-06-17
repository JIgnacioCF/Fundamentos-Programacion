package practicas;

/**
 *
 * @author nacho
 */
//libreria
import java.util.Scanner;

public class Pr03_OperacionesBasicas {

    //MEtodo principal
    public static void main(String[] args) {
        //crear objeto de lectura
        Scanner teclado = new Scanner(System.in);
        //variables
        int num1 = 0, num2 = 0, suma = 0, rest = 0, mult = 0, div = 0, residuo = 0;
        //PEdir datos
        System.out.println("Numero1: ");
        num1 = teclado.nextInt();
        System.out.println("Num2: ");
        num2 = teclado.nextInt();
        //Realizamos operaciones
        suma = num1 + num2;
        rest = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        residuo = num1 % num2;
        //impresiones
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + rest);
        System.out.println("La multiplicacion es " + mult);
        System.out.println("La divicion es " + div);
        System.out.println("El residuo de la divicion es " + residuo);
    }
}
