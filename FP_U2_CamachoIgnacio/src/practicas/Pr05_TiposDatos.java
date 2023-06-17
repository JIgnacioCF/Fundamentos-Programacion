package practicas;

import java.util.Scanner;

/**
 * @author nacho
 */
public class Pr05_TiposDatos {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nombre;
        String gen;
        int edad;
        float peso, altura;
        double alturaPulgada;
        long tiempoVida;
        //pedir los datos
        System.out.println("Nombre: ");
        nombre = tec.nextLine();
        System.out.println("Genero(M/F): ");
        gen = tec.next();
        System.out.println("Edad: ");
        edad = tec.nextInt();
        System.out.println("Peso: ");
        peso = tec.nextFloat();
        System.out.println("Altura en cm: ");
        altura = tec.nextFloat();
        //Vamos a calcular los datos que hacen falta
        //Debemos convertir la altura a a pulgadas
        alturaPulgada = (altura / 2.54);
        //Debemos de calcular los segundos de vida que tiene la persona 
        //Deacuerdo a su edad
        tiempoVida = (edad * 365 * 24 * 60 * 60);
        //            años  dias  hrs   min  seg
        //imprimir los datos
        System.out.println(nombre + " es de genero " + gen);
        System.out.println("pesa " + peso + " kilogramos");
        System.out.println("Mide " + altura + " en cm, y en pulgadas " + alturaPulgada);
        System.out.println("Tiene " + edad + " años, equivalen a " + tiempoVida + " seg");

    }
}
