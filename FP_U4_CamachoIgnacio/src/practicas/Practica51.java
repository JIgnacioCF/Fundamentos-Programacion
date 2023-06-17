package practicas;
import java.util.Scanner;
/**
 *21 octubre 2020
 * @author nacho
 */
public class Practica51 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num, suma=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("ingrese un numero: ");
            num=leer.nextInt();
            suma= suma+num;
        }
        System.out.println("la suma total es: "+suma);
    }
}
