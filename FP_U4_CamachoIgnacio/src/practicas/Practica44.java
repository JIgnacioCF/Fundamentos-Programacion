package practicas;
import java.util.Scanner;
/**
 *14 octubre 2020
 * @author nacho
 */
public class Practica44 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese un numero 1-7: ");
        byte dia=leer.nextByte();
        switch(dia){
            case 1:{
                System.out.println("El dia es Lunes");
                break;
            }
            case 2:{
                System.out.println("El dia es Martes");
                break;
            }
            case 3:{
                System.out.println("El dia es Miercoles");
                break;
            }
            case 4:{
                System.out.println("El dia es Jueves");
                break;
            }
            case 5:{
                System.out.println("El dia es Viernes");
                break;
            }
            case 6:{
                System.out.println("El dia es Sabado");
                break;
            }
            case 7:{
                System.out.println("El dia es Domingo");
                break;
            }
            default:
                System.out.println("No existe ese dia");
        }
    }
}
