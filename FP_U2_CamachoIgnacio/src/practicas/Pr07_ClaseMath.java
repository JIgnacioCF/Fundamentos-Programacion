package practicas;

import java.util.Scanner;

/**
 * @author nacho 
 * calcular la potencia de 2 numeros 
 * calcular la raiz cuadrada de un numero
 */
public class Pr07_ClaseMath {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int base, exp, num;
        double potencia;
        double raiz;
        System.out.println("Valor del numero base: ");
        base = tec.nextInt();
        System.out.println("Valor del exponente: ");
        exp = tec.nextInt();
        potencia = Math.pow(base, exp);
        System.out.println("La potencia es " + potencia);
        //Raiz Cuadrada
        System.out.println("Valor para calcular la raiz cuadrada: ");
        num = tec.nextInt();
        raiz = Math.sqrt(num);
        System.out.println("La raiz es: " + raiz);
        System.out.println("El valor de pi es: " + Math.PI);
    }
}
