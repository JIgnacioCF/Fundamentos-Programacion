package ejercicios;
import java.util.Scanner;

/**
 * 19 octubre 2020
 * @author nacho
 */
public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hijo ¿En qué lugar te levantaste?");
        byte lugar = leer.nextByte();
        switch (lugar) {
            case 1: {
                System.out.println("Felicidades hijo, entoces tienes "
                        + "la semana libre para descansar");
                break;
            }
            case 2: {
                System.out.println("lo lamento hijo, pero como te levantaste de "
                        + "segundo, tienes que organizar la mesa del comedor"
                        + " después de cada comida");
                break;
            }
            case 3: {
                System.out.println("hijo como fuiste el tercero en levantarse, "
                        + "te toca lavar los trastes despues de cada comida");
                break;
            }
            case 0: {
                System.out.println("hijo, ese lugar no existe");
                break;
            }
            default:
                System.out.println("lo lamento hijo pero fuiste el ultimo en"
                        + " levantarse, te toca barrer todos los dias de la semana");
        }
    }
}
