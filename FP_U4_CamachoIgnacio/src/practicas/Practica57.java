package practicas;
import java.util.Scanner;
/**
 *11 noviembre 2020
 * @author nacho
 */
public class Practica57 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);        
        int num;
        
        System.out.print("Dame el numero de elementos: ");
        num= leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
               System.out.print(" O "); 
            }   
            System.out.println("");
        }
        System.out.println("");
    }
}
