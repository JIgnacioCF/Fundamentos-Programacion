package practicas;
import java.util.Scanner;
/**
 * 28 octubre 2020
 * @author nacho
 */
public class Practica61 {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       int num1, num2, num3;
       
        System.out.println("Ingrese Numero 1: ");
        num1= leer.nextInt();
        System.out.println("Ingrese Numero 2: ");
        num2= leer.nextInt();
        
       MetodoSuma(num1, num2);
        
       System.out.println("Ingrese un Numero 3: ");
       num3=leer.nextInt();
       
        System.out.println("El cubo del numero "+num3+
                " es "+FuncionCubica(num3));
        
        int ope= num1+num2+FuncionCubica(10);
        System.out.println(ope);    
       
    }
    //Este es un metodo, no regresa un valor
    public static void MetodoSuma(int m1, int m2) {
        int suma=m1+m2;
        System.out.println("Utilizando un METODO");
        System.out.println("La suma es "+suma);
    }
    //esta es una FUNCION y regresa el cubo de un numero
    public static int FuncionCubica(int z1) {
        System.out.println(" Utilizando una FUNCION");
        int p1=z1*z1*z1;
        return p1;
    }
}
