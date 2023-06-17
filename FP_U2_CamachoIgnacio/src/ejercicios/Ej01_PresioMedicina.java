package ejercicios;

import java.util.Scanner;

/**
 * @author nacho pedir el nombre de un medicamento 
 * pedir el precio 
 * aumentarle el 16% del IVA 
 * aplicar el descuento de medicamento del 30% 
 * imprimir el desglose de todos los calculos 
 * Nombre, costo, Subtotal con IVA, total con descuento
 */
public class Ej01_PresioMedicina {

    public static void main(String[] args) {
        Scanner farmacia = new Scanner(System.in);
        String medicamento;
        double precio, subtotal, total, desc;
        System.out.println("medicamento: ");
        medicamento = farmacia.nextLine();
        System.out.println("Precio: ");
        precio = farmacia.nextDouble();

        subtotal = precio + (precio * 0.16);
        desc = subtotal * 0.3;
        total = subtotal - desc;

        System.out.println("°°°°°°°°FARMACIA NACHO°°°°°°°°");
        System.out.println("\t><>Desglose<><");
        System.out.println("Usted compro: " + medicamento);
        System.out.println("Su precio es de: $" + precio + " pesos");
        System.out.println("El Precio con el IVA incluido es de: $" + subtotal + " pesos");
        System.out.println("El descuento aplicado es de: $" + desc + " pesos");
        System.out.println("Su total a pagar es: $" + total + " pesos");
    }
}
