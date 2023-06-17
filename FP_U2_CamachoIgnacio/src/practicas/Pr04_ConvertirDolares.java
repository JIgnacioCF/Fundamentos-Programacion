package practicas;

/**
 *
 * @author nacho Recibir una cantidad de dolares y convertirla a pesos mexicanos
 * y euros
 */
import java.util.Scanner;

public class Pr04_ConvertirDolares {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float dolares = 0, pesos = 0, euros = 0;
        System.out.println("Cantidad en dolares: ");
        dolares = tec.nextFloat();
        pesos = dolares * 21.5f;
        euros = pesos / 25.8f;
        System.out.println(dolares + " dolares, a pesos es igual a " + pesos);
        System.out.println(dolares + " dolares, a euros es igual a " + euros);
    }

}
