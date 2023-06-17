package practicas;

import java.util.Scanner;

/**
 * @author nacho 
 * este programa debe calcular el indicie de masa corporal y
 * mostrar el diagnostico al usuario. se debe pedir peso en Kg pedir estatura en
 * metros. formula (kg/mts2)
 */
public class Pr08_IMC {

    public static void main(String[] args) {
        //Declaracion
        Scanner sc = new Scanner(System.in);
        float peso, altura;
        double imc = 0;
        //pedir datos
        System.out.println("peso en Kg: ");
        peso = sc.nextFloat();
        System.out.println("Altura en metros: ");
        altura = sc.nextFloat();
        //aplicar la formula
        imc = peso / (altura * altura);
        //ahora indicar los diagnosticos, deacuerdo al valor del imc
        if (imc < 18.5) {
            System.out.println("Tiene bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tienes peso normal");
        } else if (imc >= 25 && imc < 27) {
            System.out.println("Sobrepeso grado 1");
        } else if (imc >= 27 && imc < 30) {
            System.out.println("Sobrepeso grado 2");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad grado 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("obesidad grado 2");
        } else if (imc >= 40 && imc < 50) {
            System.out.println("obesidad grado 3(morbida)");
        } else if (imc >= 50) {
            System.out.println("obesidad grado 4(estrema)");
        }
    }
}
