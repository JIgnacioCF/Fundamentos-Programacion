package practicas;

/**
 * @author nacho este programa va a pedir al usuario un nobre, una materia y 3
 * calificaciones.Debera determinar el promedio y determinar si el alumno
 * aprueba en periodo regular o presenta periodo de recuperacion. Si presenta
 * periodo de rerecuperacion debe preguntar la calificicacion obtenida en dicho
 * periodo. Y si no aprueba debe indicar que repetira la materia. considera que
 * una materia se aprueba si es mayor o igual a 70
 */
import java.util.Scanner;

public class Pr01_Promedio {

    public static void main(String[] args) {
        //crear objeto para leer
        Scanner tec = new Scanner(System.in);
        //Declarar variables
        String alumno, materia;
        float cal1, cal2, cal3, prom, recupera;

        //pedir los datos
        System.out.println("Nombre alumno: ");
        alumno = tec.nextLine();
        System.out.println("Materia: ");
        materia = tec.nextLine();
        System.out.println("Calificacion del parcial 1: ");
        cal1 = tec.nextFloat();
        System.out.println("Calificacion del parcial 2: ");
        cal2 = tec.nextFloat();
        System.out.println("Calificacion del parcial 3: ");
        cal3 = tec.nextFloat();

        //iniciar operaciones
        prom = (cal1 + cal2 + cal3) / 3;
        //iniciar comparaciones
        if (prom >= 70) {
            System.out.println(alumno + " aprobaste " + materia + " con promedio de " + prom);
        } else {
            System.out.println(alumno + " deberas presentar periodo de recuperacion...");
            System.out.println("Calificacion de recuperacion?: ");
            recupera = tec.nextFloat();
            if (recupera >= 70) {
                System.out.println(alumno + " aprobaste en recuperacion " + materia + " con calificacion de " + recupera);
            } else {
                System.out.println(alumno + " al no aprobar " + materia + " deberas repetir la materia");
            }
        }

    }
}
