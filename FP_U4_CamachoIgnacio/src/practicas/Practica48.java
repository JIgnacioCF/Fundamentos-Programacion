package practicas;
import java.util.Scanner;

/**
 * 19 oct 2020
 * @author nacho
 */
public class Practica48 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 1;// la variable c es un contador
        int suma = 0;//la variable suma es un acumulador
        boolean cond=true;//la variable cond es una bandera

        System.out.println("Ingrese un numero entero positivo: ");
        int n1 = leer.nextInt();

        while (cond) {
            System.out.print(c + "  ");
            suma = suma + c;
            c++;
            System.out.print("Deseas continuar? (1/si 2/no): ");
            byte resp=leer.nextByte();
            if (resp==2) {
                cond=false;
            }
        }
        System.out.println("");
        System.out.println("la suma total es: " + suma);
    }
}
