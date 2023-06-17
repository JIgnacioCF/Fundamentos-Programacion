package practicas;

/**
 * @author nacho pedir nombre, edad y genero si es menor de edad, que disfrute
 * que no tiene obligaciones si es mayor de edad, debe tener su INE pero si es
 * hombre, tambien debe tener cartilla militar
 */
import java.util.Scanner;

public class Pr02_EdadGenero {

    public static void main(String[] args) {
        //objeto de lectura
        Scanner tec = new Scanner(System.in);
        //variables
        String nombre, genero;
        int edad;
        //pedir los datos
        System.out.println("Nombre del usuario: ");
        nombre = tec.nextLine();
        System.out.println("Genero (H/M): ");
        genero = tec.nextLine();
        System.out.println("Edad");
        edad = tec.nextInt();

        //Evaluar datos
        if (edad >= 18) {
            System.out.println("Debes contar o haber tramitado tu INE");
            if (genero.equals("H")) {
                System.out.println("Debes tener o haber tramitado tu cartilla militar");
            }
        } else {
            System.out.println("Disfruta, aun no tienes obligaciones");
        }
    }
}
