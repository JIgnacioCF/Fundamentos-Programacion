package practicas;

/**
 * 11 nov 2020
 *
 * @author nacho
 */
public class Practica58 {

    public static void main(String[] args) {
        for (int x5 = 0; x5 < 10; x5++) {
            for (int x4 = 0; x4 < 10; x4++) {
                for (int x3 = 0; x3 < 10; x3++) {
                    for (int x2 = 0; x2 < 10; x2++) {
                        for (int x1 = 0; x1 < 10; x1++) {
                            if (x1 == 3) {
                                System.out.println(x5 + "-" + x4 + "-" + x3 + "-" + x2 + "E");
                            } else {
                                System.out.println(x5 + "-" + x4 + "-" + x3 + "-" + x2 + "-" + x1);
                            }
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }
}
