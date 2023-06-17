package trabajos;

import java.util.Scanner;

/**
 * @author nacho
 * E.U.P que pida al usuario la cantidad de horas que trabajo a la semana.
 *Pedir el pago que percibe por hora.
 *Calcular el subtotal de su salario.
 *Aplicar un bono del 10%, por apoyo debido a la pandemia.
 *Aplicar un descuento del 10% por ISR.
 *Aplicar un descuento del 5% para el fondo de retiro
 *Aplicar un descuento del 8% por infonavit
 *Imprimir el desglose de todos los descuentos
 *subtotal y total del salario del empleado.
 */
public class Tr03_HorasySalario {

    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);

        double salario = 0, bono = 0, isr = 0, retiro = 0;
        double infonavit = 0, pesos = 0, subtotal = 0;
        int hrs = 0;
        System.out.println("¡Hola!¿Cuántas horas trabajaste a la semana?");
        hrs = money.nextInt();
        System.out.println("¿Cuanto te pagan por hora?");
        pesos = money.nextDouble();

        subtotal = hrs * pesos;
        bono = subtotal * 0.1;
        isr = subtotal * 0.1;
        retiro = subtotal * 0.05;
        infonavit = subtotal * 0.08;
        salario = subtotal + bono - isr - retiro - infonavit;

        System.out.println("°°°°°°°°°°°DESGLOSE°°°°°°°°°°°");
        System.out.println("El Subtotal de tu sueldo seria: $" + subtotal + " pesos");
        System.out.println("+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+||+|+");
        System.out.println("Bono por covid: $" + bono + " pesos");
        System.out.println("+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+||+|+");
        System.out.println("Descuento por ISR: $" + isr + " pesos");
        System.out.println("+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+||+|+");
        System.out.println("Descuento para el fondo del retiro: $" + retiro + " pesos");
        System.out.println("+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+||+|+");
        System.out.println("Descuento por infonavit: $" + infonavit + " pesos");
        System.out.println("+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+||+|+");
        System.out.println("Tu salario final es de: $" + salario + " pesos");
    }
}
