package practicas;

import java.util.Scanner;

/**
 * @author nacho Pedir la cantidad de productos Pedir el costo de los productos
 * calcular el total aplicar el descuento del 3%
 */
public class Pr06_Venta {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cant;
        float precio, subtotal, desc;
        double total;
        System.out.println("Cantidad de Productos");
        cant = tec.nextInt();
        System.out.println("Precio de los productos: ");
        precio = tec.nextFloat();
        //calcular subtotal
        subtotal = cant * precio;
        //calcular descuento
        desc = subtotal * 0.03f;
        //Calcular total
        total = subtotal - desc;
        //imprimir
        System.out.println("El subtotal es de " + subtotal);
        System.out.println("El descuento aplicado es de " + desc);
        System.out.println("El total a pagar es de " + total);
    }
}
