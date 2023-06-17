package practicas;

import java.util.Scanner;

/**
 * @author nacho el programa debe de pedir la cantidad de lapices y de libretas
 * que desea comprar. si la cantidad de la pices es mayor a 10, se le realiza un
 * descuento del 2% si la cantidad de libretas es mayor a 5, se aplica un
 * descuento del 4%
 *
 * si al calcular el total, antes de aplicar los descuentos, su compra es mayor
 * a $1,000 se le aplicara un descuento del 10% adicional
 */
public class Pr05_CompraPapeleria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantLap, cantLib;
        float preLib, preLap, subtotal, desc, total;
        //pedir datos
        System.out.println("Cuántas libretas? ");
        cantLib = sc.nextInt();
        System.out.println("Precio de las libretas? ");
        preLib = sc.nextFloat();
        System.out.println("Cuántos lapices? ");
        cantLap = sc.nextInt();
        System.out.println("Precio de los lapices? ");
        preLap = sc.nextFloat();
        //iniciar operaciones
        subtotal = (cantLap * preLap) + (cantLib * preLib);
        //Evaluar el descuento si es mayor a $1,000
        if (subtotal > 1000) {
            desc = subtotal * 0.1f;
            subtotal = subtotal - desc;
            System.out.println("tu compra fue mayor a $1000, se te aplico un descuento de  " + desc);
        }
        //Evaluamos otro descuento independiente - lapices
        if (cantLap > 10) {
            desc = subtotal * .02f;
            subtotal = subtotal - desc;
            System.out.println("compraste mas de 10 lapices, descuento de " + desc);
        }
        //Evaluamos otro descuento independiente - libretas
        if (cantLib > 5) {
            desc = subtotal * 0.04f;
            subtotal = subtotal - desc;
            System.out.println("compraste mas de 10 libretas, descuento de " + desc);
        }
        System.out.println("Su pago total es de " + subtotal);
    }
}
