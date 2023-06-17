package practicas;
import java.util.Scanner;
/**
 *14 de octubre 2020
 * @author nacho
 */
public class Practica42 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int num= leer.nextInt();
        if (num%3==0) {
            System.out.println("el numero "+num+" es divisible por 3");
        }else{
            System.out.println("el numero "+num+"  No es divisible por 3");
            System.out.println("hola");
        }
    }
}
