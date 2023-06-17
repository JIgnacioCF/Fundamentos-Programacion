package ejercicios;
import java.util.Scanner;
/**
 *19 octubre 2020
 * @author nacho
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
               
        System.out.println("¿Cuál es su nombre?: ");
        String nom= leer.nextLine();
        System.out.println("¿Cuál es su edad?: ");
        int edad= leer.nextInt();
        System.out.println("¿Cuál es su estatura?: ");        
        double estatura = leer.nextDouble();
        System.out.println("¿Cuánto pesa?: ");
        int kg= leer.nextInt();
       
        if (estatura>=1.80 || kg>=80) {
            System.out.println("su nombre es "+nom);
            System.out.println("y tiene "+edad+" años");
        }else{
            System.out.println("Error 404!");
        }
    }
}
