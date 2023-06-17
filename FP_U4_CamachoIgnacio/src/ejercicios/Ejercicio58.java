package ejercicios;

/**
 * 08 Noviembre 2020
 * @author nacho
 */
public class Ejercicio58 {

    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            if (i < 10) {
                if (i == 3) {
                    System.out.println("0000E");
                } else {
                    System.out.println("0000" + i);
                }
            } else if (i >= 10 && i < 100) {
                System.out.println("000" + i);
            } else if (i >= 100 && i < 1000) {
                System.out.println("00" + i);
            } else if (i >= 1000 && i < 10000) {
                System.out.println("0" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
