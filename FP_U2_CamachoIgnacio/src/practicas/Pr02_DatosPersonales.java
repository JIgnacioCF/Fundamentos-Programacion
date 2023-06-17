package practicas;

/**
 *
 * @author nacho 
 * este programa pedira al usuario sus datos personales y los debe
 * imprimir en pantalla.
 */
//antes de la clase se importan las librerias
//una libreria es una clase de java, que ay tiene codigo o instrucciones
//precargadas, para que el usuario las emplee.
import java.util.Scanner;//esta es la libreria

public class Pr02_DatosPersonales {

    public static void main(String[] args) {
        //siguiendo la estructura de un programa, debemos de definir variables
        //nombre, genero, direccion, edad, telefono.
        String nombre = "", genero = "", direccion = "", tel = "";
        int edad = 0;//poner "" o un 0, se llama inicializar variables
        //las variables se inicializan para evitar errores con valores null
        //vamos a crear un objeto para leer los datos del teclado
        Scanner teclado = new Scanner(System.in);
        //pedir los valores al usuario
        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Direccion actual: ");
        direccion = teclado.nextLine();
        System.out.println("Genero (Masculino/Femenino): ");
        genero = teclado.nextLine();
        System.out.println("Telefono: ");
        tel = teclado.nextLine();
        System.out.println("Edad: ");
        edad = teclado.nextInt();
        //vamos a imprimir los datos personales
        System.out.println("|---------------------------------------------------------|");
        System.out.println("                DATOS DEL USUARIO: ");
        System.out.println("+---------------------------------------------------------+");
        System.out.println("Me llamo " + nombre);
        System.out.println("+---------------------------------------------------------+");
        System.out.println("Vivo en " + direccion);
        System.out.println("+----------------------------------------------------------+");
        System.out.println("Soy de genero " + genero);
        System.out.println("+----------------------------------------------------------+");
        System.out.println("Mi numero de telefono es " + tel);
        System.out.println("+----------------------------------------------------------+");
        System.out.println("Tengo " + edad + " años");
        System.out.println("|----------------------------------------------------------|");
    }
}
